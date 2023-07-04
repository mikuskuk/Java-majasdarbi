package io.codelex.classesandobjects.practice;

import static io.codelex.classesandobjects.practice.Account.transfer;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account("Account", 100.0);
        account.deposit(20.0);
        System.out.println(account);

        Account mattAccount = new Account("Martt's account", 1000);
        Account myAccount = new Account("My account", 0);
        mattAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(mattAccount);
        System.out.println(myAccount);

        Account accountA = new Account("A", 100.0);
        Account accountB = new Account("B", 0.0);
        Account accountC = new Account("C", 0.0);
        transfer(accountA, accountB, 50.0);
        transfer(accountA, accountC, 25.0);
        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);
    }

}
