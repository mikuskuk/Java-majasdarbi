package io.codelex.classesandobjects.practice;

public class Bank {

    public static void main(String[] args) {
        BankAccount benben = new BankAccount("Benson", 17.5);
        System.out.println(benben.toString());

        benben.deposit(300);
        System.out.println(benben.toString());

        benben.withdraw(500);
        System.out.println(benben.toString());
    }

}
