package com.anindya.hibernetexample;

/**
 * Created by jcon928 on 5/29/2017.
 */
public class Employee {

    private Integer employeeID;
    private String employeeName;
    private Integer EmployeeSalary;

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(Integer employeeSalary) {
        EmployeeSalary = employeeSalary;
    }
}
