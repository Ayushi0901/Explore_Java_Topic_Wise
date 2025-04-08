package Oops;

public class PracticeEncapsulation {
    // Scenario :  Banking System
    //Consider a banking system where we have a BankAccount class that keeps track of account balance.
    // The balance should not be directly accessible or modifiable by outside classes.
    // Instead, the bank account should only allow deposit and withdrawal through controlled methods.
    private double balance;

    public PracticeEncapsulation(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance can't be negative");
        }
    }

    //deposit money
// withdraw
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive");
        }

    }

    //    withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid Withdrawal amount ");
        }
    }

    //    Getter for balance (no setter as balance should not be directly modified)
    public double getBalance() {
        return balance;
    }

    public void displayAccount() {
        System.out.println("current balance : " + balance);
    }

    public static class Main {
        public static void main(String[] args) {
            PracticeEncapsulation acc = new PracticeEncapsulation(700.00);
            acc.displayAccount();

            //deposit
            acc.deposit(500);
            acc.displayAccount();

            //withdraw invalid
            acc.withdraw(1700);
            acc.displayAccount();

            //valid withdraw
            acc.withdraw(300);
            acc.displayAccount();
        }
    }
}


