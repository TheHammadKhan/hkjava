class ConstructorOverload {
    ConstructorOverload() {
        System.out.println("Default Constructor");
    }

    ConstructorOverload(int a) {
        System.out.println("Parameterized Constructor: " + a);
    }

    public static void main(String[] args) {
        new ConstructorOverload();
        new ConstructorOverload(5);
    }
}
