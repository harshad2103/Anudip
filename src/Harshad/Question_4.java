package Harshad;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = input.nextInt();

			int factorial = 1;
			for (int i = 1; i <= number; i++) {
			    factorial *= i;
			}

			System.out.println("The factorial of " + number + " is: " + factorial);
		}
    }
}
