package com.UST.StudentDepartment.controller;

import com.UST.StudentDepartment.entity.Department;
import com.UST.StudentDepartment.entity.Student;
import com.UST.StudentDepartment.repository.DepartmentRepo;
import com.UST.StudentDepartment.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hi")
public class CommonController {
    @Autowired
    private DepartmentRepo departmentRepo;
    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/addstudent")
    public ResponseEntity<Student>addStudent(@RequestBody Student student){
        return ResponseEntity.ok().body(studentRepo.save(student));
    }
    @PostMapping("/adddept")
    public ResponseEntity<Department>addDepartment(@RequestBody Department department){
        return ResponseEntity.ok().body(departmentRepo.save(department));
    }
    @GetMapping("/get")
    public ResponseEntity<List<Student>>getStudent(){
        return ResponseEntity.ok().body(studentRepo.findAll());
    }
    @GetMapping("/gets")
    public ResponseEntity<List<Department>>getDepartment(){
        return ResponseEntity.ok().body(departmentRepo.findAll());
    }
    @GetMapping("/getstudent/{id}")
    public ResponseEntity<Student>getStudentById(@PathVariable Integer id){
        return ResponseEntity.ok().body(studentRepo.findById(id).orElse(null));
    }
    @GetMapping("/getdepart/{id}")
    public ResponseEntity<Department>getDepartmentById(@PathVariable Integer id) {
        Optional<Department> department2 = departmentRepo.findById(id);
        if (department2.isPresent()) {
            return ResponseEntity.ok().body(departmentRepo.findById(id).orElse(null));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String>deleteStudentById(@PathVariable Integer id){
        studentRepo.deleteById(id);
        return ResponseEntity.ok().body("deleted");
    }
    @DeleteMapping("/deletedept/{id}")
    public ResponseEntity<String>deleteDepartmentById(@PathVariable Integer id){
        departmentRepo.deleteById(id);
        return ResponseEntity.ok().body("deleted");
    }
    @PutMapping("/updatestudent/{id}")
    public ResponseEntity<Student>updateByStudentId(@RequestBody Student student,@PathVariable Integer id) {
        Student old = null;
        Optional<Student> students = studentRepo.findById(student.getId());
        if (students.isPresent()) {
            old = students.get();
            old.setId(id);
            old.setName(student.getName());
            studentRepo.save(old);
            return ResponseEntity.ok().body(old);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
    @PutMapping("/updatedepartment/{id}")
    public ResponseEntity<Department>updateByDepartmentId(@RequestBody Department department,@PathVariable Integer id) {
        Department old = null;
        Optional<Department> department1 = departmentRepo.findById(department.getId());
        if (department1.isPresent()) {
            old = department1.get();
            old.setId(id);
            old.setDepname(department.getDepname());
            departmentRepo.save(old);
            return ResponseEntity.ok().body(old);


        } else {
            return ResponseEntity.noContent().build();
        }
    }

}
