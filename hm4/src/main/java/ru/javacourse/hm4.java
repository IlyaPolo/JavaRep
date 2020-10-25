package ru.javacourse;

public class hm4 {
    public static void main(String[] args) {
        System.out.println(getBoolean(5,10));
        getMath(-20);
        System.out.println(five(-4));
        getString("Илья");
        getYear(1800);

    }

    public static boolean getBoolean (int a, int b){ // задание 4
        int sum = a + b;
        if ((sum >= 10) & (sum <= 20)){
            return true;
        } else return false;
    }

    public static void getMath(int a) { // задание 5
        if (a >= 0){
            System.out.println("Положительное число");
        } else System.out.println("Отрицотельное число");
    }

    public static boolean five (int a){ // задание 6
        if (a>0){
            return false;
        } else return true;
    }

    public static void getString (String s){ // задание 7
        System.out.println("Привет, " + s);
    }

    public static void getYear (int year){ // задание 8
        if (((year %4 == 0) && (year %100 != 0)) || (year %400 == 0)){
            System.out.println("Год " + year + " високосный");
        } else System.out.println("Год " + year + " обычный");
    }

}

