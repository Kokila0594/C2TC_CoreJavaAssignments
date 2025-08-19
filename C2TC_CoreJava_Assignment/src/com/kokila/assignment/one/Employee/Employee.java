package com.kokila.assignment.one.Employee;

public class Employee {
	  private String name;
	    private int employeeId;
	    private double salary;

	    /**
	     * Protected constructor to restrict direct instantiation outside the package,
	     * but allow subclassing.
	     */
	    protected Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    /** @return employee name */
	    public String getName() {
	        return name;
	    }

	    /** @param name set employee name */
	    public void setName(String name) {
	        this.name = name;
	    }

	    /** @return employee ID */
	    public int getEmployeeId() {
	        return employeeId;
	    }

	    /** @param employeeId set employee ID */
	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    /** @return employee salary */
	    public double getSalary() {
	        return salary;
	    }

	    /** @param salary set employee salary */
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
}
