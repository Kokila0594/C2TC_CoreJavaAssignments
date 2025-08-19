package com.kokila.assignment.one.Employee;

public class Manager extends Employee {

	  private String department;

	    /**
	     * Constructor for Manager
	     * @param name employee name
	     * @param employeeId employee ID
	     * @param salary employee salary
	     * @param department manager's department
	     */
	    public Manager(String name, int employeeId, double salary, String department) {
	    	super(name, employeeId, salary);
	        this.department = department;
	    }

	    /** @return department name */
	    public String getDepartment() {
	        return department;
	    }

	    /** @param department set department */
	    public void setDepartment(String department) {
	        this.department = department;
	    }
}
