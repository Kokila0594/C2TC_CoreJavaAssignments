package com.kokila.assignment.three;

public class Item {

	 private final int id;
	    private final String title;

	    public Item(int id, String title) {
	        this.id = id;
	        this.title = title;
	    }

	    public int getId() { return id; }
	    public String getTitle() { return title; }

	    // Polymorphic hook: subclasses can override how they display
	    public void displayInfo() {
	        System.out.println("Item: [ID: " + id + ", Title: " + title + "]");
	    }
}
