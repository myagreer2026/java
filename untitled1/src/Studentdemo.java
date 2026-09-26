import java.util.Scanner;

class Student {
    String name;
    int roll;
    String department;
}

public class Studentdemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[5];//array

        // Input
        for (int i = 0; i < 5; i++) {

            s[i] = new Student();// object

            System.out.println((i + 1) + " no. student");

            System.out.println("Enter name:");
            s[i].name = sc.nextLine();

            System.out.println("Enter roll:");
            s[i].roll = sc.nextInt();
            sc.nextLine();   // consume Enter

            System.out.println("Enter department:");
            s[i].department = sc.nextLine();

            System.out.println();
        }

        // Output
        for (int i = 0; i < 5; i++) {

            System.out.println((i + 1) + " no. student");
            System.out.println("Name: " + s[i].name);
            System.out.println("Roll: " + s[i].roll);
            System.out.println("Department: " + s[i].department);

            System.out.println();
        }
    }
}