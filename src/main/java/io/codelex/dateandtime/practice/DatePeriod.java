package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    LocalDate start;
    LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod other) {
        if (!isOverlapping(other)) {
            return null;
        }

        LocalDate intersectionStart = start.isBefore(other.getStart()) ? other.getStart() : start;
        LocalDate intersectionEnd = end.isAfter(other.getEnd()) ? other.getEnd() : end;

        return new DatePeriod(intersectionStart, intersectionEnd);
    }

    private boolean isOverlapping(DatePeriod other) {
        return !(end.isBefore(other.getStart()) || start.isAfter(other.getEnd()));
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }
}
