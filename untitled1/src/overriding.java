class Animal{
    void display (){
        System.out.println("i am animal.");
    }
}
class Dog extends Animal{
@Override
    void display (){
        System.out.println("i am Dog.");
    }
}
public class overriding {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.display();
        Animal d=new Dog();
        d.display();


    }
}
