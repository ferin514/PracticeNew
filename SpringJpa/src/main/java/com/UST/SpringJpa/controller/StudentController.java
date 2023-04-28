package com.UST.SpringJpa.controller;

import com.UST.SpringJpa.entity.Student;
import com.UST.SpringJpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public List<Student> saveStudents(@RequestBody List<Student> student){
        return studentService.saveStudents(student);
    }
    @GetMapping("/get")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("getaddress/{address}")
    public List<Student> getList(@PathVariable String address) {
        return studentService.getAdd(address);
    }
//    @GetMapping("/get/{courses}")
//    public List<Student> getStudentsByCourse(@PathVariable List<Student> course) {
//
//        return studentService.getStudentByCourse(course);
//    }
@GetMapping("/students/{course}")
public Long getStudentCountForCourses(@RequestParam List<String> course) {

    return studentService.getStudentCountForCourses(course);

}


}
