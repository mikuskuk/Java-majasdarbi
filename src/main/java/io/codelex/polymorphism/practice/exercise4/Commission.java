package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {

    double totalSales;
    double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        totalSales = 0;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double payment = super.pay() + (commissionRate * totalSales);
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + totalSales;
        return result;
    }
}
