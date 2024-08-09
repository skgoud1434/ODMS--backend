package com.example.demo.model;




import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

      @Id
     
    private int id;
    private String employeeName;
    private String employeeEmail;
    private String managerName;
    private String managerEmail;


    public Employee(){

        
    }

    
    public Employee(int id, String employeeName, String employeeEmail, String managerName, String managerEmail) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.managerName = managerName;
        this.managerEmail = managerEmail;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmployeeEmail() {
        return employeeEmail;
    }
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
    public String getManagerName() {
        return managerName;
    }
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    public String getManagerEmail() {
        return managerEmail;
    }
    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

  



}
