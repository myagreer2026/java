
interface Playable{
    void play();
}
class Football implements Playable{
    public void play(){
        System.out.println("Football is Playable.");
            }
}
class Guitar implements Playable{
    public void play(){
        System.out.println("Guitar is Playable.");
    }
}
public class demo {
    public static void main(String[] args) {
        Playable f=new Football();
        Playable g=new Guitar();
        f.play();
        g.play();
    }
}
