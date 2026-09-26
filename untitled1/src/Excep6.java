public class Excep6 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("going to divide.");
                int a = 29 / 0;

            } catch (ArithmeticException e) {
                System.out.println(e);
                          }
            try {
                int[] arr = new int[3];
                arr[4] = 45;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.println("other statement");
            }
        }catch (Exception e){
            System.out.println("handled");
        }
        System.out.println("normal flow");
    }

}