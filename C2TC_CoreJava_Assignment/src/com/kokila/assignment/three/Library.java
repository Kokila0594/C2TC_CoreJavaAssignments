package com.kokila.assignment.three;

import java.util.ArrayList;
import java.util.List;

public class Library {

	 private final List<Item> items = new ArrayList<>();

	    public void addItem(Item item) {
	        items.add(item);
	    }

	    public void showAllItems() {
	        System.out.println("Library contains:");
	        for (Item item : items) {
	            if (item instanceof Book b) {
	                System.out.println("- " + b.getTitle() + " by " + b.getAuthor());
	            } else if (item instanceof Magazine m) {
	                System.out.println("- " + m.getTitle() + " Issue " + m.getIssueNumber());
	            } else {
	                // Fallback for generic Items if ever added
	                System.out.println("- " + item.getTitle());
	            }
	        }
	    }
}
