import java.util.Scanner;

class SwapNumbers {
    int num;

    SwapNumbers(int n) {
        num = n;
    }

    void swap(SwapNumbers obj) {
        int temp = this.num;
        this.num = obj.num;
        obj.num = temp;
    }

    void display() {
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        SwapNumbers obj1 = new SwapNumbers(a);
        SwapNumbers obj2 = new SwapNumbers(b);
        obj1.swap(obj2);
        obj1.display();
        obj2.display();
    }
}
