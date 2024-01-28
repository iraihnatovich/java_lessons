package by.teachmeskills.lesson_10.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

class Palindrome { //package-private

    private static int setPosition() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of word position: ");
        try {
            if (!scan.hasNextInt()) {
                throw new InputMismatchException("Mismatch... Only integers should be entered. Try again.");
            } else {
                return scan.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return setPosition();
        }
    }

    protected static boolean isPalindrome(String phrase) {
        int wordPosition = setPosition();
        try {
            String[] words = phrase.split(" ");
            StringBuilder checkedWord = new StringBuilder(words[wordPosition]).reverse();// words[wordPosition].equals(checkedWord.toString())
            return words[wordPosition].contentEquals(checkedWord);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect number. Try again");
            return isPalindrome(phrase);
        }
    }

}
