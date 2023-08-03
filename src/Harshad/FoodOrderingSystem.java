package Harshad;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOrderingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        char repeat;
        double totalBill = 0.0;
        ArrayList<String> orderedItems = new ArrayList<>();
        ArrayList<Double> itemPrices = new ArrayList<>();

        do {
            System.out.println(" \t\t\t\t\t Khaa K Jaooo");
            System.out.println("\nWelcome to our Restaurant");
            System.out.println("1: Veg Starter\n2: Main Course\n3: Dessert\n4: Drink");
            System.out.println("Enter the number:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Veg Starter
                    double starterPrice = orderVegStarter();
                    totalBill += starterPrice;
                    orderedItems.add("Veg Starter");
                    itemPrices.add(starterPrice);
                    break;
                case 2:
                    // Main Course
                    double mainCoursePrice = orderMainCourse();
                    totalBill += mainCoursePrice;
                    orderedItems.add("Main Course");
                    itemPrices.add(mainCoursePrice);
                    break;
                case 3:
                    // Dessert
                    double dessertPrice = orderDessert();
                    totalBill += dessertPrice;
                    orderedItems.add("Dessert");
                    itemPrices.add(dessertPrice);
                    break;
                case 4:
                    // Drink
                    double drinkPrice = orderDrink();
                    totalBill += drinkPrice;
                    orderedItems.add("Drink");
                    itemPrices.add(drinkPrice);
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }

            System.out.println("\nDo you want to order more (y / n):");
            repeat = sc.next().charAt(0);
        } while (repeat == 'Y' || repeat == 'y');

        System.out.println("\nThank you for the order!");
        System.out.println("Your selected items with their prices are:");
        for (int i = 0; i < orderedItems.size(); i++) {
            System.out.println(orderedItems.get(i) + ": " + itemPrices.get(i) + " Rs");
        }
        System.out.println("Total Bill Amount: " + totalBill + " Rs");
    }

    // Veg Starter
    public static double orderVegStarter() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nVeg Starters:");
        System.out.println("1: Veg Spring Roll                    100Rs");
        System.out.println("2: Paneer Tikka                       150Rs");
        System.out.println("3: Aloo Tikki                         80Rs");
        System.out.println("Select the Veg Starters please:");

        int choice = sc.nextInt();
        double price = 0.0;

        // Display the order for Veg Starters selected
        switch (choice) {
            case 1:
                price = 100.0;
                break;
            case 2:
                price = 150.0;
                break;
            case 3:
                price = 80.0;
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        return price;
    }

    // Main Course
    public static double orderMainCourse() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nMain Course:");
        System.out.println("1: Veg Biryani                           180Rs");
        System.out.println("2: Veg Fried Rice                        120Rs");
        System.out.println("3: Shahi Paneer                          150Rs");
        System.out.println("Select the Main Course please:");

        int choice = sc.nextInt();
        double price = 0.0;

        // Display the order for Main Course selected
        switch (choice) {
            case 1:
                price = 180.0;
                break;
            case 2:
                price = 120.0;
                break;
            case 3:
                price = 150.0;
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        return price;
    }

    // Dessert
    public static double orderDessert() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDesserts:");
        System.out.println("1: Gulab Jamun                          60Rs");
        System.out.println("2: Rasgulla                             70Rs");
        System.out.println("3: Ice Cream                            50Rs");
        System.out.println("Select the Dessert please:");

        int choice = sc.nextInt();
        double price = 0.0;

        // Display the order for Dessert selected
        switch (choice) {
            case 1:
                price = 60.0;
                break;
            case 2:
                price = 70.0;
                break;
            case 3:
                price = 50.0;
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        return price;
    }

    // Drink
    public static double orderDrink() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDrinks:");
        System.out.println("1: Water                                20Rs");
        System.out.println("2: Coke                                 50Rs");
        System.out.println("3: Lemonade                             40Rs");
        System.out.println("Select the Drink please:");

        int choice = sc.nextInt();
        double price = 0.0;

        // Display the order for Drink selected
        switch (choice) {
            case 1:
                price = 20.0;
                break;
            case 2:
                price = 50.0;
                break;
            case 3:
                price = 40.0;
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        return price;
    }
}
