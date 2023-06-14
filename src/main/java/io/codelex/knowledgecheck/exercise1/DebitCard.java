package io.codelex.knowledgecheck.exercise1;

public class DebitCard extends Card {

    public DebitCard(String number, String owner, String ccv, double balance) {
        super(number, owner, ccv, balance);
    }

    @Override
    public void addMoney(double amount) {
        balance += amount;
        if (balance > 10000) {
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            throw new NotEnoughFundsException("Not enough funds!");
        }
    }
}
