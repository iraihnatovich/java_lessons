package by.teachmeskills.lesson_12.task1;
import java.util.ArrayList;
import java.util.List;

import static by.teachmeskills.lesson_12.task1.IntegerListMeth.fillWithIntegers;
import static by.teachmeskills.lesson_12.task1.IntegerListMeth.getEvenNumberList;

//Создать коллекцию целых чисел и заполнить ее значениями, введенными с консоли.
//        При заполнении коллекции числами с консоли следует делать приведения типа.
//        Код для привдения строки к числу можно использовать следующий:
//        int i = Integer.parseInt(str);
//        или
//        int val = Integer.valueOf(str);
//        Для окончания ввода введите слово "exit".
//        При приведении строки к числу, следует учитывать возможность исключений.
//        На экран вывести четные числа из коллекции.
public class Task1Demo {
    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<Integer>();
        fillWithIntegers(digits, "exit");
        System.out.println(digits);
        System.out.println(getEvenNumberList(digits));

    }

}