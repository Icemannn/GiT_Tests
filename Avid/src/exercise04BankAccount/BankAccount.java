package exercise04BankAccount;

/**
 * Created by Ilian on 7/27/2017.
 */
public class BankAccount {
    private String id;
    private double balance;
    private int transactions;

    public BankAccount(String id, double balance) {
        this.id = id;
        this.balance = balance;
        this.transactions = 0;
    }

    public String getId() {

        return id;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransactions() {
        return transactions;
    }
    public void deposit(double amount){
        this.balance = this.balance + amount;
        this.transactions++;
    }
    public void withdraw (double amount){
        if (this.balance - amount < 0){
            System.out.println("Not enough money");
        }
        this.balance = this.balance - amount;
        this.transactions++;
    }
    public void transactionFee (double fee){
        for (int i = 1; i <= this.transactions; i++) {
            this.balance = this.balance - fee * i;
        }

    }
    public  boolean isBalancePositive(){
        boolean isPositive = true;
        if (this.balance <= 0){
            isPositive = false;

        }
        return isPositive;
    }
}
