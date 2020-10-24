package ru.javacourse;

public class hm3 {
    public static void main(String[] args) {
        System.out.println(getSum());
    }

    public static int getSum(){
        int a = 2;
        int b = 3;
        int c = 10;
        int d = 2;
        int sum = a * (b + (c / d));
        return sum;
    }
}
