class Book {
    String title;
    String author;
    float price;

    Book(String t, String a, float p) {
        title = t;
        author = a;
        price = p;
    }
    void display(){
        System.out.println("title:"+title+" "+"author:"+author+" "+"price:"+price);
    }
}
public class Bookdemo {
    public static void main(String[] args) {
        Book b=new Book("ragdsg","tsgs",678);
        b.display();
    }

}
