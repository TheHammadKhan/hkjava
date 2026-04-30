interface Gross {
    double calculateGross();
}

class Employee {
    String name;
    double basic;

    Employee(String n, double b) {
        name = n;
        basic = b;
    }
}

class Salary extends Employee implements Gross {
    Salary(String n, double b) {
        super(n, b);
    }

    public double calculateGross() {
        return basic + 0.2 * basic + 0.1 * basic;
    }

    public static void main(String[] args) {
        Salary s = new Salary("A", 20000);
        System.out.println(s.name + " " + s.calculateGross());
    }
}
