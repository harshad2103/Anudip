package Thursday_27July;

//extends Var_Scan class 
public class ArrayOperations extends Var_Scan {
	
	
	
	
	public void array() {
		arr=accept();
	}
	
	
		
//find greater number from array
	public void grt() {
		array();
		int grt = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(grt<arr[i]) {
				grt=arr[i];
			}
		}
		
		System.out.println("\nThe Greatest No. in ARRAY is: "+grt+"\n");
		
	}
	
	
	
//	find smallest value from array
	public void smt() {
//		System.out.println("\n----- find Smallest number from Array -----");
//		int[] arr=accept();
		smt = arr[0];
		for(i=0; i<arr.length; i++) {
			if(smt>arr[i]) {
				smt = arr[i];
			}
		}
		
		System.out.println("\nThe Smallest No. in ARRAY is: "+smt+"\n");
			
	}
	
	
	
//	print ascending order or array
	public void ascen() {
//		System.out.println("\n\n----- Sort array by Ascending order-----");
//		int[] arr = accept();
		temp = 0;
		for(i=0; i<size; i++) {
			for(j=i+1; j<size; j++) {
				if(arr[i]>arr[j]) 
				{
					// condition to find descending order
					Array_ascen_descen();
				}
			}
		}
		
		System.out.println("\nThe Ascending Order for Given ARRAY is: ");
		
//		print array one by one
		Print_array();
	}
	

	
//	print descending order or array
	public void descen() {
//		System.out.println("\n\n----- Sort array by Descending order -----\n");
//		int[] arr = accept();
		temp = 0;
		for(i=0; i<arr.length; i++) {
			for(j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					
					// condition to find descending order
					Array_ascen_descen();
				}
			}
		}
		System.out.println("\nThe Descending Order for Given ARRAY is: ");
		
//		print array one by one
		Print_array();
	}
	

	// Print Array one by one
	public void Print_array() {
		for(i=0; i<arr.length; i++) {
			System.out.print("\t"+arr[i]);
		}
		System.out.println("\n");
	}
	
	
	
	// condition to find ascending and descending order of array
		public void Array_ascen_descen() {
			temp = arr[i];
			arr[i]=arr[j];
			arr[j] = temp;
		}

}