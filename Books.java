class Books {
    String author, title, publisher;
    double price;

    Books(String a, String t, double p, String pub) {
        author = a;
        title = t;
        price = p;
        publisher = pub;
    }

    public static void main(String[] args) {
        Books[] b = new Books[10];

        b[0] = new Books("A1","T1",100,"P1");
        b[1] = new Books("A2","T2",200,"P2");
        b[2] = new Books("A3","T3",150,"P3");
        b[3] = new Books("A4","T4",300,"P4");
        b[4] = new Books("A5","T5",250,"P5");
        b[5] = new Books("A6","T6",180,"P6");
        b[6] = new Books("A7","T7",90,"P7");
        b[7] = new Books("A8","T8",400,"P8");
        b[8] = new Books("A9","T9",220,"P9");
        b[9] = new Books("A10","T10",310,"P10");

        Books max = b[0];

        for (int i = 1; i < b.length; i++) {
            if (b[i].price > max.price)
                max = b[i];
        }

        System.out.println("Highest Price Book: " + max.title);
    }
}
