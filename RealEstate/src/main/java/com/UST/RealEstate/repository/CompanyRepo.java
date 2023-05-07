package com.UST.RealEstate.repository;

import com.UST.RealEstate.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CompanyRepo extends JpaRepository<Company,Integer> {
    List<Company> findByZipcode(Double zipCode);

    List<Company> findByState(String state);

    List<Company> findByCity(String city);


    List<Company> findByPrice(Double price);

    List<Company> findByBed(Double bed);
}
