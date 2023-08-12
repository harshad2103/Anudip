package Thursday_10Aug;

import java.util.Scanner;

public class TaxCalculator {
	
	Scanner sc = new Scanner(System.in);
 
	public double calculateTax(String empName, boolean isIndian, double empSal)
			throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		
		double taxAmount = 0;

		System.out.println("\n---------- Welcome to Tax Calculator fo INDIANS ----------\n");
		
		System.out.println("Enter Name: ");
		empName = sc.nextLine();

		if (empName.isEmpty()) {
			throw new EmployeeNameInvalidException("The employee name cannot be empty...");
		} 
		
		else {
			System.out.println("You are Indian (True or False): ");
			isIndian = sc.nextBoolean();

			if (isIndian == false) {
				throw new CountryNotValidException("\nThe Employee should be an Indian Citizen for Calculating tax...");
			}

			else if (isIndian == true) {

				System.out.println("\nEnter Your Salary: ");
				empSal = sc.nextDouble();

				if (empSal >= 100000) {
					taxAmount = empSal * 8 / 100;
				}

				else if ((empSal >= 50000)) {
					taxAmount = empSal * 6 / 100;
				}

				else if ((empSal >= 30000)) {
					taxAmount = empSal * 5 / 100;
				}

				else if ((empSal >= 10000)) {
					taxAmount = empSal * 4 / 100;
				}
				
				else {
					throw new TaxNotEligibleException("\nThe Employee does not need to Pay Tax...");
				}
			}
		}

		return taxAmount;

	}

}