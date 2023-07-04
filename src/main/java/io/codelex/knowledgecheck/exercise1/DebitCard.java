package io.codelex.knowledgecheck.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(String number, String owner, String ccv, BigDecimal balance) {
        super(number, owner, ccv, balance);
    }

    @Override
    public void addMoney(BigDecimal amount) {
        balance = balance.add(amount);
        if (balance.compareTo(BigDecimal.valueOf(10000)) > 0) {
            System.out.println("Warning: Too much money");
        }
    }

}
