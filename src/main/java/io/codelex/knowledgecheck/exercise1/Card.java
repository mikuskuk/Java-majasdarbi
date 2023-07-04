package io.codelex.knowledgecheck.exercise1;

import java.math.BigDecimal;

public abstract class Card {
    protected String number;
    protected String owner;
    protected String ccv;
    protected BigDecimal balance;

    public Card(String number, String owner, String ccv, BigDecimal balance) {
        this.number = number;
        this.owner = owner;
        this.ccv = ccv;
        this.balance = balance;
    }

    public abstract void addMoney(BigDecimal amount);

    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
        if (amount.compareTo(balance) <= 0) {
            balance = balance.subtract(amount);
        } else {
            throw new NotEnoughFundsException("Not enough funds!");
        }
    }

    @Override
    public String toString() {
        return "Card " +
                "number='" + number + '\'' +
                ", owner='" + owner + '\'' +
                ", CCV='" + ccv + '\'' +
                ", balance=" + balance;
    }
}
