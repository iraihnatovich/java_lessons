package by.teachmeskills.lesson2;

import java.util.Scanner;

public class ConditionTask1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int month = num.nextInt();
        switch (month) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("no season found");
        }
    }
}