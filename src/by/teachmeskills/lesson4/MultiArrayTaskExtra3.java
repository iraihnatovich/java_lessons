package by.teachmeskills.lesson4;

// Вывести сумму всех элементов двумерного массива
public class MultiArrayTaskExtra3 {
    public static void main(String[] args) {
        int[][] myArr = {
                {14, 6, 17, 87},
                {0, 1, 81, 94},
                {9, 55, 17, 38}
        };
        int sum = 0;
        for (int[] oneD :
                myArr) {
            for (int x :
                    oneD) {
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
