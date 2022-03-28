package demo2;

public class Animal {
    final int age;
    protected String nameOfAnimal = "animal";
    protected int breed;

    public Animal(String nameOfAnimal, int age) {
        this.nameOfAnimal = nameOfAnimal;
        this.age = age;
    }

    protected final void printHello() {
        System.out.println("hello");
    }
}