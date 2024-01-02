package by.teachmeskills.lesson4;
//  Создать 2мерный массив целый чисел. Отсортировать элементы в строках по возрастанию

import java.util.Arrays;

public class MultiArrayTaskExtra5 {
    public static void main(String[] args) {
        int[][] mySet = {
                {80, 29, 4, 65},
                {51, 330, -5, 57},
                {-8, 29, -32, 171},
                {100, 13, 13, -15}
        };
//        for (int i = 0; i < mySet.length; i++) {
//            Arrays.sort(mySet[i]);
//            System.out.println(Arrays.toString(mySet[i]));
//        }
//        System.out.println(Arrays.deepToString(mySet));
        for (int i = 0; i < mySet.length; i++) {
            for (int j = 0; j < mySet[i].length-1; j++) {
                for (int k = mySet[i].length-1; k > j; k--) {
                    int temp;
                    if (mySet[i][k-1]>mySet[i][k]){
                        temp = mySet[i][k-1];
                        mySet[i][k-1] = mySet[i][k];
                        mySet[i][k] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(mySet));
    }
}
