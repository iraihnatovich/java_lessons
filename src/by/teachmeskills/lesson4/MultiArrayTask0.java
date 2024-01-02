package by.teachmeskills.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Создать и напечатать 3-мерный массив из целых чисел.(рандомно или статич)
//С помощью циклов пройти по всему массиву и увеличить каждый элемент на заданное число.
//Число, на которое увеличиваем элементы, -- задается из консоли.

public class MultiArrayTask0 {
    public static void main(String[] args) {
        Random number = new Random();
        int[][][] myArr = new int[2][4][5];
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                for (int k = 0; k < myArr[i][j].length; k++) {
                    myArr[i][j][k] = number.nextInt(200);
                }
                System.out.print(Arrays.toString(myArr[i][j]) + ", ");
            }
            System.out.println();
        }
        System.out.print("Increase on: ");
        Scanner input = new Scanner(System.in);
        int increase = input.nextInt();
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                for (int k = 0; k < myArr[i][j].length; k++) {
                    myArr[i][j][k] += increase;
                }
                System.out.print(Arrays.toString(myArr[i][j]) + ", ");
            }
            System.out.println();
        }
    }
}
