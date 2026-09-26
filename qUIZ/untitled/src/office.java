class Person {

    void idfunction(String name) {
        System.out.println("Name: " + name);
    }

    void display() {
        System.out.println("I am Person");
    }
}

class Employers extends Person {

    @Override
    void display() {
        System.out.println("I am Employers");
    }
}

class Manager extends Person {

    @Override
    void display() {
        System.out.println("I am Manager");
    }
}

public class office {

    public static void main(String[] args) {

        Person p = new Person();
        Employers e = new Employers();
        Manager m = new Manager();

        p.display();
        e.display();
        m.display();

        p.idfunction("John");
        e.idfunction("Alice");
        m.idfunction("David");
    }
}