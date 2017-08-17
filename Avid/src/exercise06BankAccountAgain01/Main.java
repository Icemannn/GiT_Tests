package exercise06BankAccountAgain01;


public class Main {
    public static void main(String[] args) {
        BankAccount ilian = new BankAccount("Ilian", 90.00);
        BankAccount mitko = new BankAccount("Mitko", 25.00);

        ilian.transfer(mitko, 20);

        System.out.println(mitko);
        System.out.println(ilian);
        System.out.println(ilian.getTransactions());
        System.out.println(mitko.getTransactions());
        mitko.transfer(ilian, 5);
        System.out.println(mitko.getBalance());
        System.out.println(ilian.getBalance());
        System.out.println(ilian.getTransactions());
        System.out.println(mitko.getTransactions());



    }
}
