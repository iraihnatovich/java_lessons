package by.teachmeskills.lesson4;

import java.util.Arrays;

//Шахматная доска . Раскраска шахматной доски с помощью цикла , 2-мерный массив String 8x8
// С помощью цикла задать элементам значения B or W
public class MultiArrayTask1 {
    public static void main(String[] args) {
        String[][] chessDesk = new String[8][8];
        for (int i = 0; i < chessDesk.length; i++) {
            for (int j = 0; j < chessDesk[i].length; j++) {
                chessDesk[i][j] = (i + j) % 2 == 0 ? "W" : "B";
            }
            System.out.println(Arrays.toString(chessDesk[i]));
        }

    }
}
