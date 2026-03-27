package OOP;

public class Main {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Ravi", 101, 5000);

        acc1.displayBalance();
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.displayBalance();
    }
}