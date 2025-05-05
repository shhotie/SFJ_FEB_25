package multithrading;

public class SynchExample {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        WithdrawTask task = new WithdrawTask(bankAccount);
        Thread t1 = new Thread(task, "User1");
        Thread t2 = new Thread(task, "User2");
        Thread t3 = new Thread(task, "User3");

        t1.start();
        t2.start();
        t3.start();
    }
}
