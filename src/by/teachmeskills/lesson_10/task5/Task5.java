package by.teachmeskills.lesson_10.task5;

import java.util.Scanner;

//Задублировать каждую букву из введенной строки
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder strInitial = new StringBuilder(scan.nextLine());
        StringBuilder duplicatedSymbols = new StringBuilder();
        for (int i = 0; i < strInitial.length(); i++) {
            duplicatedSymbols.append(strInitial.charAt(i));
            duplicatedSymbols.insert((i * 2), strInitial.charAt(i)); //вставка назад, 1*2+1 -- вперед
        }
        System.out.println(duplicatedSymbols);
    }
}
