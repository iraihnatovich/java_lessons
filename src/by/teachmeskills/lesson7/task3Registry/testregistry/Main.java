package by.teachmeskills.lesson7.task3Registry.testregistry;

import by.teachmeskills.lesson7.task3Registry.delivery.DeliveryContract;
import by.teachmeskills.lesson7.task3Registry.invoice.Invoice;
import by.teachmeskills.lesson7.task3Registry.labor.LaborContract;
import by.teachmeskills.lesson7.task3Registry.registry.Registry;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice(123, 1300.4, 111);
        DeliveryContract delivery = new DeliveryContract(454545, "pineapple", 37);
        LocalDate finishAt = LocalDate.of(2026, 6, 13);
        LaborContract contractLab = new LaborContract(7565656, "Rita", finishAt);
        Registry myDisk = new Registry();
        myDisk.saveDoc(inv1);
        myDisk.saveDoc(delivery);
        myDisk.saveDoc(contractLab);
        myDisk.printInfo(inv1);
        myDisk.printInfo(delivery);
        myDisk.printInfo(contractLab);
    }
}
