package ru.javacourse.lesson6;

import java.util.Random;

public class Animals {
    protected String name;
    protected String animalCreature;
    protected int run;
    protected int swim;
    protected double jump;
    public Random random = new Random();

    public Animals(String name){
        this.name = name;
    }

    public void animalRun(int distance){
        if (this.run >= distance) System.out.println(this.animalCreature + " " + this.name + " пробежит " + distance  + " m");
        else System.out.println(this.animalCreature + " " + this.name + " не может так далеко бегать. Устанет.");
    }

    public void animalSwim(int distance){
        if (this.swim >= distance) System.out.println(this.animalCreature + " " + this.name + "проплывет " + distance  + " m");
        else System.out.println(this.animalCreature + " " + this.name + "не проплывет " + distance  + " m");
    }

    public void animalJump(double high){
        if (this.jump >= high) System.out.println(this.animalCreature + " " + this.name + "запрыгнет на высоту: " + high  + " m");
        else System.out.println(this.animalCreature + " " + this.name + "не запрыгнет на высоту: " + high  + " m");
    }
}
