package by.teachmeskills.lesson2;

import java.util.Scanner;

public class ConditionTask4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int t = num.nextInt();
        if (t > -20 && t <= -5) {
            System.out.println("Normal");
        } else if (t > -5) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
    }
}
