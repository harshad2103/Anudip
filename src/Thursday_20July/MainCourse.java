package Thursday_20July;

import java.util.Scanner;

public class MainCourse {
    public static double orderMainCourse() {
    
            Scanner sc = new Scanner(System.in);

            System.out.println("\nMain Course:");
            System.out.println("1: Veg Biryani              =             Rs.180");
            System.out.println("2: Veg Fried Rice           =             Rs.120");
            System.out.println("3: Shahi Paneer             =             Rs.150");
            System.out.println("Select the Main Course please:");

            int choice = sc.nextInt();
            double price = 0;

            // Display the order for Main Course selected
            switch (choice) {
                case 1:
                    price = 180;
                    break;
                case 2:
                    price = 120;
                    break;
                case 3:
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            return price;
        }
    }
