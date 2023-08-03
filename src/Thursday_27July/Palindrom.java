package Thursday_27July;

// Extends Array_program 
public class Palindrom extends ArrayOperations{



	public void palindrom() {
		System.out.println("Check Entered No. is Palidrome or not..\n");
		System.out.println("Enter your number: ");
		
		// num1 is a user input integer value.
		input_num1();
		
		newnum = num1;
		while(num1>0) {
			
			int reminder = num1%10;
			reverse = (reverse*10) + reminder;
			num1 = num1/10;
			
		}
		
		System.out.println("Original No. is: "+newnum);
		System.out.println("After Reverse No. is: "+reverse);
		
		if(newnum == reverse) {
			System.out.println("Your No. is a PALINDROME.");
		}
		
		else {
			
			System.out.println("\nYour No. is NOT a PALINDROME.");
		}
		newnum=0;
		reverse=0;
		
	}



}
