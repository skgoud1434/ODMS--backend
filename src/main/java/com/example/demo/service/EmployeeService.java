package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public List<Employee> getEmployees() {
        return repo.findAll();
    }

    public Employee addEmployee(Employee obj) {
        return repo.save(obj);
    }

    public Employee getEmployee(int id) {
        return repo.findById(id).orElse(new Employee());
    }

    public List<Employee> getEmployeesByManagerEmail(String mEmail) {
        return repo.getEmployeesByManagerEmail(mEmail);
    }

    public Employee getManagerByEmployeeEmail(String eMail) {
        return repo.getManagerByEmployeeEmail(eMail);
    }

    public void deleteEmployeeDetails(int id) {
      
            repo.deleteById(id);
        
      
    }
}
