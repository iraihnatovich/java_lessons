package by.teachmeskills.lesson2;

import java.util.Scanner;

public class ConditionTask5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        switch (num.nextInt()){
            case 1 -> System.out.println("red");
            case 2 -> System.out.println("orange");
            case 3 -> System.out.println("yellow");
            case 4 -> System.out.println("green");
            case 5 -> System.out.println("cyan");
            case 6 -> System.out.println("blue");
            case 7 -> System.out.println("violet");
            default -> System.out.println("No colour");
        }

    }
}