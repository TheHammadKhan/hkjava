class ParameterConstructor {
    int x;

    ParameterConstructor(int a) {
        x = a;
    }

    public static void main(String[] args) {
        ParameterConstructor obj = new ParameterConstructor(10);
        System.out.println(obj.x);
    }
}
