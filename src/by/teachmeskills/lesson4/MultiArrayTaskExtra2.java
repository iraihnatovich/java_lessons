package by.teachmeskills.lesson4;

import java.util.Arrays;
// Написать программу для умножения двух матриц. Массивы для умножения взяты из Homework4.pdf
public class MultiArrayTaskExtra2 {
    public static void main(String[] args) {
        int[][] arrA = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arrB = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        if (arrA[0].length != arrB.length) // columns А vs lines B (only for rectangle arrays)
        {
            System.out.println("the number of columns in ArrA isn't equal to the number of rows in arrB");
            return;
        }
        int[][] arrC = new int[arrA.length][arrB[0].length]; // create arrC
        for (int i = 0; i < arrC.length; i++) { //line
            for (int j = 0; j < arrC[0].length; j++) { //column
                for (int k = 0; k < arrB.length; k++) { //arrC[i][j] =0 by default
                    arrC[i][j] += arrA[i][k] * arrB[k][j];
                }
            }
            System.out.println(Arrays.toString(arrC[i]));
        }

    }

}
