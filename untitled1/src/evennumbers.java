import java.util.Scanner;

public class evennumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Even numbers in reverse order:");

        for (int i = a.length - 1; i >= 0; i--) {

            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }

        }
    }
}