package exercicios_sec09.entities;

public class BankAccount {
    private int number;
    private String holder;
    private double money;

    public BankAccount(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public BankAccount(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getMoney() {
        return money;
    }

    public void deposit(double amount) {
        this.money += amount;
    }

    public void withdrawal(double amount) {
        this.money -= (amount + 5.00);
    }

    @Override
    public String toString() {
        return "Account: " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%2f", money);
    }
}
