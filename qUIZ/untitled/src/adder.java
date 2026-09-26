
class Calculator {
    void add() {
        System.out.println("No parameters");
    }
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
    void add(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }
    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
}
public class adder {public static void main(String[] args) {
    Calculator c = new Calculator();

    c.add();
    c.add(10, 20);
    c.add(5.5, 6.5);
    c.add(1, 2, 3);
}
}
