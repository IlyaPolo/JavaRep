package ru.javacourse.Lesson7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Макс", 10, false);
        cats[1] = new Cat("Кекс", 15, false);
        cats[2] = new Cat("Мурзик", 5, false);
        cats[3] = new Cat("Барсик", 10, false);
        cats[4] = new Cat("Пушистый", 20, false);


        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].hunger == false && cats[i].appetite < plate.food){
                cats[i].eat(plate);
                cats[i].hunger = true;
                System.out.println("Котик " + cats[i].name + " покушал.");
            } else System.out.println("Котик " + cats[i].name + " не покушал. Кончилась еда.");
        }

        plate.info();
        plate.setFood(60);
        plate.info();
    }

}
