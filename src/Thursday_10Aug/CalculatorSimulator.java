package Thursday_10Aug;

public class CalculatorSimulator {

	public static void main(String[] args) {

		TaxCalculator obj = new TaxCalculator();
		
		try {
			System.out.println("\nYour Tax Amount is: " + obj.calculateTax(null, false, 0) + "/-");
		} 
		
		catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("\n--x--x--x--x-- Thank You --x--x--x--x--");
		}

	}
	
}