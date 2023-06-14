package io.codelex.knowledgecheck.exercise1;

public class CreditCard extends Card {

    public CreditCard(String number, String owner, String ccv, double balance) {
        super(number, owner, ccv, balance);
    }

    @Override
    public void addMoney(double amount) {
        balance += amount;
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        if (amount <= balance) {
            balance -= amount;
            if (balance < 100) {
                System.out.println("Warning: Low funds");
            }
        } else {
            throw new NotEnoughFundsException("Not enough funds!");
        }
    }
}
