package Thursday_27July;

public class Operation_Class {
	
	public static void main(String[] args) {
		operation_seq();
	}	
	
	
	
	public static void operation_seq() {
		
		// create object for Palindrom because from Palindrom we can use Array_program class and Var_Scan class all function. 
		Palindrom obj=new Palindrom();
					
		
		do {

			System.out.println("1: Array Methods (Greater number, Smaller number, Ascending, Descending order) \n2: Find Palindrome \n3: Swapping two numbers");
			
			System.out.println("\nChoose Your Operation from The List: \n");
			// ask to user which operation do you want perform
			obj.num = obj.input_num1();
			 
			
			
			switch(obj.num) {

				case 1:{
					// methods from Array_program
					obj.grt();
					obj.smt();
					obj.ascen();
					obj.descen();
					break;
				}
				
				case 2:{
					// method from Palindrom
					obj.palindrom();
					break;
				}
				
				case 3:{
		
					SwapNumbers obj1 = new SwapNumbers();
					obj1.swapping_two_no_without();
					obj1.swapping_two_no_with();
					break;
				}
				
				default:{
					System.out.println("Please Enter Number from (1, 2, 3): ");
					operation_seq();
				}
				
			}
			

			// condition for repeat process.
			System.out.println("\nDo You want Perform another Operation...(y / n): ");
			obj.char1 = obj.input_char_1();
			
		}while(obj.char1 == 'y' || obj.char1=='Y');
	
		System.out.println("-----E_N_D-----");
	}
	
}