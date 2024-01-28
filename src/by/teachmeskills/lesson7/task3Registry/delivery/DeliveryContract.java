package by.teachmeskills.lesson7.task3Registry.delivery;

import by.teachmeskills.lesson7.task3Registry.document.Document;

public class DeliveryContract extends Document { //контракт на поставку
    private String productType; //предполагаю, что 1 тип = 1 поставка
    private int productAmount;

    public DeliveryContract() {
    }

    public DeliveryContract(String deliveryId, String productType, int productAmount) {
        super(deliveryId);
        this.productType = productType;
        this.productAmount = productAmount;
    }

    public String getDetails() {
        return super.getGeneralInfo() + "\n" + "Delivery of " + productType + ". \nAmount of this product = " + productAmount;

    }

}
