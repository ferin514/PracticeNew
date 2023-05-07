package com.UST.RealEstate.service;

import com.UST.RealEstate.entity.Company;
import com.UST.RealEstate.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepo companyRepo;

    public List<Company> getByZipCode(Double zipcode) {
        return companyRepo.findByZipcode(zipcode);
    }

    public List<Company> getByState(String state) {
        return companyRepo.findByState(state);
    }

    public List<Company> getByCity(String city) {
        return companyRepo.findByCity(city);
    }

    public List<Company> getByPrice(Double price) {
        return companyRepo.findAll()
                .stream()
                .filter(c -> c.getPrice().equals(price))
                .collect(Collectors.toList());
    }
//       return companyRepo.findByPrice(price);
//    //    }
    public List<Company> getByBed(Double bed) {
        return companyRepo.findAll()
                .stream()
                .filter(c -> c.getBed().equals(bed))
                .collect(Collectors.toList());
    }


//        return companyRepo.findByBed(bed);
////    }

//    public List<Company> getByBath(Double bath) {
//        return companyRepo.findAll()
//                .stream()
//                .filter(c -> c.getBath().equals(bath))
//                .collect(Collectors.toList());
//    }
public List<Company> getByBath() {

    return companyRepo.findAll()
            .stream()
            .filter(c -> c.getBath()==(2))
            .collect(Collectors.toList());
}


    public List<Company> getByCount(String city) {

    }










