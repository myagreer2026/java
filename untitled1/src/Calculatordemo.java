
class  Calculator{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
}
public class Calculatordemo {

    public static void main(String[] args) {
        Calculator c= new Calculator();
        c.add(30,67);
        c.add(8,5,3);
        c.add(89.7,767.4);


    }

}
