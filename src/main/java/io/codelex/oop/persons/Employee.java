package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {
    private final String position;
    private final LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        LocalDate current = LocalDate.now();
        Period period = Period.between(startedWorking, current);
        return period.getYears();
    }

    @Override
    public String getInfo() {
        int howLongHasBeenWorking = getWorkExperience();
        return position + " " + getFirstName() + " " + getLastName() + " (" + getWorkExperience() + " years)";
    }
}
