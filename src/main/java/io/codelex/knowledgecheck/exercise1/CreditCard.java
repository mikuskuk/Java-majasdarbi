package io.codelex.knowledgecheck.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(String number, String owner, String ccv, BigDecimal balance) {
        super(number, owner, ccv, balance);
    }

    @Override
    public void addMoney(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
        super.takeMoney(amount);
        if (balance.compareTo(BigDecimal.valueOf(100)) < 0) {
            System.out.println("Warning: Low funds");
        }
    }
}
