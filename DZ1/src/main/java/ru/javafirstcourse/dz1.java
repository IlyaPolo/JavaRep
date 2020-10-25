package ru.javafirstcourse;

public class dz1 {
    public static void main(String[] args) {  //Задание 1 и 2
        byte a = 127;
        short b = 32767;
        char c = 'c';
        int d = 2147483647;
        long e = 9223372036854775807L;
        float f = 3.1f;
        double g = 3.14;
        String h = "Hello World!";
        boolean tr = true; // или false;
        System.out.println(getSum());
        System.out.println(getBoolean(5,10));
        getMath(-20);
        System.out.println(five(-4));
        getString("Илья");
        getYear(1800);

    }

    private static int getSum(){ // Задание 3
        int a = 2;
        int b = 3;
        int c = 10;
        int d = 2;
        int sum = a * (b + (c / d));
        return sum;
    }


    private static boolean getBoolean (int a, int b){ // задание 4
        int sum = a + b;
        if ((sum >= 10) & (sum <= 20)){
            return true;
        } else return false;
    }

    private static void getMath(int a) { // задание 5
        if (a >= 0){
            System.out.println("Положительное число");
        } else System.out.println("Отрицотельное число");
    }

    private static boolean five (int a){ // задание 6
        if (a>0){
            return false;
        } else return true;
    }

    private static void getString (String s){ // задание 7
        System.out.println("Привет, " + s);
    }

    private static void getYear (int year){ // задание 8
        if (((year %4 == 0) && (year %100 != 0)) || (year %400 == 0)){
            System.out.println("Год " + year + " високосный");
        } else System.out.println("Год " + year + " обычный");
    }


}
