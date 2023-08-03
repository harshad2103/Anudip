package Harshad;

import java.util.Scanner;

public class Question_3 {
	//WAP to perform the following operation 
//  1:Accept age and check eligible for voting or not
//	2:Accept 3 no from the user and find out the greatest
//	3:WAP to accept a no from the user and check it is even or odd

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Operations:");
    System.out.println("1. Check eligibility for voting");
    System.out.println("2. Find the greatest among 3 numbers");
    System.out.println("3. Check if a number is even or odd");
			        
    
			        System.out.print("Enter your choice between 1 to 3: ");
			        int choice = sc.nextInt();
			        
			        switch (choice) {
//		      1:Accept age and check eligible for voting or not
			            case 1:
			                System.out.print("Enter your age: ");
			                int age = sc.nextInt();
			                
			                if (age >= 18) {
			                    System.out.println("You are eligible for voting");
			                } else {
			                    System.out.println("You are not eligible for voting");
			                }
			                break;
//		            2:Accept 3 no from the user and find out the greatest   
			            case 2:
			            	int num1,num2,num3; 
//                   taking 3 input from the user
			            	System.out.println("\nEnter any three numbers: ");
							 num1 = sc.nextInt();
							 num2 = sc.nextInt();
							 num3 = sc.nextInt();
							 
							 
//						2:Accept 3 no from the user and find out the greatest
							 if(num1>num2 && num1>num3) {
								 System.out.println("Num 1 is Greater than others");
								 
							 }
							 else if(num2>num1 && num2>num3) {
								 
								 System.out.println("Num 2 is Greater than others");
								 	 
							 }
							 else {
								 System.out.println("Num 3 is Greater than others");
									
							 }
							 break;
					
					 
//					   3:WAP to accept a no from the user and check it is even or odd
			               case 3:
			                System.out.print("Enter a number: ");  //taking input from the user
			                int number = sc.nextInt();
			                
			                if (number % 2 == 0) {
			                    System.out.println("The number is even");
			                } else {
			                    System.out.println("The number is odd");
			                }
			                break;
			                
			            default:   
			            	// default case
			                System.out.println("Invalid choice");
			        }
		}
		    
		

	}

}