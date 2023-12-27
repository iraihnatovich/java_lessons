package by.teachmeskills.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask2 {
    public static void main(String[] args) {
        Random order = new Random();
        Scanner inputSize = new Scanner(System.in);
        int arrSize = inputSize.nextInt();
        int[] mySet = new int[arrSize];

        for (int i = 0; i <= arrSize - 1; i++) {
//            mySet[i] = (int) (Math.random() * arrSize); // через Math.random - приводим к типу инт
//            и генерим в дипазоне от 0 до arrSize
            mySet[i] = order.nextInt(); // через класс Random
        }
        System.out.println(Arrays.toString(mySet));
        int min = mySet[0];
        int max = mySet[0];
        int sum = 0;
        float av;
        for (int x : mySet) {
            min = Math.min(min, x);
            max = Math.max(max, x);
            sum += x;
        }
        av = (float) (sum / mySet.length);
        System.out.println("Max = " + max + " and min = " + min);
        System.out.println("Average = " + av);

    }
}
