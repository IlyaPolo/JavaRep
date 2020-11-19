package ru.javacourse.Lesson7;

public class Cat {
    public String name;
    public int appetite;
    public boolean hunger;
    public Cat(String name, int appetite, boolean hunger) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = hunger;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

}
