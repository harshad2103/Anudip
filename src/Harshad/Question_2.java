//Q2)WAP using switch case which will display the option of all operators


package Harshad;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
//				initializing the variables
				int choice, num1, num2;
				try (Scanner sc = new Scanner(System.in)) {
					System.out.println("1: Arithmetic operators \n2: Assingment operators \n3: Bitwise operator \n4: Logical  operator \n5: Relational Operator \n6: Ternary operator");
					
					
					


//					ask user to which operation run
						System.out.println("\nEnter the number which operator you want to Perform: ");
						choice = sc.nextInt();
					

						switch(choice) 
						{
						
//		                For arithmetic operator
							case 1:{
								int add , sub ,div,mul,mod;
								System.out.println("Your choice is Arithmetic operators");
								System.out.println("\nEnter any two number");
								num1 = sc.nextInt();
								num2 = sc.nextInt();
								add = num1 + num2;
								sub = num1 - num2;
								div = num1 / num2;
								mul = num1 * num2;
								mod = num1 % num2;
								System.out.println("The Addition of 2 number is: "+ add);
								System.out.println("The Subtraction of 2 number is: "+ sub);
								System.out.println("The Division of 2 numberis: "+ div);
								System.out.println("The Multiplication of 2 number is: "+ mul);
								System.out.println("The Module of 2 number is: "+ mod);
								break;
								}
							
							
//			            Assignment operator
							case 2:{
								System.out.println("Your choice is Assingment operators");
								System.out.println("\nEnter the single number");
								num1 = sc.nextInt();
								
								
								System.out.println("num1+=5 : "+(num1+=5));
								System.out.println("num1-=5 : "+(num1-=5));
								System.out.println("num1*=5 : "+(num1*=5));
								System.out.println("num1/=5 : " +(num1/=5));
								System.out.println("num1%=5 : " + (num1%=5));
								System.out.println("num1=5: "+(num1=5));
								
								break;
								}
							
							
//			            for bitwise operator
							case 3:{
								 System.out.print("Enter the first integer: ");
							        
									num1 = sc.nextInt();

							        System.out.print("Enter the second integer: ");
							        num2 = sc.nextInt();

							        // Bitwise AND
							        int bitwiseAnd = num1 & num2;
							        System.out.println("Bitwise AND: " + bitwiseAnd);

							        // Bitwise OR
							        int bitwiseOr = num1 | num2;
							        System.out.println("Bitwise OR: " + bitwiseOr);

							        // Bitwise XOR
							        int bitwiseXor = num1 ^ num2;
							        System.out.println("Bitwise XOR: " + bitwiseXor);
								break;
								}
							
//			            for Logical operator
							case 4:{
								System.out.println("Your choice is Logical operators");
								System.out.println("\nEnter the any two number");
								num1 = sc.nextInt();
								num2 = sc.nextInt();
								System.out.println("(num1 > num2) && (num1 < num2)" +((num1 > num2) && (num1 < num2)) );
								System.out.println("(num1 > num2) || (num1 < num2)" +((num1 > num2) || (num1 < num2)) );
								System.out.println("!(num1 > num2)"+(!(num1 > num2)) );
								
								break;
								}
							
//			            for relational operator
							case 5:{
								System.out.println("Your choice is Relational operators");
								System.out.println("\nEnter the any two number");
								num1 = sc.nextInt();
								num2 = sc.nextInt();
								System.out.println("for check num1 > num2: "+ (num1 > num2));
								System.out.println("for check num1 < num2: "+ (num1 < num2));
								System.out.println("for check num1 = num2: "+ (num1 == num2));
								System.out.println("for check num1 <= to num2: "+ (num1 <= num2));
								System.out.println("for check num1 >= equal to num2: "+ (num1 >= num2));
								System.out.println("for check num1 is not equal to num2: "+ (num1 != num2));
								
								break;
								}
							
							
//	                   for ternary operator
							case 6:{
								System.out.println("Your choice is Ternary operators");
								System.out.println("\nEnter the any two number");
								num1 = sc.nextInt();
								num2 = sc.nextInt();
								
								String res=(num1 > num2) ? "Num 1 is greater than Num 2 ": "Num 2 is greater than Num 2";	
								System.out.println(res);
								
								break;
								}
							
							default:{
								System.out.println("invalid inpuit");
							}
						}
				}
						

					

						
						
				}
			
				
			
				
	

		

	

}