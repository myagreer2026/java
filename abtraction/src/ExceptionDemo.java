class NoSuff extends Exception {
    public NoSuff(String message) {
        super(message);
    }
}class Bank {
    int a;
    Bank(int a) {
        this.a = a;
    }
    public void draw(int b) throws NoSuff {
        if (b > a) {
            throw new NoSuff("No sufficient balance");
        } else {
            a = a - b;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + a);
        }
    }
}
public class ExceptionDemo {
    public static void main(String[] args) {
        Bank b = new Bank(1000);
        try {
            b.draw(1800);
        } catch (NoSuff e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}