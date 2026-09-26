class Transport{
void start(){
    System.out.println("Transport Starts");
}
    void stop(){
        System.out.println("Transport stops");
    }
}
class Bus extends Transport {
    @Override
    void start(){
        System.out.println("Bus Starts");
    }
    void stop(){
        System.out.println("Bus stops");
    }
}
class Car extends Transport{
    @Override
    void start(){
        System.out.println("Car Starts");
    }
    void stop(){
        System.out.println("Car stops");
    }
}
class Riskshaw extends Transport{
    @Override
    void start(){
        System.out.println("Riskshaw Starts");
    }
    void stop(){
        System.out.println("Riskshaw stops");
    }
}
public class Main {
    public static void main(String[] args) {
      Transport[] vehicles={ new Bus(), new Car(), new Riskshaw() };
      for(Transport t :vehicles){
          t.start();
          t.stop();
      }

  }
}