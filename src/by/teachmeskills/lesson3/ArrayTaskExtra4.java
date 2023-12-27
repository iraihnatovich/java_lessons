package by.teachmeskills.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTaskExtra4 {
    public static void main(String[] args) {
        System.out.print("Enter array length, please: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        for (; ; ) {
            if (size < 6 || size > 10) {
                System.out.println("Length should be between 5 and 10 incl. Enter length one more time: ");
                size = input.nextInt();
            } else {
                break;
            }
        }
        Random order = new Random();
        int[] initialSet = new int[size];
        // есть ли четные initialSet и сколько
        int countEven = 0;
        for (int i = 0; i < initialSet.length; i++) {
            initialSet[i] = order.nextInt();
            if (initialSet[i] % 2 == 0) {
                ++countEven;
            }
        }
        System.out.println(Arrays.toString(initialSet));
        //создаем массив evenNumbers из четных чисел initialSet
        int[] evenNumbers = new int[countEven];
        if (countEven == 0) {
            System.out.println("No even numbers");
        } else {
            int element = 0;
            for (int x : initialSet) {
                if (x % 2 == 0) {
                    evenNumbers[element] = x;
                    ++element;
                }
            }
            System.out.println(Arrays.toString(evenNumbers));

        }

    }
}
