abstract class Accounts {
    double balance;
    int accountNumber;
    String name, address;

    Accounts(double b, int acc, String n, String addr) {
        balance = b;
        accountNumber = acc;
        name = n;
        address = addr;
    }

    abstract void withdraw(double amount);
    abstract void deposit(double amount);

    void display() {
        System.out.println(accountNumber + " " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(double b, int acc, String n, String addr, double r) {
        super(b, acc, n, addr);
        rateOfInterest = r;
    }

    void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void calculateAmount() {
        balance += balance * rateOfInterest / 100;
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(10000, 123, "A", "City", 5);
        s.deposit(2000);
        s.withdraw(1000);
        s.calculateAmount();
        s.display();
    }
}
