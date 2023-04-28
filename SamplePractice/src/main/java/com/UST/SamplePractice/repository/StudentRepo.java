package com.UST.SamplePractice.repository;

import com.UST.SamplePractice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
