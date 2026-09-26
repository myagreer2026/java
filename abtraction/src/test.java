public class test {

    public static void main(String[] args) {
        try {
            int a = 17;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero "+e);
        }
        System.out.println("my name is rafi");
    }

}