package exercise06BankAccountAgain01;


import java.util.IllegalFormatException;

public class BankAccount {
    private String id;
    private double balance;
    private int transactions;

    public BankAccount(String id, double balance){
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

    public void deposit(double amount)  {
        if (amount < 0 && amount >= 500){
            System.out.println("Not proper amount to deposit");
        }
        this.balance += amount;
        this.transactions ++;
    }
    public void withdraw (double amount){
        if ((this.balance - amount <= 0)){

            System.out.println("Not enough money");

        }
        this.balance -= amount;
        this.transactions ++;
    }
    public void transactionFee(double fee){

        for (int i = 1; i <= this.transactions ; i++) {
            this.balance = this.balance - fee * i;
        }

    }
    public boolean isBalansNotEmpty(){
        boolean isBalanspositive = true;
        if (!(this.balance > 0)){
            isBalanspositive = false;
        }
        return isBalanspositive;
    }
    public void transfer (BankAccount acceptMoney , double amount){
       acceptMoney.deposit(amount);
        this.balance -= amount + 5;
        this.transactions++;

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }
}
