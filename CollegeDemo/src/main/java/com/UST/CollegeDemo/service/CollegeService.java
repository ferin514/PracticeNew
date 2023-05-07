package com.UST.CollegeDemo.service;

import com.UST.CollegeDemo.entity.College;
import com.UST.CollegeDemo.exception.IdNotFound;
import com.UST.CollegeDemo.repository.CollegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CollegeService {
    @Autowired
    private CollegeRepo collegeRepo;
    public College addCollegeDetails(College college) {
        return collegeRepo.save(college);
    }

    public List<College> getAllCollegeDetails() {
        return collegeRepo.findAll();
    }

    public College getById(Integer id) {
        Optional<College>c=collegeRepo.findById(id);
        if(c.isEmpty()){
            throw new IdNotFound("student with id :" + id + "doesn't exist");
        }else{
            return(c.get());
        }
//        return collegeRepo.findById(id).orElse(null);
    }

    public College update(College college) {
        College old=null;
        Optional<College> colleges=collegeRepo.findById(college.getId());
        if(colleges.isPresent()){
            old=colleges.get();
            old.setName(college.getName());
            collegeRepo.save(old);
        }else{
            return new College();
        }
        return old;

    }

    public String delete(Integer id) {
        collegeRepo.deleteById(id);
        return "deleted";
    }
}
