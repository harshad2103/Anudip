package Harshad;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the radius (R) of the circle: ");
			double radius = input.nextDouble();

			double area = Math.PI * radius * radius; // Calculate the area
			double circumference = 2 * Math.PI * radius; // Calculate the circumference

			System.out.println("Area of the circle (AC): " + area);
			System.out.println("Circumference of the circle (CC): " + circumference);
		}
    }
}
