package io.codelex.collections.practice.phonebook;

public class PhoneDirectoryTest {
    public static void main(String[] args) {
        PhoneDirectory testDirectory = new PhoneDirectory();

        testDirectory.putNumber("John", "1234567");
        testDirectory.putNumber("Mark", "1212121");
        testDirectory.putNumber("Mike", "7654321");

        System.out.println("John's number is " + testDirectory.getNumber("John"));
        System.out.println("Mark's number is " + testDirectory.getNumber("Mark"));
        System.out.println("Mike's number is " + testDirectory.getNumber("Mike"));

        testDirectory.putNumber("John", "1234569");

        System.out.println("John's new number is " + testDirectory.getNumber("John"));

        System.out.println("Angel's number is " + testDirectory.getNumber("Angel"));
    }
}
