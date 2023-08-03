package Harshad;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = input.nextInt();

			System.out.println("Multiplication Table for " + number + ":");

			for (int i = 1; i <= 10; i++) {
			    int result = number * i;
			    System.out.println(number + " * " + i + " = " + result);
			}
		}
    }
}
