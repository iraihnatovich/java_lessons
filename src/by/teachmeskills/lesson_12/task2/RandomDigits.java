package by.teachmeskills.lesson_12.task2;

import java.util.*;

public class RandomDigits {

    private static int setSizeFromConsole (){
        Scanner scan = new Scanner(System.in);
        try {
            if (!scan.hasNextInt()) {
                throw new InputMismatchException("Only integers. Enter again: ");
            }
            else {
                return scan.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return setSizeFromConsole();
        }
    }

    protected static void fillInRandom(List myList) {
        Random random = new Random();
        try {
            int myListSize = setSizeFromConsole();
            if (myListSize <= 1) {
                throw new IncorrectSizeException("No sense to calculate average if size is <= 1. Enter size again: ");
            }
            for (int i = 0; i < myListSize; i++) {
                myList.add(random.nextInt(-100,100));
            }
        } catch (IncorrectSizeException e) {
            System.out.println(e.getMessage());
             fillInRandom(myList);
        }
    }

    protected static double average (List myList){
        int sumElements = 0;
        for(int i =0; i<myList.size(); i++){
            sumElements  += (Integer) myList.get(i);
        }
        return (double) sumElements /(double) myList.size();
    }

}
