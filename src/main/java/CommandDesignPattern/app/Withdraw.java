package CommandDesignPattern.app;
//Define qué acción se debe realizar y sobre qué receiver.
public class Withdraw implements IOperacion {
    private Account account;
    private Double amount;

    public Withdraw(Account anAccount, double anAmount) {
        this.account = anAccount;
        this.amount = anAmount;
    }

    @Override
    public void execute() {
        this.account.withdraw(this.amount);
    }

}
