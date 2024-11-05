package com.college_directory_app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college_directory_app.entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
Optional<Department> findByName(String departmentName);
}