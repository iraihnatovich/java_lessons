package by.teachmeskills.lesson3;

import java.util.Arrays;

public class ArrayTaskExtra7 {
    public static void main(String[] args) {
        //по возрастанию
        int [] mySet = {54, 8, 19, 33, 1, 0, -4, 125, 19};
        int t;
        for (int out = 0; out < mySet.length-1; out++) {
            for (int in = mySet.length-1; in > out; in--) {
                if (mySet[in]<mySet[in-1]){
                    t = mySet[in];
                    mySet[in] = mySet[in-1];
                    mySet[in-1] = t;
                }
            }
//            System.out.println(Arrays.toString(mySet));
        }
        System.out.println(Arrays.toString(mySet));
    }
}
