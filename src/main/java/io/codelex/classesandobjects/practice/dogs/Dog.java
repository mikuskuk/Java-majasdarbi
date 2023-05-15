package io.codelex.classesandobjects.practice.dogs;

public class Dog {
    private String name;
    private String sex;
    private Dog mother;
    private Dog father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, String sex, Dog mother, Dog father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public String fathersName() {
        if (father == null) {
            return "Unknown";
        } else {
            return father.getName();
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (mother == null || otherDog.getMother() == null) {
            return false;
        }
        return mother.getName().equals(otherDog.getMother().getName());
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Dog getMother() {
        return mother;
    }

    public Dog getFather() {
        return father;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
