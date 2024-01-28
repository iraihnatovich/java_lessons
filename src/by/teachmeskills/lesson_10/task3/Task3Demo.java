package by.teachmeskills.lesson_10.task3;

import java.util.Scanner;

import static by.teachmeskills.lesson_10.task3.SymbolCalculation.uniqueSymbols;

public class Task3Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String initial = scan.nextLine();
        String[] strSet = initial.split(" ");
        String minUnique = strSet[0];
        for (int i = 0; i < strSet.length - 1; i++) {
            if (uniqueSymbols(minUnique) > uniqueSymbols(strSet[i + 1])) {
                minUnique = strSet[i + 1];
            }
        }
        System.out.println(minUnique);
    }

}
