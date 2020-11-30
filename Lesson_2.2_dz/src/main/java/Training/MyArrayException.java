package Training;

import java.util.Scanner;

public class MyArrayException {
    private static void createArray(String[][] array, Scanner sc, int row, int column) {
        if (row != 4 || column != 4) throw new MySizeArrayException("Только 4x4");
        System.out.println("Создаем массив");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Новая строка " + i + " столбец " + j);
                array[i][j] = sc.next();
            }
        }
        printArr(array);
    }

    private static int calcArray(String[][] array, int row, int column) {
        int sum = 0;
        int[][] arrayInt = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    arrayInt[i][j] = Integer.parseInt(array[i][j]);
                    sum += arrayInt[i][j];
                }catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не тот формат");
                }
            }

        }
        printArrInt(arrayInt);
        return sum;
    }

    private static void printArr(String [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    private static void printArrInt(int[][] array){
        System.out.println("Цифровой массив");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int row;
        int column;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки и столбцы");
        row = scanner.nextInt();
        column = scanner.nextInt();

        String[][] newArray = new String[row][column];
        try{
            createArray(newArray, scanner, row, column);
            System.out.println("Сумма = " + calcArray(newArray, row, column));
        }catch (MySizeArrayException m){
            m.printStackTrace();
        }catch (MyArrayDataException d){
            d.printStackTrace();
        }
    }

}
