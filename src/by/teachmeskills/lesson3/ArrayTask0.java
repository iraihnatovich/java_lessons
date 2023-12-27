package by.teachmeskills.lesson3;

import java.util.Scanner;

public class ArrayTask0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] mySet = {1, 23, 43, 984, 0, 65, 9, 23, 71, -2};
        for (int x :
                mySet) {
            if (x == number) {
                System.out.println("matches"); // лучше без break, т к число мб более одного раза
            } else {
                System.out.println("does not match");
            }
        }
    }

}
