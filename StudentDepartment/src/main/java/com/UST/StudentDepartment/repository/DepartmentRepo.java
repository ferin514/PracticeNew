package com.UST.StudentDepartment.repository;

import com.UST.StudentDepartment.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
