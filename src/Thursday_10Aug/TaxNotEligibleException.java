package Thursday_10Aug;

@SuppressWarnings("serial")
public class TaxNotEligibleException extends Exception{
	public TaxNotEligibleException(String message) {
		super(message);
	}
}