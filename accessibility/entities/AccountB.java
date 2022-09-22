package accessibility.entities;

public class AccountB {

    public String holder;
    protected int number;
    private double balance;

    // Constructor
    public AccountB(String holder, int number, double balance) {
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    // Getters and Setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

    }

    public String toString() {
        return "Name: " + holder + " - Number: " + number + " - Balance €: " + getBalance();
    }
}
