package com.anindya.hibernetexample;


import javax.persistence.*;

/**
 * Created by jcon928 on 5/29/2017.
 */
@Entity
@Table(name = "Employee_New")
public class Employee {

    @Id@GeneratedValue
    @Column(name = "Eid")
    private Integer employeeID;
    @Column(name = "Ename")
    private String employeeName;
    @Column(name = "Salary")
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
