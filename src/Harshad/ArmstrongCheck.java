package Harshad;


import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        // Calculate the number of digits in the number
        int numDigits = String.valueOf(number).length();

        while (number != 0) {
            int remainder = number % 10;
            sum += Math.pow(remainder, numDigits);
            number /= 10;
        }

        return originalNumber == sum;
    }
}
