class Transport{
    void start(){
        System.out.println("Start The Engine");
    }void stop(){
        System.out.println("Stop The Engine");
    }
}
class Bus extends Transport{
    void start(){
        System.out.println("Start The Bus Engine");
    }void stop(){
        System.out.println("Stop The Bus Engine");
    }
}
class Car extends Transport{
    void start(){
        System.out.println("Start The Car Engine");
    }void stop(){
        System.out.println("Stop The Car Engine");
    }
}
class Rickshaw extends Transport{
    void start(){
        System.out.println("Start The Journey");
    }void stop(){
        System.out.println("Stop The Journey");
    }
}



public class polymorphism {
    public static void main(String[]args){
    Transport[] T =new Transport[3];

        T[0]=new Bus();
        T[1]=new Car();
        T[2]=new Rickshaw();

        for (int i = 0; i <3 ; i++) {
            Transport t = T[i];
            t.start();
            t.stop();
        }
    }
}
