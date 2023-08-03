package Thursday_20July;

import java.util.Scanner;

public class Dessert {
    public static double orderDessert() {
    	 
            Scanner sc = new Scanner(System.in);

            System.out.println("\nDesserts:");
            System.out.println("1: Gulab Jamun               =           Rs.60");
            System.out.println("2: Rasgulla                  =           Rs.70");
            System.out.println("3: Ice Cream                 =           Rs.50");
            System.out.println("Select the Dessert please:");

            int choice = sc.nextInt();
            double price = 0;

            // Display the order for Dessert selected
            switch (choice) {
                case 1:
                    price = 60;
                    break;
                case 2:
                    price = 70;
                    break;
                case 3:
                    price = 50;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            return price;
        }
    }