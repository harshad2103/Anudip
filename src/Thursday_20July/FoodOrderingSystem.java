package Thursday_20July;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOrderingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        char repeat;
        double totalBill = 0;
        ArrayList<String> orderedItems = new ArrayList<>();
        ArrayList<Double> itemPrices = new ArrayList<>();

        do {
            System.out.println("\nWelcome to FoodAdda");
            System.out.println("1: Starter\n2: Main Course\n3: Dessert\n4: Drink");
            System.out.println("Enter the number:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Starter
                    double starterPrice = Starter.orderStarter();
                    totalBill += starterPrice;
                    orderedItems.add("Starter");
                    itemPrices.add(starterPrice);
                    break;
                case 2:
                    // Main Course
                    double mainCoursePrice = MainCourse.orderMainCourse();
                    totalBill += mainCoursePrice;
                    orderedItems.add("Main Course");
                    itemPrices.add(mainCoursePrice);
                    break;
                case 3:
                    // Dessert
                    double dessertPrice = Dessert.orderDessert();
                    totalBill += dessertPrice;
                    orderedItems.add("Dessert");
                    itemPrices.add(dessertPrice);
                    break;
                case 4:
                    // Drink
                    double drinkPrice = Drink.orderDrink();
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

        System.out.println("\nThank you for Visiting Us!");
        System.out.println("Your Total Bill is:");
        for (int i = 0; i < orderedItems.size(); i++) {
            System.out.println(orderedItems.get(i) + ": Rs." + itemPrices.get(i) + " ");
        }
        System.out.println("Total Bill Amount: Rs." + totalBill + " ");
    }
}
