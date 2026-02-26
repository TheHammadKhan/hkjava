import java.util.Scanner;

class MaxThree {
    int a, b, c;

    MaxThree(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    void findMax() {
        if (a >= b && a >= c)
            System.out.println("Maximum: " + a);
        else if (b >= a && b >= c)
            System.out.println("Maximum: " + b);
        else
            System.out.println("Maximum: " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        MaxThree obj = new MaxThree(x, y, z);
        obj.findMax();
    }
}