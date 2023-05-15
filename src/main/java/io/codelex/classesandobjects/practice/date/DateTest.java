package io.codelex.classesandobjects.practice.date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(4, 13, 1993);

        date.displayDate();

        date.setDay(5);
        date.setMonth(8);
        date.setYear(1991);

        date.displayDate();

        date.setDay(31);
        date.setMonth(12);
        date.setYear(2020);

        System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
    }
}
