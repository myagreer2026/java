
class BankAccount {
    private String accountNumber;
    private int accountHolder;
    private float balance;
    String getAccountNumber() {
        return accountNumber;
    }
    void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    int getAccountHolder() {
        return accountHolder;
    }
    void setAccountHolder(int accountHolder) {
        this.accountHolder = accountHolder;
    }
    float getBalance() {
        return balance;
    }
    void setBalance(float balance) {
        this.balance = balance;
    }
     void deposit (float n){
        if(n>0){
            balance=balance+n;
            System.out.println("deposit successfully.");
        }
      else {
            System.out.println("invalid deposit");
        }
     }
    void withdraw(float n){
        if(n==0){
            System.out.println("invalid withdraw");
        }
        else if (n > balance) {
            System.out.println("Insufficient balance!");
            System.out.println("Available balance: " + balance);
        }
        else {
            balance=balance-n;
            System.out.println(n+" "+"withdraw successfully.");
        }
    }
    }
public class BankAccountdemo {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountNumber("kjhfk899");
        b.setAccountHolder(897978);
        b.setBalance(20000);
        System.out.println("AccountHolder:" + b.getAccountHolder() + " " + "AccountNumber" + b.getAccountNumber() + " " + "balance" + b.getBalance());
        b.deposit(10000);
        System.out.println(b.getBalance());
        System.out.println();
        b.withdraw(2000000);
        System.out.println();
        b.withdraw(2000);

    }
}