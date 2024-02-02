package by.teachmeskills.lesson_12.task3;

import java.util.ArrayList;
import java.util.List;
//Задача 3
//Создать свой класс для описания заказа.
//Класс должен содержать поля id заказа и стоимость заказа - обязательные поля.
//Создать несколько заказов и поместить их в коллекцию.
//Вывести коллекцию на экран.
//Отсортировать заказы и вывести отсортированную коллекцию на экран.
//Заказы сортируются по цене по возрастанию.
//Для сортировки заказов следует создать свой компаратор (смотрите пример с занятия).
public class Task3 {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(111,999.23));
        orderList.add(new Order(100,999.23));
        orderList.add(new Order(5551,194.00));
        orderList.add(new Order(9,2344.99));
        orderList.add(new Order(8,2344.99));
        orderList.add(new Order(7,500.59));
        System.out.println(orderList);
        orderList.sort(new OrderPriceComparator());
        System.out.println(orderList);
    }
}
