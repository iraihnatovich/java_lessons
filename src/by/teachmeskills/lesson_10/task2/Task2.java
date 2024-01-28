package by.teachmeskills.lesson_10.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String initial = scan.nextLine();
        String[] setWords = initial.split(" ");
        String minWord = setWords[0];
        String maxWord = setWords[0];
        for (String word : setWords) {
            if (word.length() <= minWord.length()) {
                minWord = word;
            } else if (word.length() >= maxWord.length()) {
                maxWord = word;
            }
        }
        System.out.println("Longest word : " + maxWord);
        System.out.println("Shortest word : " + minWord);

    }
}
