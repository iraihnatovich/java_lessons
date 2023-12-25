package by.teachmeskills.lesson2;

public class ExtraTask1 {
    public static void main(String[] args) {
        int previousx = 0;
        int x = 1;
        int fibonacci;
        System.out.print(previousx + ", " + x + ", ");
        for (int i = 0; i <= 8; i++) {
            fibonacci = previousx + x;
            previousx = x;
            x = fibonacci;
            System.out.print(fibonacci + ", ");
        }
    }
}