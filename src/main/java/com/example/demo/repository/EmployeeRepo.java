package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    
   
    public List<Employee> getEmployeesByManagerEmail(String email);

   
    public Employee getManagerByEmployeeEmail(String email);
}

