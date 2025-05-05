package multithrading;

public class BankAccount {
    private int balance= 2000;

    synchronized void withdraw(int amount){
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName()+
                    " is withdrawing = "+ amount);
            balance -= amount;
            // balance = balance - amount;
            System.out.println("Remaining Balance = "+ balance);
        } else {
            System.out.println("Insufficient balance " + Thread.currentThread().getName());
        }
    }
}
