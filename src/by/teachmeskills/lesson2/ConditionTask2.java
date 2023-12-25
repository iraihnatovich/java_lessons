package by.teachmeskills.lesson2;

import java.util.Scanner;

public class ConditionTask2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int month = num.nextInt();
        if (month > 0 && month < 13) {
            if (month < 3 || month == 12) {
                System.out.println("Winter");
            } else if (month < 6) {
                System.out.println("Spring");
            } else if (month < 9) {
                System.out.println("Summer");
            } else {
                System.out.println("Autumn");
            }
        } else {
            System.out.println("no season found");
        }

    }
}