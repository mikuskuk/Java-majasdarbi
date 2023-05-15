package io.codelex.classesandobjects.practice.savingsaccount;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#,##0.00");

        System.out.print("How much money is in the account?: ");
        double startingBalance = input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("How long has the account been opened?: ");
        int months = input.nextInt();

        SavingsAccount account = new SavingsAccount(startingBalance);
        account.setAnnualInterestRate(annualInterestRate);

        double totalDeposits = 0;
        double totalWithdraws = 0;

        for (int i = 1; i <= months; i++) {
            System.out.print("Enter amount deposited for month " + i + ": ");
            double depositAmount = input.nextDouble();
            account.deposit(depositAmount);
            totalDeposits += depositAmount;

            System.out.print("Enter amount withdrawn for " + i + ": ");
            double withdrawAmount = input.nextDouble();
            account.withdraw(withdrawAmount);
            totalWithdraws += withdrawAmount;

            account.addMonthlyInterest();
        }

        double endingBalance = account.getBalance();
        double totalInterestEarned = endingBalance - startingBalance - totalDeposits + totalWithdraws;

        System.out.println("Total deposited: $" + decimal.format(totalDeposits));
        System.out.println("Total withdrawn: $" + decimal.format(totalWithdraws));
        System.out.println("Interest earned: $" + decimal.format(totalInterestEarned));
        System.out.println("Ending balance: $" + decimal.format(endingBalance));
    }
}
