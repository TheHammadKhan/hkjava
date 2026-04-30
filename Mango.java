interface Mango {
    void type();
}

class Winter implements Mango {
    public void type() {
        System.out.println("Winter Mango");
    }
}

class Summer implements Mango {
    public void type() {
        System.out.println("Summer Mango");
    }

    public static void main(String[] args) {
        Mango m1 = new Winter();
        Mango m2 = new Summer();

        m1.type();
        m2.type();
    }
}

