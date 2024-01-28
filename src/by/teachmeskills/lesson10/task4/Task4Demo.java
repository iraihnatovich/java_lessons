package by.teachmeskills.lesson10.task4;

import java.util.Scanner;

import static by.teachmeskills.lesson10.task4.Palindrome.isPalindrome;

public class Task4Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phraseToCheck = scan.nextLine();
        System.out.println(isPalindrome(phraseToCheck));
    }
}
