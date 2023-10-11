package com.jspiiders.cardekho1.car.operation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import com.jspiiders.cardekho1.car.Car;

public class CarOperations {
	
	private static Iterator<Car> i;
	Scanner sc = new Scanner(System.in);
	static ArrayList<Car> car1 = new ArrayList<Car>();
	private static boolean found;
	
	public static void addcarDetails(Scanner sc) {
		
		System.out.println("Enter a Car id");
		int carid = sc.nextInt();
		System.out.println("Enter a CarName ");
		String carname = sc.next();
		System.out.println("Enter a Car Model ");
		 int carmodel = sc.nextInt();
		System.out.println("Enter a FuelType");
		String fueltype = sc.next();
		System.out.println("Enter a Fuel Capacity");
		String fuelcapacity = sc.next();
		
		car1.add(new Car(carid, carname,carmodel,fueltype, fuelcapacity));
		
		
		
		}
	
	public static void displayCarDetails(Scanner sc) {
	
		System.out.println("Added Car Records ");
		System.out.println("====================>");
		Iterator<Car> i = car1.iterator();
		while (i.hasNext()) {
			Car car2 = i.next(); 
			System.out.println(car2);
		System.out.println("====================>");
	}
	
	}
 



    public static void searchcarDetails(Scanner sc) {
    	
    	
    	
    	boolean found = false;
		System.out.println("Enter car number to search");
		int carid = sc.nextInt();
		System.out.println("------------------->");
	          i = car1.iterator();
		while (i.hasNext()) {
			Car car2 = i.next(); 
			if (car2.getCarid()==carid) {
		System.out.println(car2);
		if (found=true) {
			System.out.println("Record found");
		}
			}
		}
		
		if (!found) {
			System.out.println("Record not found");
		}
		
      System.out.println("-------------------->");
	
	
    }
   


    public static void removecarDetails(Scanner sc) {
		
    	 found = false;
 		System.out.println("Enter Car_ID to Delete");
 		int carid = sc.nextInt();
 		System.out.println("------------------->");
 	          i = car1.iterator();
 		while (i.hasNext()) {
 			Car car2 = i.next(); 
 			if (car2.getCarid()==carid) {
 		 i.remove();
 		if (found=true) {
 			System.out.println("Record found");
 		}
 			}
 		}
 		
 		if (!found) {
 			System.out.println("Record not found");
 		}else {
 			System.out.println("Record is Deleted Sucessfully...!!!!");
 		}
 		
       System.out.println("-------------------->");
 	         
 	           
 	
	}
  

    
    
    public static void updatecarDetails(Scanner sc) {
		
   	 found = false;
		System.out.println("Enter Car_ID to Update");
		int carid = sc.nextInt();
		System.out.println("------------------->");
	         ListIterator<Car> i = car1.listIterator();
		while (i.hasNext()) {
			Car car2 = i.next(); 
			if (car2.getCarid()==carid) {
				
				System.out.println("Enter a New Carid");
				carid =sc.nextInt();
				System.out.println("Enter a New Carname");
				 String carname = sc.next();
				System.out.println("Enter a new Carmodel");
				 String carmodel = sc.next();
				System.out.println("Enter a new Fueltype");
				 String fueltype = sc.next();
				System.out.println("Enter a  new FuelCapacity");
				 String fuelcapacity = sc .next();
		 i.remove();
		if (found=true) {
			System.out.println("Record Matched ");
		}
			}
		}
		
		if (!found) {
			System.out.println("Record not found");
		}else {
			System.out.println("Record is Updated Sucessfully...!!!!");
		}
		
      System.out.println("-------------------->");
	         
	           
	
	}
 


}
