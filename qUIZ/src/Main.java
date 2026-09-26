class person{
 String name ="Omayed";

 void display(){
     System.out.println("Name ="+ name);
    }
}
class Employee extends person{
    int id =85;

    void display(){
        System.out.println("Name ="+ name);
        System.out.println("Id = "+ id);
    }
}
class Manager extends Employee{
    String Company ="iShowSpeed";

    void display() {
        System.out.println("Name ="+ name);
        System.out.println("Id = "+ id);
        System.out.println("Company = "+ Company);
    }
}






public class Main {
    public static void main(String[] args) {
        person p = new person();
        Employee e = new Employee();
        Manager M = new Manager();

        p.display();
        e.display();
        M.display();
    }
}