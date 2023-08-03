package Thursday_3Aug;

import java.util.Scanner;

public class Question_3 {
 
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Create an array to store the integers
	        int[] numbers = new int[10];

	        // Input loop to get 10 integers from the user
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Input Integer #" + (i + 1) + ": ");
	            numbers[i] = input.nextInt();
	        }

	        // Find the smallest and largest values in the array
	        int min = numbers[0];
	        int max = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < min) {
	                min = numbers[i];
	            }

	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	        }
	        
	        // Print the result
	        System.out.println("Smallest Value: " + min);
	        System.out.println("Largest Value: " + max);

	        input.close();
	    }
	}
