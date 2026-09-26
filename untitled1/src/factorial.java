import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
       int fac=1;

        for(int i =n;i>=1;i--){
            fac=fac*i;
        }
        System.out.println("fact:"+fac);

    }
}
