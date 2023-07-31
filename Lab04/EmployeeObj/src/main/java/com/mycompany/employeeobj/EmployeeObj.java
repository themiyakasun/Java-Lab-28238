package com.mycompany.employeeobj;

public class EmployeeObj {

    public static void main(String[] args) {
         Employee bogdan = new Employee();
        Employee bird = new Employee();

        bogdan.setEmpID(101);
        bogdan.setEmpName("Mr. Bogdan");
        bogdan.setEmpDesignation("Software Engineer");

        bird.setEmpID(102);
        bird.setEmpName("Ms. Bird");
        bird.setEmpDesignation("Data Scientist");

        System.out.println("Mr. Bogdan Details:");
        System.out.println("Employee ID: " + bogdan.getEmpID());
        System.out.println("Employee Name: " + bogdan.getEmpName());
        System.out.println("Employee Designation: " + bogdan.getEmpDesignation());

        System.out.println();

        System.out.println("Ms. Bird Details:");
        System.out.println("Employee ID: " + bird.getEmpID());
        System.out.println("Employee Name: " + bird.getEmpName());
        System.out.println("Employee Designation: " + bird.getEmpDesignation());
    }
}
