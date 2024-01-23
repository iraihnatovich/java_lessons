package by.teachmeskills.lesson9.task1;

import by.teachmeskills.lesson9.task1.delivery.DeliveryContract;
import by.teachmeskills.lesson9.task1.invoice.Invoice;
import by.teachmeskills.lesson9.task1.labor.LaborContract;

import java.time.LocalDate;
import java.time.Month;

public class DemoDoc {
    public static void main(String[] args) {
        try {
            Invoice inv1 =
                    new Invoice("5551225", 1300.4, 111);
        } catch (StartsWithFiveException | HaveLettersException | EndsInvalidCombinationException e) {
            System.out.println(e.getMessage());
            ;
        }
        try {
            DeliveryContract delivery = new DeliveryContract("4455abc66",
                    "pineapple", 37);
        } catch (StartsWithFiveException | HaveLettersException | EndsInvalidCombinationException e) {
            System.out.println(e.getMessage());
        }
        try {
            LocalDate finAt = LocalDate.of(2026, Month.JANUARY, 17);
            LaborContract lab11 = new LaborContract("83651a2b", "frank", finAt);

        } catch (StartsWithFiveException | HaveLettersException | EndsInvalidCombinationException e) {
            System.out.println(e.getMessage());
        }

    }
}
