import java.util.Scanner;

class Fibonacci {
    int n;

    Fibonacci(int n) {
        this.n = n;
    }

    void generate() {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibonacci obj = new Fibonacci(n);
        obj.generate();
    }
}
