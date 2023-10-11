package car_main;


import java.util.Scanner;

import com.jspiiders.cardekho1.car.operation.CarOperations;

public class Car_Main {
	
	
	
	public static void main(String[] args) {
		
        CarOperations carOperations = new CarOperations(); 
		Scanner sc = new Scanner(System.in);
		int choice;
		 boolean cheack=true;
		 
		 do {
			
		
		
	      	System.out.println("Enter your Choice for Performing Operation");
	       
			System.out.println("===========================================>>>");
	        System.out.println("Enter 1 for Insert car Details.... ");
	        System.out.println("Enter 2 for Display the Added Car Records....");
	        System.out.println("Enter 3 for Search Car Details...");
	        System.out.println("Enter 4 for Delete Car Details...");
	        System.out.println("Enter 5 for Update car Details...");
	        System.out.println("Enter 0 for Exit ");
	        System.out.println("===========================================>>>> ");
			
		
		
		
		
      
		switch (choice=sc.nextInt()) {
		case 1:
		CarOperations.addcarDetails(sc);
			
			break;

		
			
		case 2:
			
			CarOperations.displayCarDetails(sc);
			break;

	
			
			
			
			
		case 3:
		
			CarOperations.searchcarDetails(sc);
			break;


			
			
			
		case 4:
			CarOperations.removecarDetails(sc);
			
			break;


			
			
			
		case 5:
			
			CarOperations.updatecarDetails(sc);
			break;


			
			
			
		}	
			
		 }while (choice != 0);
          System.out.println("Thankyou For Considering Cardekho Application");
		 
		}
			
		 
			
		}	
			
		
		
		
		
	       
	       
	


