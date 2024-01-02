package by.teachmeskills.lesson4;

// Вывести диагонали двумерного массива
public class MultiArrayTaskExtra4 {
    public static void main(String[] args) {
        int[][] mySet = {
                {0, 2, 4, 6},
                {1, 3, 5, 7},
                {-8, 9, -12, 11},
                {-10, 13, -14, 15}
        };
        //главная диагональ квадратного (mySet.length = mySetх[i].length)
        System.out.print("Principal diagonal values: ");
        for (int i = 0; i < mySet.length; i++) {
            System.out.print(mySet[i][i] + " ");
        }
        System.out.println();
        //побочная диагональ квадратного 6 5 9 -10
        System.out.print("Secondary diagonal values: ");
        for (int i = 0; i < mySet.length; i++) {
            System.out.print(mySet[i][(mySet.length - 1) - i] + " ");
        }
    }
}
