package io.codelex.classesandobjects.practice.dogs;

public class DogTest {
    public static void main(String[] args) {
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog sam = new Dog("Sam", "male");
        Dog sparky = new Dog("Sparky", "male");
        Dog rocky = new Dog("Rocky", "male", molly, sam);
        Dog max = new Dog("Max", "male", lady, rocky);
        Dog buster = new Dog("Buster", "male", lady, sparky);
        Dog coco = new Dog("Coco", "female", molly, buster);

        System.out.println(max);

        System.out.println(coco.fathersName());
        System.out.println(sparky.fathersName());

        System.out.println(coco.hasSameMotherAs(rocky));
    }
}
