package by.teachmeskills.lesson_12.task4;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
//Создать класс для описания клиента.
//        Поместить в класс поля для описания клиента (дата регистрации(LocalDate), имя, возраст и другие поля по усмотрению).
//        Класс клиента должен содержеть поле-коллекцию с заказами этого клиента - это, своего рода, корзина заказов клиента.
//        Класс заказа должен создежать поля для описания заказ (цена, описание и возможны другие поля).
//        Создать нескольких клиентов.
//        Для каждого клиента создать несколько заказов и поместить их в поле-коллекцию для заказов.
//        Создать коллекцию типа Мар и заполнить ее парами "номер паспорта клиента" -> "объект класса клиент".
//        Номера паспортов можно хранить как константы в созданном для этого интерфейсе.
//        Пройти циклом по коллекции и вывести на экран:
//        - все пары ключ-значение, использую Map.Entry<K, V> entry : map.entrySet()
//        - все пары ключ-значение, использую итератор
//        - все ключи, используя map.keySet()
//        - все значения, используя map.values()

public class Task4 {
    public static void main(String[] args) {
        Client johnDoe = new Client("johndoe",23, LocalDate.of(2023, Month.AUGUST,13));
        Client janeDoe = new Client("janedoe",37, LocalDate.of(2024, Month.JANUARY,24));
        Client client1 = new Client("Mr White",49, LocalDate.of(2022, Month.MARCH,1),
                List.of(new Order(8378, "car"),
                new Order(11, "clothes"),
                new Order(231.0, "pc")));
        janeDoe.addToOrderList(
                List.of(new Order(100.2, "xmas gift"),
                        new Order(878.3, "tech goods")));
        Order ofjohnDoe = new Order(227.9, "Lego");
        Order ofjohnDoe111 = new Order(17.6, "cosmetic products");
        johnDoe.addToOrderList(ofjohnDoe);
        johnDoe.addToOrderList(ofjohnDoe111);
        HashMap <String, Client> clientsMap = new HashMap<>();
        clientsMap.put("BH871827",janeDoe);
        clientsMap.put("AD1287121",johnDoe);
        clientsMap.put("NY278787",client1);
//        System.out.println(clientsMap);
        //все пары ключ-значение, использую Map.Entry<K, V> entry : map.entrySet()
        for (Map.Entry <String, Client> pair: clientsMap.entrySet()) {
            System.out.println(pair);
        }
        System.out.println();
        //все пары ключ-значение, использую итератор
        Iterator < Map.Entry <String, Client>> clientsMapIter =  clientsMap.entrySet().iterator();
        while (clientsMapIter.hasNext()){
            Map.Entry <String, Client> personalDataEntry = clientsMapIter.next();
            System.out.println(personalDataEntry.getKey());
            System.out.println(personalDataEntry.getValue()+"\n");

        }
        System.out.println("Keys "+clientsMap.keySet()); //все ключи, используя map.keySet()
        System.out.println("Values "+clientsMap.values()); //все значения, используя map.values()

    }
}
