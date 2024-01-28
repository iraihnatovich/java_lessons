package by.teachmeskills.lesson_10.task4;

import java.util.Scanner;

import static by.teachmeskills.lesson_10.task4.Palindrome.isPalindrome;

//Является ли выбранное слово палиндромом
// * Я сделала так: если введен 0 - проверяем первое слово и т.д.
//Предусмотреть предупреждающие сообщения в случае ошибочных ситуаций
public class Task4Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phraseToCheck = scan.nextLine();
        System.out.println(isPalindrome(phraseToCheck));
    }
}
