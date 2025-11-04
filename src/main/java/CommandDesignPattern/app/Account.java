package CommandDesignPattern.app;
//RECEIVER
//Es el que sabe cómo moverse. Tiene los métodos concretos (move(dx, dy), cambiar coordenadas, etc.).
public class Account {
    private Integer id;
    private Double balance;

    public Account(Integer id, Double balance) {
        this.id = id;
        this.balance = balance;
    }
    
    public void withdraw(Double amount) {
        this.balance = this.balance - amount;
        System.out.println("[WITHDRAW COMMAND] ACCOUNT: " + this.id + "BALANCE: " + this.balance);
    }

    public void deposit(Double amount) {
        this.balance = this.balance + amount;
        System.out.println("[DEPOSIT COMMAND] ACCOUNT: " + this.id + "BALANCE: " + this.balance);
    }
}
