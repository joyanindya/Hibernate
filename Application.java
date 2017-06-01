package com.anindya.hibernetexample;

/**
 * Created by jcon928 on 5/31/2017.
 */
public class Application {

    public static void main(String[] args){

        EmployeeDAO employeeDAO = new EmployeeDAO();
        //Employee employee = new Employee();


        //Add New Employee
        Employee emp = new Employee();
        emp.setEmployeeName("joy");
        emp.setEmployeeSalary(5567);
        employeeDAO.addEmployee(emp);

        // update the employee
      /*  Employee emp2 = new Employee();
        emp2.setEmployeeName("Sayan");
        emp2.setEmployeeSalary(2000);
        emp2.setEmployeeID(2);
        employeeDAO.updateEmployee(emp2);*/

      //delete employee
      // employeeDAO.deleteEmployee(2);



    }
}
