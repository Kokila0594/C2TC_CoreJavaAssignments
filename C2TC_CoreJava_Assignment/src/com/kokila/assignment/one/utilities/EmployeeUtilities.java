package com.kokila.assignment.one.utilities;

import com.kokila.assignment.one.Employee.Employee;

import com.kokila.assignment.one.Employee.Manager;
import com.kokila.assignment.one.Employee.Developer;

public class EmployeeUtilities {


	  /**
     * Prints basic details of an Employee.
     * @param emp Employee object
     */
    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }

    /**
     * Prints details of a Manager.
     * @param manager Manager object
     */
    public static void printManagerDetails(Manager manager) {
        printEmployeeDetails(manager); // works since Manager IS-A Employee
        System.out.println("Department: " + manager.getDepartment());
    }

    /**
     * Prints details of a Developer.
     * @param developer Developer object
     */
    public static void printDeveloperDetails(Developer developer) {
        printEmployeeDetails(developer); // works since Developer IS-A Employee
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}
