package com.kokila.assignment.one.Employee;

public class Developer extends Employee{

	  private String programmingLanguage;

	    /**
	     * Constructor for Developer
	     * @param name employee name
	     * @param employeeId employee ID
	     * @param salary employee salary
	     * @param programmingLanguage developer's primary language
	     */
	    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
	    	super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	    }

	    /** @return programming language */
	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    /** @param programmingLanguage set programming language */
	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }
}
