package by.teachmeskills.lesson7.task3Registry.delivery;

import by.teachmeskills.lesson7.task3Registry.document.Document;

public class DeliveryContract extends Document { //контракт на поставку
    String productType; //предполагаю, что 1 тип = 1 поставка
    int productAmount;

    public DeliveryContract() {
    }

    public DeliveryContract(int documentNum, String productType, int productAmount) {
        super(documentNum);
        this.productType = productType;
        this.productAmount = productAmount;
    }

    public String getDetails() {
        return super.getGeneralInfo() + "\n" + "Delivery of " + productType + ". \nAmount of this product = " + productAmount;

    }

}
