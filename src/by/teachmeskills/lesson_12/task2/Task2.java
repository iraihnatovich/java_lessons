package by.teachmeskills.lesson_12.task2;

import java.util.ArrayList;
import java.util.List;
import static by.teachmeskills.lesson_12.task2.RandomDigits.average;
import static by.teachmeskills.lesson_12.task2.RandomDigits.fillInRandom;

//Задача 2
//        Создать коллекцию целых чисел.
//        Заполните коллекцию рандомными числами.
//        Пусть размер коллекции задается с консоли.
//        Предусмотреть возможно ошибок при получении размера коллекции с консоли.
//        Предусмотреть проверку введенного размера коллекции на валидность.
//        Посчитайте и выведите на экран среднее арифметическое все элементов коллекции.
public class Task2 {
    public static void main(String[] args) {
        List<Integer> intNumbers = new ArrayList<Integer>();
        fillInRandom(intNumbers);
        System.out.println(intNumbers);
        System.out.println(average(intNumbers));

    }


}
