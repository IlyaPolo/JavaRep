package ru.javacourse;

import java.util.Random;
import java.util.Scanner;

public class Dz3 {

    private static Random random = new Random();

    public static void main(String[] args) {
       // getGameOne();
        guessTheWord();
    }
    /*
    Игра по угадыванию чисел
    */

    private static void getGameOne(){
        Scanner scanner = new Scanner(System.in);
        do {
            int ran = random.nextInt(10);
            System.out.println("Введите число от 0 до 9. У вас 3 попытки.");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введите число:");
                int answer = scanner.nextInt();
                if (answer == ran){
                    System.out.println("Вы победили!!!");
                    break;
                }
                if (answer > ran){
                    System.out.println("Ваше чило больше нужного. У вас осталось: " + (i - 1) + " попытки");
                } else if (answer < ran){
                    System.out.println("Ваше чило меньше нужного. У вас осталось: " + (i - 1) + " попытки");
                } else System.out.println("У вас 0 попыток. Вы проиграли.");
            }
            System.out.println("1 - начать заного. 0 - закончить.");
        } while (scanner.nextInt() == 1);
    }

    /*
    Игра в угадай слово
    */

    private static void guessTheWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};


        int word = random.nextInt(words.length - 1);
        String wordScan = words[word];
        int lenWordScan = wordScan.length();
        System.out.println("Я загадал слово. Нужно отгадать.");
        System.out.println(wordScan);

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Введите ваше слово:");
            String answer = scanner.next();
            if (answer.equals(wordScan)){
                System.out.println("Вы угадали!");
                break;
            }
            char[] charsAnswer = answer.toCharArray();
            for (int i = 0; i < lenWordScan; i++) {
                if (i >= charsAnswer.length) break;
                if (wordScan.charAt(i) != charsAnswer[i]) charsAnswer[i] = '#';
            }
            StringBuilder comment = new StringBuilder(String.valueOf(charsAnswer));
            for (int i = comment.length(); i < 15; i++) comment.append("#");
            System.out.println(comment);
        } while (true);
    }
}
