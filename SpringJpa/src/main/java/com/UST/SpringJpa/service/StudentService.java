package com.UST.SpringJpa.service;

import com.UST.SpringJpa.entity.Student;
import com.UST.SpringJpa.entity.Student$;
import com.UST.SpringJpa.repository.StudentRepo;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private JPAStreamer jpaStreamer;

    public List<Student> saveStudents(List<Student> student) {

            return studentRepo.saveAll(student);
        }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Long getStudentCountForCourses(List<String> course) {
        return jpaStreamer.stream(Student.class)
                .flatMap(student -> student.getCourses().stream())
                .filter(courses -> course.contains(courses))
                .distinct()
                .count();
    }

    public List<Student> getAdd(String address) {
        return jpaStreamer.stream(Student.class)
                .filter(Student$.address.equal(address))
                .collect(Collectors.toList());
    }
}

//
//
//    public List<Student> getStudentByCourse(List<Student> course) {
//        return jpaStreamer.stream(Student.class)
//                .filter(Student$.courses.equal(course))
//                .collect(Collectors.toList());
//    }


