package ru.javacourse.lessonFive;

public class MainClass {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Илья", "Инженер", "gmail", "909-908", 70000, 25);
        empArray[1] = new Employee("Николай", "Инженер", "gmail", "905-281", 65000, 27);
        empArray[2] = new Employee("Матвей", "Инженер", "gmail", "909-564", 62000, 40);
        empArray[3] = new Employee("Сергей", "Инженер", "gmail", "985-362", 80000, 45);
        empArray[4] = new Employee("Игорь", "Инженер", "gmail", "925-171", 80000, 50);

        for (int i = 0; i <+ empArray.length; i++) {
            if (empArray[i].getAge() >= 40){
                System.out.println("Сотрудники старше 40 лет: " + empArray[i].getFio());
            }

        }
    }


}
