package com.UST.RealEstate.controller;

//import com.UST.RealEstate.entity.Company;
//import com.UST.RealEstate.service.CompanyService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;

import com.UST.RealEstate.entity.Company;
import com.UST.RealEstate.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/get/{zipcode}")
    public List<Company> getByZipCode(@PathVariable Double zipcode){
        return companyService.getByZipCode(zipcode);
    }
    @GetMapping("/getstate/{state}")
    public List<Company>getByState(@PathVariable String state){
        return companyService.getByState(state);
    }
    @GetMapping("/getcity/{city}")
    public List<Company>getByCity(@PathVariable String city){
        return companyService.getByCity(city);
    }
    @GetMapping("/getprice/{price}")
    public List<Company>getByPrice(@PathVariable Double price){
        return companyService.getByPrice(price);
    }
    @GetMapping("/getbed/{bed}")
    public List<Company>getByBed(@PathVariable Double bed){
        return companyService.getByBed(bed);
    }
//    @GetMapping("/getbath/{bath}")
//    public List<Company>getByBath(@PathVariable Double bath){
//        return companyService.getByBath(bath);
//    }
@GetMapping("/getbath/{bath}")
public List<Company>getByBath(){
    return companyService.getByBath();
}
@GetMapping("/getcount/{city}")
    public List<Company>getByCount(@PathVariable String city){
        return companyService.getByCount(city);
}
}

