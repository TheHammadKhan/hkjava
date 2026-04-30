import java.util.Scanner;

abstract class ThreeDObject {
    abstract double volume();
    abstract double wholeSurfaceArea();
}

class Box extends ThreeDObject {
    double l, w, h;

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    double volume() {
        return l * w * h;
    }

    double wholeSurfaceArea() {
        return 2 * (l*w + w*h + h*l);
    }
}

class Cube extends ThreeDObject {
    double a;

    Cube(double a) {
        this.a = a;
    }

    double volume() {
        return a * a * a;
    }

    double wholeSurfaceArea() {
        return 6 * a * a;
    }
}

class Cylinder extends ThreeDObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double volume() {
        return Math.PI * r * r * h;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }
}

class Cone extends ThreeDObject {
    double r, h;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double volume() {
        return (1.0/3) * Math.PI * r * r * h;
    }

    double wholeSurfaceArea() {
        double l = Math.sqrt(r*r + h*h);
        return Math.PI * r * (r + l);
    }
}

class Test3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ThreeDObject obj;

        obj = new Box(2,3,4);
        System.out.println(obj.volume());
        System.out.println(obj.wholeSurfaceArea());

        obj = new Cube(3);
        System.out.println(obj.volume());
        System.out.println(obj.wholeSurfaceArea());

        obj = new Cylinder(2,5);
        System.out.println(obj.volume());
        System.out.println(obj.wholeSurfaceArea());

        obj = new Cone(2,5);
        System.out.println(obj.volume());
        System.out.println(obj.wholeSurfaceArea());
    }
}
