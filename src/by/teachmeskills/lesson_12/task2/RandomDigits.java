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
            if (myListSize <= 0) { // по идеи с размером = 1 нет смысла считать среднее арифм, но лист создать можем, поэтому оставила  <= 0
                throw new IncorrectSizeException("Size should be more than zero. Enter size again: ");
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
        Iterator <Integer> myListIter = myList.iterator();
        while (myListIter.hasNext()){
            sumElements += myListIter.next();
            System.out.println(sumElements);
        }
        return (double) sumElements /(double) myList.size();
    }

}
