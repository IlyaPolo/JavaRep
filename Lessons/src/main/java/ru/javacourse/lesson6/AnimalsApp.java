package ru.javacourse.lesson6;

public class AnimalsApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Рокки");
        Dog dog2 = new Dog("Джерри");
        Cat cat1 = new Cat("Бася");
        Cat cat2 = new Cat("Кучепух");
        cat1.animalSwim(30);
        cat1.animalRun(100);

    }
}
