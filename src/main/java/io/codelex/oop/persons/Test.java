package io.codelex.oop.persons;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Brown", "1", 25, "Accountant", LocalDate.of(2016, 5, 25));

        System.out.println(employee.getInfo());

        Customer customer = new Customer("Peter", "Brown", "1234", 30, "CID1234", 10);

        System.out.println(customer.getInfo());
    }
}
