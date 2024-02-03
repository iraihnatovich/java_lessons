package by.teachmeskills.lesson_12.task3;

import java.util.Comparator;

public class OrderPriceComparator implements Comparator <Order> {
    //создан именно компаратор, который сортирует сначала по цене, потом по ид
    @Override
//    public int compare(Order o1, Order o2) {
//        return o1.getPrice().compareTo(o2.getPrice());
//    }
    public int compare(Order o1, Order o2) {
        int priceComparison = o1.getPrice().compareTo(o2.getPrice());
        if (priceComparison == 0) {
            return o1.getId().compareTo(o2.getId());
        }
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
