
abstract class Appliance {
    abstract void operate();
}
class Fan extends Appliance{
    @Override
    void operate(){
        System.out.println("here is Fan");
    }
}
class WashingMachine extends Appliance {
@Override
     void operate(){
         System.out.println("here is WashingMachine");
     }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Appliance a =new Fan();
        a.operate();
        Appliance b =new WashingMachine();
        b.operate();

    }
}