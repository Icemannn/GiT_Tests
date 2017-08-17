package exercise04BankAccount;

/**
 * Created by Ilian on 7/27/2017.
 */
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ilian", 200);
        account.deposit(100);
        account.deposit(100);
        account.deposit(100);
        System.out.println(account.getBalance());
        account.withdraw(400);
        System.out.println(account.getBalance());
        System.out.println(account.getTransactions());

        account.transactionFee(158);
        System.out.println(account.getBalance());
        System.out.println(account.isBalancePositive());

    }
}
