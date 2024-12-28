package OOP;

class Bank {
    private double balance;

    public Bank ( double balance ) {
        this.balance = balance;
    }

    // Getter
    public double getBalance () {
        return this.balance;
    }

    // Setter
    public void deposite ( double amount ) {
        if (amount < 0) {
            System.out.println("Invalid Amount");
            return;
        } 

        this.balance += amount;
    }


}

public class Encapsulation {
    public static void main(String[] args) {
        Bank account = new Bank(10000);
        System.out.println(account.getBalance());
        
        account.deposite(15000);
        System.out.println(account.getBalance());
    }
}
