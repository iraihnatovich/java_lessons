package by.teachmeskills.lesson3;

import java.util.Arrays;
import java.util.Random;

public class ArrayTaskExtra6 {
    public static void main(String[] args) {
        // создаем массив -- из него берем рандомные имена и создаем новый массив - сортируем новый массив
        String [] words = {"Linda", "Peter", "Bernie", "Maria", "Richard", "Alex",
        "Charley", "Jake", "Rosa", "Jane", "Ray", "Mike", "Ellie", "Rob",
                "Steve", "Jamie", "Dave", "Sam", "Kate", "George", "Paul", "Andy", "Cindy", "Olivia"};
        System.out.println(Arrays.toString(words));
        String [] newWords = new String [words.length];
        Random order = new Random();
        for (int i = 0; i < newWords.length; i++) {
            newWords[i]=words[order.nextInt(newWords.length)];
        }
        Arrays.sort(newWords);
        System.out.println(Arrays.toString(newWords));
    }
}
