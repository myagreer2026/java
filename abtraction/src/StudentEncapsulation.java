


class Student{
  private String name;
 private    String  id;
  private   float    cgpa;
void setName(String name) {
    this.name = name;
}
    String getName() {
    return name;
}
void setId(String id) {
    this.id = id;
}
    String getId() {
    return id;
}
    void setCgpa(float cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! CGPA must be between 0.0 and 4.0");
        }
    }

    float getCgpa() {
        return cgpa;
    }





    }


public class StudentEncapsulation {
    public static void main(String[] args) {
        Student[] s = new Student[3];

        // Create objects
        s[0] = new Student();
        s[1] = new Student();
        s[2] = new Student();

        // Student 1
        s[0].setName("Rara");
        s[0].setId("101");
        s[0].setCgpa(3.75f);

        // Student 2
        s[1].setName("Rahim");
        s[1].setId("102");
        s[1].setCgpa(3.50f);

        // Student 3
        s[2].setName("Karim");
        s[2].setId("103");
        s[2].setCgpa(4.00f);

        // Display details
        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Name: " + s[i].getName());
            System.out.println("ID: " + s[i].getId());
            System.out.println("CGPA: " + s[i].getCgpa());
            System.out.println();
        }
    }
}