abstract class Asset {
    abstract void displayDetails();
}

class Stock extends Asset {
    String name;
    double value;

    Stock(String n, double v) {
        name = n;
        value = v;
    }

    void displayDetails() {
        System.out.println("Stock: " + name + " " + value);
    }
}

class Bond extends Asset {
    String name;
    double value;

    Bond(String n, double v) {
        name = n;
        value = v;
    }

    void displayDetails() {
        System.out.println("Bond: " + name + " " + value);
    }
}

class Savings extends Asset {
    String name;
    double value;

    Savings(String n, double v) {
        name = n;
        value = v;
    }

    void displayDetails() {
        System.out.println("Savings: " + name + " " + value);
    }
}

class TestAsset {
    public static void main(String[] args) {
        Asset a;

        a = new Stock("Reliance", 10000);
        a.displayDetails();

        a = new Bond("Govt Bond", 5000);
        a.displayDetails();

        a = new Savings("Bank", 8000);
        a.displayDetails();
    }
}
