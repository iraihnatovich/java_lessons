package by.teachmeskills.lesson2;

import java.util.Scanner;

public class ConditionTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String res = number % 2 == 0 ? " is even" : " is not even";
        System.out.println(number + res);
    }
}