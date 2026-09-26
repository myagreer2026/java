
class BankAccounts{
       private String  accountNumber;
       private int    balance;
      String  getAccountNumber(){
          return accountNumber;
      }
      void setAccountNumber(String accountNumber){
          this.accountNumber=accountNumber;
      }
    int  getBalance(){
        return balance;
    }
    void setBalance(int balance){
        this.balance=balance;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        BankAccounts b=new BankAccounts();
        b.setAccountNumber("erye6474");
        System.out.println(b.getAccountNumber());//must
        b.setBalance(657);
        System.out.println(b.getBalance());//must
    }
    }
