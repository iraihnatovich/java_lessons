package by.teachmeskills.lesson3;

import java.util.Arrays;


public class ArrayTaskExtra5 {
    public static void main(String[] args) {

        int[] mySet = {1, 23, 4, 9437, 8, 43, 11, 4, 96, 6};
        System.out.println(Arrays.toString(mySet));
        for (int i = 1; i < mySet.length; i += 2) {
            mySet[i] = 0;
        }
        System.out.println(Arrays.toString(mySet));

    }
}
