package Thursday_20July;

import java.util.Scanner;

public class Drink {
    public static double orderDrink() {
 
    		Scanner sc = new Scanner(System.in);

    	    System.out.println("\nDrinks:");
    	    System.out.println("1: Water                 =               Rs.20");
    	    System.out.println("2: Coke                  =               Rs.50");
    	    System.out.println("3: Thums Up              =               Rs.40");
    	    System.out.println("Select the Drink please:");

    	    int choice = sc.nextInt();
    	    double price = 0;

    	    // Display the order for Drink selected
    	    switch (choice) {
    	        case 1:
    	            price = 20;
    	            break;
    	        case 2:
    	            price = 50;
    	            break;
    	        case 3:
    	            price = 40;
    	            break;
    	        default:
    	            System.out.println("Invalid choice!");
    	            break;
    	    }

    	    return price;
    	}
    	
    }

