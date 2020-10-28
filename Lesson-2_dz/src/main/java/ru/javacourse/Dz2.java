package ru.javacourse;

import java.util.Arrays;

public class Dz2 {
    public static void main(String[] args) {
        int[] arrayOne = {1,0,1,0,1,1,0,0};  // задание 1
        for (int i = 0; i < 8; i++) {
            if (arrayOne[i] == 1) {
                arrayOne[i] = 0;
            }else arrayOne[i] = 1;
        }
        System.out.println(Arrays.toString(arrayOne));
//-----------------------------------------------------------------------------
        int[] arrayTwo = new int[8]; // Задание 2
        int value = 0;
        for (int i = 0; i < 8; i++) {
            arrayTwo[i] = value;
            value +=3;
        }
        System.out.println(Arrays.toString(arrayTwo));
//-----------------------------------------------------------------------------

        int [] arrayThree = {1,5,3,2,11,4,5,2,4,8,9,1}; // Задание 3
        for (int i = 0; i < 12; i++) {
            if (arrayThree[i] < 6){
                arrayThree[i] = arrayThree[i]*2;
            }
        }
        System.out.println(Arrays.toString(arrayThree));
//-----------------------------------------------------------------------------

        int[][] arrayFour = new int[4][4];  //Задание 4
        for (int i = 0; i < arrayFour.length; i++) {
            for (int j = 0; j < arrayFour.length; j++) {
                if (i == j){
                    arrayFour[i][j] = 1;
                } else arrayFour[i][j] = 0;
            }
        }

        for (int i = 0; i < arrayFour.length; i++) {
            for (int j = 0; j < arrayFour.length; j++) {
                System.out.print(arrayFour[i][j] + "\t");
            }
            System.out.println();
        }
//-----------------------------------------------------------------------------

        int[] arrayFive = {2,3,1,4,5,10,11}; //Задание 5
        int min = arrayFive[0];
        int max = arrayFive[0];
        for (int i: arrayFive){
            if (i < min){
                min = i;
            }
        }

        for (int i: arrayFive) {
            if (i > max){
                max = i;
            }
        }
        System.out.println("Минимум массива: " + min);
        System.out.println("Максимум массива: " + max);


        System.out.println(getBool(new int[]{1, 1, 1, 2, 1}));
        getSwitch(new int[]{1,2,3,4,5},2);

    }
//-----------------------------------------------------------------------------

    private static boolean getBool(int[] arraySix){ //Задание 6... Сложно.
        int left = 0;
        for (int i = 0; i < arraySix.length; i++) {
            left += arraySix[i];
            int right = 0;
            for (int j = 0; j < arraySix.length; j++) {
                if (j > i){
                    right += arraySix[j];
                }

            }
            if (left == right){
                return true;
            }
        }
        return false;
    }
    //-----------------------------------------------------------------------------
    private static void getSwitch(int[] arraySeven, int num){ //Задание 7... Очень сложно
        System.out.print("Source: ");
        System.out.println(Arrays.toString(arraySeven));
        System.out.println("number: " + num);
        if (num > 0){
            for (int i = 0; i < num; i++) {
                int right = arraySeven[arraySeven.length-1];
                for (int j = arraySeven.length - 1; j > 0; j--) {
                    arraySeven[j] = arraySeven[j-1];
                }
                arraySeven[0] = right;
            }
        } else if (num < 0){
            for (int i = 0; i < num * (-1); i++) {
                int tmp = arraySeven[0];
                for (int j = 0; j < arraySeven.length - 1; j++) {
                    arraySeven[j] = arraySeven[j + 1];
                }
                arraySeven[arraySeven.length - 1] = tmp;
            }
        }
        System.out.println(Arrays.toString(arraySeven));

    }
}
