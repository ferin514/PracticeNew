package com.UST.CollegeDemo.repository;

import com.UST.CollegeDemo.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends JpaRepository<College,Integer> {
}
