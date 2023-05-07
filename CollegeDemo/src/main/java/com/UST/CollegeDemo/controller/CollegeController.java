package com.UST.CollegeDemo.controller;

import com.UST.CollegeDemo.entity.College;
import com.UST.CollegeDemo.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colleges")
public class CollegeController {
    @Autowired
    private CollegeService collegeService;

    @PostMapping
    public College addCollegeDetails(@RequestBody College college){
        return collegeService.addCollegeDetails(college);
    }

    @GetMapping("/get")
    public List<College> getAllCollegeDetails(){
        return collegeService.getAllCollegeDetails();
    }

    @GetMapping("/getby/{id}")
    public College getById(@PathVariable Integer id){
        return collegeService.getById(id);
    }

    @PutMapping
    public  College update(@RequestBody College college){
        return collegeService.update(college);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        return collegeService.delete(id);
    }
}
