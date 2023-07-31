package com.mycompany.employeeobj;

public class EmployeeObj {

    public static void main(String[] args) {
        Employee employee = new Employee("Bogdan", 30, 50000);

        employee.setName("Bogdan");
        System.out.println("Employee Name: " + employee.getName());

        employee.setSalary(50000);
        System.out.println("Basic Salary: " + employee.getSalary());

        double bonus = 10000;
        System.out.println("Bonus: " + bonus);

        double bonusAmount = employee.calculateBonusAmount(bonus);
        System.out.println("Bonus Amount: " + bonusAmount);
    }
}
