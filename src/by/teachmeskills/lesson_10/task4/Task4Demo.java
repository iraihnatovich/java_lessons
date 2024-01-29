package by.teachmeskills.lesson_10.task4;

import java.util.Scanner;

import static by.teachmeskills.lesson_10.task4.Palindrome.isPalindrome;

//Является ли выбранное слово палиндромом
// * сделала так: если введен 1 - проверяем первое слово(так в задании)
//Предусмотреть предупреждающие сообщения в случае ошибочных ситуаций
public class Task4Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phraseToCheck = scan.nextLine();
        System.out.println(isPalindrome(phraseToCheck));
    }
}
