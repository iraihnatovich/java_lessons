package by.teachmeskills.lesson_12.task4;

public class Order {
   private double price;
    private String description;
    public Order(double price, String description){
        this.price= price;
        this.description = description;
    }

    public double getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
    }

    @Override
    public String toString() {
        return getDescription()+" costs "+price;
    }
}
