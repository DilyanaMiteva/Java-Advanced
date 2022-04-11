package Classes_BankAccount_03;

public class BankAccount {
    private static double interestRate = 0.02;
    private static int bankAccountsCount = 1;

    private int id = 1;
    private int balance;

    BankAccount() {
        this.id = bankAccountsCount++;
    }

    public BankAccount(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int years) {
        return BankAccount.interestRate * years * this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
