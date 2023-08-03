package Thursday_20July;

import java.util.Scanner;

public class Starter {
    public static double orderStarter() {
       
            Scanner sc = new Scanner(System.in);

            System.out.println("\nVeg Starters:");
            System.out.println("1: Veg Spring Roll          =          Rs.100");
            System.out.println("2: Paneer Tikka             =          Rs.150");
            System.out.println("3: Aloo Tikki               =          Rs.80");
            System.out.println("Select the Veg Starters please:");

            int choice = sc.nextInt();
            double price = 0.0;

            // Display the order for Starters selected
            switch (choice) {
                case 1:
                    price = 100;
                    break;
                case 2:
                    price = 150;
                    break;
                case 3:
                    price = 80;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            return price;
        }
    }