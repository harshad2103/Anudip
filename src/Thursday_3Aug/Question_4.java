package Thursday_3Aug;

import java.util.Scanner;

class Bank {
    private String bankName;
    private String accountType;
    private long accountNumber;
    private String userName;
    private String password;
    private double balance;

    // Constructor
    public Bank(String bankName, String accountType, long accountNumber, String userName, String password) {
        this.setBankName(bankName);
        this.setAccountType(accountType);
        this.setAccountNumber(accountNumber);
        this.userName = userName;
        this.password = password;
        this.balance = 0;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs." + amount);
        displayBalance();
    }

    // Withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("-----Insufficient Balance-----");
        }
        displayBalance();
    }

    // Display account balance
    public void displayBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }

    // Apply for a loan
    public void applyForLoan(double loanAmount) {
        // Simulate loan approval process (can be more complex in a real-world application)
        if (loanAmount <= balance * 3) {
            System.out.println("Loan Approved! Rs." + loanAmount + " will be Credited to Your Account.");
            balance += loanAmount;
            displayBalance();
        } else {
            System.out.println("Your Loan Application has been Rejected. Requested Loan Amount is TOO HIGH.");
        }
    }

    // Check if the provided username and password match the account's credentials
    public boolean validateCredentials(String username, String password) {
        return this.userName.equals(username) && this.password.equals(password);
    }

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
}

public class Question_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_USERS = 10; // Maximum number of users for simplicity
        Bank[] accounts = new Bank[MAX_USERS];
        int userCount = 0;

        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to Our Bank!");
            System.out.println("1. Create an Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (userCount < MAX_USERS) {
                        System.out.print("Enter Bank name: ");
                        String bankName = scanner.next();
                        
                        System.out.print("Enter Account Type: ");
                        String accountType = scanner.next();
                        
                        System.out.print("Enter Account Number: ");
                        long accountNumber = scanner.nextLong();
                        
                        System.out.print("Enter Username: ");
                        String username = scanner.next();
                        
                        System.out.print("Enter Password: ");
                        String password = scanner.next();

                        // Create a new account and store it in the array
                        accounts[userCount++] = new Bank(bankName, accountType, accountNumber, username, password);
                        System.out.println("---------- Account Created Successfully! ----------");
                    } else {
                        System.out.println("Maximum user limit reached. Cannot create more accounts.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Username: ");
                    String loginUsername = scanner.next();
                   
                    System.out.print("Enter Password: ");
                    String loginPassword = scanner.next();

                    // Check if the user exists and the password is correct
                    Bank userAccount = null;
                    for (int i = 0; i < userCount; i++) {
                        if (accounts[i].validateCredentials(loginUsername, loginPassword)) {
                            userAccount = accounts[i];
                            break;
                        }
                    }

                    if (userAccount != null) {
                        System.out.println("---------- Login Successful! ----------");

                        boolean loggedIn = true;
                        while (loggedIn) {
                            System.out.println("1. Deposit Money");
                            System.out.println("2. Withdraw Money");
                            System.out.println("3. Check Balance");
                            System.out.println("4. Apply for Loan");
                            System.out.println("5. Logout");
                            System.out.print("Enter your choice: ");
                            int option = scanner.nextInt();

                            switch (option) {
                                case 1:
                                    System.out.print("Enter the Amount to Deposit: ");
                                    double depositAmount = scanner.nextDouble();
                                    userAccount.deposit(depositAmount);
                                    break;
                                case 2:
                                    System.out.print("Enter the Amount to Withdraw: ");
                                    double withdrawAmount = scanner.nextDouble();
                                    userAccount.withdraw(withdrawAmount);
                                    break;
                                case 3:
                                    userAccount.displayBalance();
                                    break;
                                case 4:
                                    System.out.print("Enter the Loan Amount: ");
                                    double loanAmount = scanner.nextDouble();
                                    userAccount.applyForLoan(loanAmount);
                                    break;
                                case 5:
                                    loggedIn = false;
                                    break;
                                default:
                                    System.out.println("Invalid Option!");
                            }
                        }
                    } else {
                        System.out.println("Invalid Username or Password.");
                    }
                    break;

                case 3:
                    exit = true;
                    System.out.println("Thank You for using our Bank Services!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}
