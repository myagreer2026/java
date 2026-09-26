
class Person1{
    void display(){
        System.out.println("I am Person ");}
}
class Employers extends Person1{
    void display(){
        System.out.println("I am Employers ");}
}
class Manager extends Employers{
    void display(){
        System.out.println("I am Manager");}
}

public class inherit {
    public static void main(String[] args) {

       Person1 p=new Person1();
       Employers e=new Employers();
       Manager m =new Manager();
       p.display();
       e.display();
       m.display();

    }
}
