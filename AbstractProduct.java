abstract class AbstractProduct {
    int product_id;

    AbstractProduct(int id) {
        product_id = id;
    }

    abstract void display();
}

class TravelGuide extends AbstractProduct {
    String name;

    TravelGuide(int id, String n) {
        super(id);
        name = n;
    }

    void display() {
        System.out.println(product_id + " " + name);
    }
}

class CD extends AbstractProduct {
    String title;

    CD(int id, String t) {
        super(id);
        title = t;
    }

    void display() {
        System.out.println(product_id + " " + title);
    }
}

class TestProduct {
    public static void main(String[] args) {
        AbstractProduct p;

        p = new TravelGuide(1, "India Guide");
        p.display();

        p = new CD(2, "Music Album");
        p.display();
    }
}
