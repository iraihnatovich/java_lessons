package by.teachmeskills.lesson3;

import java.util.Scanner;

public class ArrayTask1 {
    public static void main(String[] args) {
        int[] mySet = {1, 23, 43, 984, 0, 65, 9, 23, 71, -2};
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int changesQuantity = 0;
        for (int i = 0; i < mySet.length; i++) {
            if (number == mySet[i]) {
                mySet[i] = -1;
                changesQuantity += 1;
            }
        }
        String result = (changesQuantity == 0) ? "No matching numbers" : "We have matching number(s)";
        System.out.println(result);
    }
}
