import java.util.*;
// ENCAPSULATION

class BankAccount {
    private int balance;
    int password = 1234;

    public void setBalance(int amt) {
        if (amt > 0) {

            balance = amt;
        } else {
            System.out.print("invalid amount");
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        BankAccount bank = new BankAccount();
        System.out.println("Enter the amount to credit: ");
        int amt = scam.nextInt();
        bank.setBalance(amt);
        System.out.println("Enter the password:");
        int n = scam.nextInt();
        if (bank.password == n) {
            System.out.print("your credited amount is " + bank.getBalance());

        } else {
            System.out.println("Invalid password");
        }
        System.out.println("avoid ");
    }
}
// this is not updated in github