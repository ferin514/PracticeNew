package com.UST.SamplePractice.controller;

import com.UST.SamplePractice.entity.Course;
import com.UST.SamplePractice.entity.Student;
import com.UST.SamplePractice.repository.CourseRepo;
import com.UST.SamplePractice.repository.StudentRepo;
//import com.UST.SamplePractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private CourseRepo courseRepo;
    @PostMapping("/add")
    public Student addAllStudents(@RequestBody Student student){
        return studentRepo.save(student);
    }
    @GetMapping("/get")
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable Long id){

        return studentRepo.findById(id).orElse(null);
    }
    @PostMapping("/addcourse")
    public Course addAllCourses(@RequestBody Course course){
        return courseRepo.save(course);
    }
    @GetMapping("/getcourse")
    public List<Course> getAllCourses(){
        return courseRepo.findAll();
    }
    @GetMapping("/getcourses/{id}")
    public Course getCourseById(@PathVariable Integer id){

        return courseRepo.findById(id).orElse(null);
    }
//    @DeleteMapping("/delete/{id}")
//    public String deleteById(@PathVariable Long id){
//        return studentService.deleteById(id);
//    }
//    @PutMapping("/put")
//    public Student updateById(@RequestBody Student student){
//        return studentService.updateById(student);
//    }

}
