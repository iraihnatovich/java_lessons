package by.teachmeskills.lesson_12.task5;

import java.util.*;

//Задача 5
//        Создать коллекцию уникальных имен всех студентов нашей группы + преподаватель.
//        Вывести коллекцию на экран.
public class Task5 {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.addAll(List.of("Ира","Артем", "Ольга","Артем", "Алеся", "Евгений",
                "Илья", "Святослав", "Павел", "Роланд", "Ольга", "Стас"));
        Iterator <String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
