package io.codelex.knowledgecheck.exercise1;

public class CardApp {

    public static void main(String[] args) throws NotEnoughFundsException {
        CreditCard creditCard = new CreditCard("123", "John Smith", "123", 350.0);
        System.out.println("Credit card details: " + creditCard);

        creditCard.addMoney(200.0);
        creditCard.takeMoney(700.0);

        System.out.println("Credit card details after transactions: " + creditCard);

        DebitCard debitCard = new DebitCard("345", "Ricky Smith", "345", 100.0);
        System.out.println("\nDebit card details: " + debitCard);

        debitCard.addMoney(2000.0);
        debitCard.takeMoney(1000.50);

        System.out.println("Debit card details after transactions: " + debitCard);
    }


}
