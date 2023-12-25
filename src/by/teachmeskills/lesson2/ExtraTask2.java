package by.teachmeskills.lesson2;
import java.util.Scanner;

public class ExtraTask2 {
    public static void main(String[] args) {
        System.out.print("Deposit sum: ");
        Scanner num = new Scanner(System.in);
        float sum = num.nextFloat();
        System.out.print("Duration: ");
        int duration = num.nextInt();
        float rate = 0.07F;
        for (int i = 0; i < duration; i++) {
            sum = sum + sum * rate;
        }
        System.out.println(sum);
    }
}
