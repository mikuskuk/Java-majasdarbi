package io.codelex.arithmetic.practice;

public class FooCorporation {
    public static void main(String[] args) {
        double basePayEmployee1 = 7.50;
        int hoursWorkedEmployee1 = 35;
        calculatePay(basePayEmployee1, hoursWorkedEmployee1);
        System.out.println();

        double basePayEmployee2 = 8.20;
        int hoursWorkedEmployee2 = 47;
        calculatePay(basePayEmployee2, hoursWorkedEmployee2);
        System.out.println();

        double basePayEmployee3 = 10.00;
        int hoursWorkedEmployee3 = 73;
        calculatePay(basePayEmployee3, hoursWorkedEmployee3);
    }


    public static void calculatePay(double basePay, int hoursWorked) {
        double finalPay = 0;

        if (basePay <= 8.0) {
            System.out.println("Base pay too low.");
        } else if (hoursWorked <= 40) {
            finalPay = basePay * hoursWorked;
            System.out.println("Total pay for " + hoursWorked + " hours worked: $" + finalPay);
        } else if (hoursWorked <= 60) {
            finalPay = (basePay * 40) + ((hoursWorked - 40) * 1.5);
            System.out.println("Total pay for " + hoursWorked + " hours worked: $" + finalPay);
        } else {
            System.out.println("Too many hours worked!");
        }
    }
}
