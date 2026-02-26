import java.util.Scanner;

class LeapYear {
    int year;

    LeapYear(int y) {
        year = y;
    }

    void check() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        LeapYear obj = new LeapYear(y);
        obj.check();
    }
}
