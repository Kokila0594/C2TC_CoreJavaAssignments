package com.kokila.assignment.one.Employee;

import com.kokila.assignment.one.Employee.Manager;
import com.kokila.assignment.one.Employee.Developer;
import com.kokila.assignment.one.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
        // Create Manager object
        Manager manager = new Manager("Alice", 101, 75000, "HR");

        // Create Developer object
        Developer developer = new Developer("Bob", 102, 60000, "Java");

        // Use EmployeeUtilities methods
        System.out.println("=== Manager Details ===");
        EmployeeUtilities.printManagerDetails(manager);

        System.out.println("\n=== Developer Details ===");
        EmployeeUtilities.printDeveloperDetails(developer);
    }
}
