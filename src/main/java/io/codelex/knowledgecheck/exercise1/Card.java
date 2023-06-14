package io.codelex.knowledgecheck.exercise1;

public abstract class Card {
    protected String number;
    protected String owner;
    protected String ccv;
    protected double balance;

    public Card(String number, String owner, String ccv, double balance) {
        this.number = number;
        this.owner = owner;
        this.ccv = ccv;
        this.balance = balance;
    }

    public abstract void addMoney(double amount);

    public abstract void takeMoney(double amount) throws NotEnoughFundsException;

    @Override
    public String toString() {
        return "Card " +
                "number='" + number + '\'' +
                ", owner='" + owner + '\'' +
                ", CCV='" + ccv + '\'' +
                ", balance=" + balance;
    }
}
