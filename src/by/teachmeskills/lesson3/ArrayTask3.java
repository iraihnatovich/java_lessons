package by.teachmeskills.lesson3;

import java.util.Arrays;

public class ArrayTask3 {
    public static void main(String[] args) {
        int [] mySetA = {13, 54,1, 0, -9};
        int [] mySetB = {76, 34, 87, 11, -3};
        System.out.println("mySetA: "+Arrays.toString(mySetA));
        System.out.println("mySetB: "+Arrays.toString(mySetB));
        int sumA = 0;
        int sumB = 0;
        float averageA;
        float averageB;
        for (int x:
                mySetA) {
            sumA += x;
        }
        averageA = (float) sumA / mySetA.length;
        for (int x:
                mySetB) {
            sumB += x;
        }
        averageB = (float) sumB / mySetB.length;
        if (averageA>averageB){
            System.out.println("averageA is more than averageB");
        }
        else if (averageA<averageB){
            System.out.println("averageB is more than averageA");
        }
        else {
            System.out.println("Equal");
        }
    }
}
