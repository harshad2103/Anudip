package Harshad;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();

			long factorial = calculateFactorial(number);
			System.out.println("The factorial of " + number + " is: " + factorial);
		}
    }

    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}

