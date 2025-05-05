package multithrading;

public class WithdrawTask implements Runnable{
    private BankAccount bankAccount;
    public WithdrawTask(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }
    @Override
    public void run() {
        bankAccount.withdraw(800);
    }
}
