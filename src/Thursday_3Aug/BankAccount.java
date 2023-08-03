package Thursday_3Aug;

import java.util.Scanner;

public abstract class BankAccount {

    private int balance = 20000, pinno = 2103;

    static Scanner sc = new Scanner(System.in);

    abstract void deposit();

    abstract void withdraw();

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPinno() {
        return pinno;
    }

    public void setPinno(int pinno) {
        this.pinno = pinno;
    }
}
