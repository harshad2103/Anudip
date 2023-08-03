package Thursday_3Aug;

public class CheckingAccount extends BankAccount {

    private int accountNumber, check_pin, credit, debit;

    public static void main(String[] args) {
        CheckingAccount obj = new CheckingAccount();

        char repeat;
		do {
            System.out.println("\n1: Deposit \n2: Withdraw");

            System.out.println("\nEnter 1 or 2: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                obj.deposit();

            } else if (choice == 2) {
                obj.withdraw();
            } else {
                System.out.println("-----Invalid Selection-----");
            }

            System.out.println("Do you want another operation (y/n): ");
            repeat = sc.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');
    }

    public void details() {
        System.out.println("----------------------------------------");
        System.out.println("Enter Account number: ");
        setAccountNumber(sc.nextInt());
        System.out.println("Enter Pin number: ");
        check_pin = sc.nextInt();
    }

    @Override
    void deposit() {
        details();

        if (getPinno() == check_pin) {
            System.out.println("\nEnter the Amount to Deposit: ");
            credit = sc.nextInt();

            setBalance(getBalance() + credit);
            System.out.println("\nYour balance is: " + getBalance() + " /-");

        } else {
            System.out.println("Invalid pin number...");
        }

        System.out.println("----------------------------------------");
    }

    @Override
    void withdraw() {
        details();

        if (getPinno() == check_pin) {
            System.out.println("\nEnter the Amount to Withdraw: ");
            debit = sc.nextInt();

            if (debit <= getBalance()) {
                setBalance(getBalance() - debit);
                System.out.println("\nYour balance is: " + getBalance());
            } else {
                System.out.println("Insufficient balance.....");
                System.out.println("Your balance is : " + getBalance() + "/-");
            }

        } else {
            System.out.println("Invalid pin number...");
        }

        System.out.println("----------------------------------------");
    }

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
