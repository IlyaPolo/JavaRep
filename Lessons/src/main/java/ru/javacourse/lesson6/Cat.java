package ru.javacourse.lesson6;

public class Cat extends Animals {
    public Cat(String name){
        super(name);
        this.run = random.nextInt(45) + 155;
        this.jump = 2.0;
        this.animalCreature = "Cat";
    }

    @Override
    public void animalSwim(int distance){
        System.out.println("Котя не плавает. Нельзя ушки мочить.");
    }
}
