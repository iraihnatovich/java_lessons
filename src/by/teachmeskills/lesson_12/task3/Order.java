package by.teachmeskills.lesson_12.task3;

 class Order { //package private
    private final int id;
    private double price;

     Order(int id, double price) {  //package private
        this.id = id;
        this.price = price;
    }

     Integer getId() {
        return id;
    }  //package private

     Double getPrice() {
        return price;
    } //package private

    public String toString() {
        return "Order #" + id + " price = " + price;
    }
}
