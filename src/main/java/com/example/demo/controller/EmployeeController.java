package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/xto10x")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
       return  service.getEmployees();
      
    }
    
    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee obj){
        service.addEmployee(obj);
     
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
         return service.getEmployee(id);
       
    }
    
    @GetMapping("/employees/by-manager/{mEmail}")
    public List<Employee> getEmployeesByManagerEmail(@PathVariable String mEmail){
       return  service.getEmployeesByManagerEmail(mEmail);
        
    }

    @GetMapping("/employees/by-employee/{eEmail}")
    public Employee getManagerByEmployeeEmail(@PathVariable String eMail){
        return service.getManagerByEmployeeEmail(eMail);
       
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployeeDetails(@PathVariable("id") Integer id) {
        service.deleteEmployeeDetails(id);
    }
    
}
