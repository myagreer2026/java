class Shape {

    void display() {
        System.out.println("Shape");
    }

    void area() {
        System.out.println("Shape Area");
    }
}

class Circle extends Shape {

    @Override
    void display() {
        System.out.println("Circle");
    }

    @Override
    void area() {
        int r = 5;
        System.out.println("Circle Area = " + Math.PI * r * r);
    }
}

class Rectangle extends Shape {

    @Override
    void display() {
        System.out.println("Rectangle");
    }

    @Override
    void area() {
        int a = 5;
        int b = 7;
        System.out.println("Rectangle Area = " + a * b);
    }
}

class Triangle extends Shape {

    @Override
    void display() {
        System.out.println("Triangle");
    }

    @Override
    void area() {
        float b = 4;
        float h = 8;
        System.out.println("Triangle Area = " + 0.5 * b * h);
    }
}

public class Main {

    public static void main(String[] args) {

        Shape[] s = new Shape[3];

        s[0] = new Circle();
        s[1] = new Rectangle();
        s[2] = new Triangle();

        for (Shape v : s) {
            v.display();
            v.area();
            System.out.println();
        }
    }
}