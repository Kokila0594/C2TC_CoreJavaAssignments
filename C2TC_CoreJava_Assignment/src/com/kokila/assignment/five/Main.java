package com.kokila.assignment.five;

import java.util.Scanner;

//Driver class
public class Main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter choice (1=AirIndia, 2=KingFisher, 3=Indigo):");
     int choice = sc.nextInt();

     System.out.println("Enter hours of travel:");
     int hours = sc.nextInt();

     System.out.println("Enter cost per hour:");
     double costPerHour = sc.nextDouble();

     Airfare airfare;

     switch (choice) {
         case 1:
             airfare = new AirIndia(hours, costPerHour);
             break;
         case 2:
             airfare = new KingFisher(hours, costPerHour);
             break;
         case 3:
             airfare = new Indigo(hours, costPerHour);
             break;
         default:
             System.out.println("Invalid choice");
             sc.close();
             return;
     }

     double amount = airfare.calculateAmount();
     System.out.printf("%.2f%n", amount);

     sc.close();
 }
}
