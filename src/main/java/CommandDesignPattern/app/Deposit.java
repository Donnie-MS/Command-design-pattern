package CommandDesignPattern.app;

public class Deposit implements IOperacion{
    private Account account;
    private Double amount;

    public Deposit(Account account, Double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        this.account.deposit(this.amount);
    }
}
