interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

class Customer {
    String name;
    Customer(String n) {
        name = n;
    }
}

class Account extends Customer implements Bank {
    double balance;

    Account(String n, double b) {
        super(n);
        balance = b;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
    }

    void display() {
        System.out.println(name + " " + balance);
    }

    public static void main(String[] args) {
        Account a = new Account("A", 10000);
        a.deposit(2000);
        a.withdraw(1000);
        a.display();
    }
}
