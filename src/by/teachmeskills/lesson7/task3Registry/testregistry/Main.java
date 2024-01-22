package by.teachmeskills.lesson7.task3Registry.testregistry;

import by.teachmeskills.lesson7.task3Registry.delivery.DeliveryContract;
import by.teachmeskills.lesson7.task3Registry.invoice.Invoice;
import by.teachmeskills.lesson7.task3Registry.labor.LaborContract;
import by.teachmeskills.lesson7.task3Registry.registry.Registry;

public class Main {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice(123,1300.4,111);
        DeliveryContract delivery = new DeliveryContract(454545,"pineapple",37);
        LaborContract contractLab = new LaborContract();
        LaborContract contract111 = new LaborContract(666666, "Tom", 2025, 1,12);
        Registry myDisk = new Registry();
        myDisk.saveDoc(inv1);
        myDisk.saveDoc(delivery);
        myDisk.saveDoc(contract111);
        myDisk.printInfo(inv1);
        myDisk.printInfo(delivery);
        myDisk.printInfo(contractLab);
        myDisk.printInfo(contract111);
    }
}
