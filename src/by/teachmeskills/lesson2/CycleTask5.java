package by.teachmeskills.lesson2;

public class CycleTask5 {
    public static void main(String[] args) {
        int numOfOperations = 10;
        for (int i = 0; ; i -= 5) {
            if (i <= 0-(5 * numOfOperations)) break;
            System.out.print(i + ", ");
        }
    }
}
