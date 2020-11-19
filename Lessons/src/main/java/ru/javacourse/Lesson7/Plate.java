package ru.javacourse.Lesson7;

public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void setFood(int food) {
        this.food += food;
    }
}
