class NoSufficient extends Exception {
    public NoSufficient(String message) {
        super(message);
    }
}

class Bank {
    private int a = 2000;

    public void withdraw(int b) throws NoSufficient {
        if (b > a) {
            throw new NoSufficient("Not sufficient money.");
        }

        a -= b;
        System.out.println(b + " withdrawn successfully.");
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();

        try {
            bank.withdraw(5000);
        } catch (NoSufficient e) {
            System.out.println(e.getMessage());
        }
    }
}
