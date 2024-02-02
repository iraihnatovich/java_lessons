package by.teachmeskills.lesson_12.task3;

import java.util.Comparator;

public class OrderPriceComparator implements Comparator <Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if (o1.getPrice() == o2.getPrice()) {
            return 0;
        }
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
