package by.teachmeskills.lesson_12.task4ver2;


import by.teachmeskills.lesson_12.task4ver1.Order;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Task4ver2 {
    public static void main(String[] args) {
        Client homer = new Client("Homer", 37, LocalDate.of(2024, Month.JANUARY, 24), new Passport("DG767267"));
        Client marge = new Client("Marge", 49, LocalDate.of(2022, Month.MARCH, 1), new Passport("DG767267"),
                List.of(new Order(100.2, "xmas gift"),
                        new Order(878.3, "tech goods"))
        );
        Client bart = new Client("Bart", 13, LocalDate.of(2023, Month.AUGUST, 13), new Passport("BH784728"));
        homer.addToOrderList(List.of(new Order(8378, "car"),
                new Order(11, "clothes"),
                new Order(231.0, "pc")));
        bart.addToOrderList(new Order(653.91, "skateboard"));
        HashMap<Passport, Client> clientsMap = new HashMap<>();
        clientsMap.put(homer.getPass(), homer);
        clientsMap.put(marge.getPass(), marge);
        clientsMap.put(bart.getPass(), bart);
        for (Map.Entry<Passport, Client> pair : clientsMap.entrySet()) {
            System.out.println(pair);
        }
        System.out.println();
        Iterator<Map.Entry<Passport, Client>> clientsMapIteratorA = clientsMap.entrySet().iterator();
        while (clientsMapIteratorA.hasNext()) {
            Map.Entry<Passport, Client> clientEntry = clientsMapIteratorA.next();
            System.out.println(clientEntry);
        }
        System.out.println("Keys: " + clientsMap.keySet());
        System.out.println("Values: " + clientsMap.values());
        // вывод ключей и значений через цикл
//        System.out.println("Keys : ");
//        Iterator  <Map.Entry <Passport, Client>> clientsMapIteratorB = clientsMap.entrySet().iterator();
//        while (clientsMapIteratorB.hasNext()){
//            Map.Entry <Passport, Client> clientEntry = clientsMapIteratorB.next();
//            System.out.print(clientEntry.getKey()+" , ");
//        }
//        System.out.println("\nValues : ");
//        Iterator  <Map.Entry <Passport, Client>> clientsMapIteratorC = clientsMap.entrySet().iterator();
//        while (clientsMapIteratorC.hasNext()){
//            Map.Entry <Passport, Client> clientEntry = clientsMapIteratorC.next();
//            System.out.println(clientEntry.getValue()+" , ");
//        }


    }
}
