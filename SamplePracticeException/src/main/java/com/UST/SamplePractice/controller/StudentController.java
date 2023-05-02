package com.UST.SamplePractice.controller;

import com.UST.SamplePractice.entity.Student;
import com.UST.SamplePractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public Student addAllStudents(@RequestBody Student student){
        return studentService.addAllStudents(student);
    }
    @GetMapping("/get")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getAllStudentById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id){
        return studentService.deleteById(id);
    }
    @PutMapping("/put")
    public Student updateById(@RequestBody Student student){
        return studentService.updateById(student);
    }

}
