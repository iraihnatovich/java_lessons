package by.teachmeskills.lesson_12.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IntegerListMeth {
    protected static void fillWithIntegers(List myList, String stopWord){
        Scanner scan = new Scanner(System.in);
        String x;
        while(true){
            x= scan.nextLine();
            if(x.equalsIgnoreCase(stopWord)){
                break;
            }
            try {
                myList.add(Integer.valueOf(x));
            }
            catch(NumberFormatException e){
                System.out.println("Should be Integers only. Proceed: ");
            }
        }
    }
    protected static List<Integer> getEvenNumberList (List myList){
        List<Integer> even = new ArrayList<Integer>();
        Iterator iterator = myList.iterator();
        while (iterator.hasNext()){
            Integer num = (Integer) iterator.next();
            if (num % 2 == 0) {
                even.add(num);
            }
        }
        return even;
    }
// protected static List<Integer> getEvenNumberList (List myList){
//        List<Integer> even = new ArrayList<Integer>();
//        for (Object num: myList){
//            if ((Integer) num % 2 == 0) {
//                even.add((Integer)num);
//            }
//        }
//        return even;
//    }


}
