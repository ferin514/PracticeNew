package com.UST.SamplePractice.service;

import com.UST.SamplePractice.entity.Student;
import com.UST.SamplePractice.exception.StudentIdNotFound;
import com.UST.SamplePractice.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student addAllStudents(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getAllStudentById(Long id) {

        Optional<Student> s = studentRepo.findById(id);
        if (s.isEmpty()) {
            throw new StudentIdNotFound("student with id :" + id + "doesn't exist");

        }else{
            return(s.get());
        }

    }

    public String deleteById(Long id) {
        return "deleted";
    }

    public Student updateById(Student student) {
        Student old = null;
        Optional<Student> students = studentRepo.findById(student.getId());
//        if(students.isEmpty()){
//            throw new IdNotFound("id not found");
//        }
        if (students.isPresent()) {
            old = students.get();
            old.setName(student.getName());
            studentRepo.save(old);
        } else {
            return new Student();
        }
        return old;
    }
}

