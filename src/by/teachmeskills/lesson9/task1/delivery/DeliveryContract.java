package by.teachmeskills.lesson9.task1.delivery;

import by.teachmeskills.lesson9.task1.document.Document;

public class DeliveryContract extends Document {
    private String productType;
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
