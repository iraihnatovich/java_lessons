package by.teachmeskills.lesson2;

import java.util.Scanner;

public class CycleTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result = 0;
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                result += i;
            }
            System.out.println("Result = " + result);
        } else {
            System.out.println("Value should be more than 0");
        }
    }
}
