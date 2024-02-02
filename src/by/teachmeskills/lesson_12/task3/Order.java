package by.teachmeskills.lesson_12.task3;

public class Order {
    private final int id;
    private double price;

    public Order(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public String toString() {
        return "Order #" + id + " price = " + price;
    }
}
