package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class ServerLaunch {
    public static void main(String[] args) {
        LocalDate serverLaunch = LocalDate.of(2022, 8, 2);
        int year = 2022;
        Month month = Month.OCTOBER;

        List<LocalDate> daysOfUpdate = updateDays(serverLaunch, year, month);
        System.out.println("Server update days for " + month + " " + year + ": ");
        for (LocalDate date : daysOfUpdate) {
            System.out.println(date);
        }
    }

    private static List<LocalDate> updateDays(LocalDate serverLaunch, int year, Month month) {
        List<LocalDate> daysOfUpdate = new ArrayList<>();

        LocalDate currentDate = serverLaunch;

        while (currentDate.getMonth() == month || currentDate.getMonthValue() < month.getValue()) {
            if (currentDate.getMonth() == month) {
                daysOfUpdate.add(currentDate);
            }
            currentDate = currentDate.plusDays(14);
        }

        return daysOfUpdate;
    }
}
