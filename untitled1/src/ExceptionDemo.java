 class ExceptionDemo {
     public static void main(String[] args) {
         System.out.println("rafi");
         try{
         int a =19;
         int b=0;
         int c=a/b;
         System.out.println(c);
         }catch(ArithmeticException e){
            System.out.println(e);
             System.out.println("error");
         }
         finally {
             System.out.println("i am cse student ");
         }
         }


}




