package ru.javacourse.lesson6;

public class Dog extends  Animals {
    public Dog(String name){
        super(name);
        this.jump = 0.5;
        this.run = random.nextInt(200) + 300;
        this.swim = random.nextInt(2) + 8;
        this.animalCreature = "Dog";
    }
}
