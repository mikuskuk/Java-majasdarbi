package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class OfficeHours {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2022, 6, 1);
        LocalDate end = LocalDate.of(2023, 5, 23);

        int hoursWorked = workingHours(start, end);
        System.out.println("You have worked a total of " + hoursWorked + " hours from " + start + " to " + end);
    }

    private static int workingHours(LocalDate start, LocalDate end) {
        int hoursWorked = 0;
        LocalDate currentDate = start;

        while (!currentDate.isAfter(end)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                hoursWorked += 8;
            }

            currentDate = currentDate.plusDays(1);
        }

        return hoursWorked;
    }
}
