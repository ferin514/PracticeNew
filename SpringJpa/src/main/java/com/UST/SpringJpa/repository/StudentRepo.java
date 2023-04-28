package com.UST.SpringJpa.repository;

import com.UST.SpringJpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
