class Factorial {
    int num = 5;

    int calculate() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int result = obj.calculate();
        System.out.println("Factorial: " + result);
    }
}
