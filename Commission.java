import java.util.Scanner;

class Commission {
    double sales;

    Commission(double s) {
        sales = s;
    }

    double commission() {
        if (sales >= 100000)
            return sales * 0.1;
        else if (sales >= 50000)
            return sales * 0.05;
        else
            return sales * 0.02;
    }
}

class CommissionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sales = sc.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission obj = new Commission(sales);
            System.out.println("Commission: " + obj.commission());
        }
    }
}
