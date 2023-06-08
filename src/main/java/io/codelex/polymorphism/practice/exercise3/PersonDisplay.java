package io.codelex.polymorphism.practice.exercise3;

public class PersonDisplay {

    public static void main(String[] args) {
        Person student = new Student("John", "Jones", "Big Lane 13, London", 1310, 3.5);
        Person employee = new Employee("Mary", "Lewis", "Small Lane 13, London", 1311, "Manager");

        student.display();
        System.out.println();
        employee.display();
    }
}
