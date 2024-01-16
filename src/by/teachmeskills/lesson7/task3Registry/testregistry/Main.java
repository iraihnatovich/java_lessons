package by.teachmeskills.lesson7.task3Registry.testregistry;

import by.teachmeskills.lesson7.task3Registry.delivery.DeliveryContract;
import by.teachmeskills.lesson7.task3Registry.invoice.Invoice;
import by.teachmeskills.lesson7.task3Registry.labor.LaborContract;
import by.teachmeskills.lesson7.task3Registry.registry.Registry;

public class Main {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice(123,1300.4,111);
        DeliveryContract delivery = new DeliveryContract(454545,"pineapple",37);
        LaborContract contractLab = new LaborContract(99141499,"Anna",2025, 12,14);
        LaborContract contract111 = new LaborContract(99141229,"Anna",2025, 12,14);
        Registry myDisk = new Registry();
        myDisk.saveDoc(inv1);
        myDisk.saveDoc(delivery);
        myDisk.saveDoc(contractLab);
        myDisk.getInfo(inv1);
        myDisk.getInfo(delivery);
        myDisk.getInfo(contractLab);
        myDisk.getInfo(contract111); // not saved
    }
}
