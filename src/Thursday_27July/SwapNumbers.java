package Thursday_27July;


// extends Var_Scan 
public class SwapNumbers 
extends Var_Scan{
	

	// swapping two number without third variable
	public void swapping_two_no_without() {   
		
		System.out.println("Enter 2 number: ");
		
		// num1, num2 are an user inputs integer value.
		input_swapping();
		
		System.out.println("Given Value: "+ num1 +"\t\t"+ num2);
		
		num1 = num1+num2;
		num2 = num1-num2;                 
		num1 = num1-num2;			
		
		System.out.println("\nSwapped Value: "+ num1 +"\t\t"+ num2);
		
	}
	
	
	// swapping two number with third variable
	public void swapping_two_no_with() {   
		
		System.out.println("Enter 2 number: ");
		
		// num1, num2 are an user inputs integer value.
		input_swapping();
		
		System.out.println("Given Values: "+ num1 +"\t\t"+ num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("\nSwapped Values: "+ num1 +"\t\t"+ num2);
	
	}
	
	
}