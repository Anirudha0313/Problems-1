package OOP;

class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String name, int accNo, double bal) {
        this.accountHolder = name;
        this.accountNumber = accNo;
        this.balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Insufficient Balance");
        else
            balance -= amount;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}