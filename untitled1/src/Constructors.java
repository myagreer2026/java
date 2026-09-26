
class Circle{
   int radius;
    Circle(){

    }
    Circle(int r){
        radius=r;
    }
    void area (){
        System.out.println(Math.PI*radius*radius);
    }
}
public class Constructors {
    public static void main(String[] args) {
        Circle []c=new Circle[2];
        c[0]=new Circle();
        c[1]=new Circle(5);
        c[1].area();
    }
}
