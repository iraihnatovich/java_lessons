package by.teachmeskills.lesson_12.task4ver1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Client { //package private
    final private LocalDate regDate;
    private String name;
    private int age;
    List<Order> orderList;
    final private String passportID;

    protected Client(String name, int age, LocalDate regDate, String passportID) {
        this.name = name;
        this.age = age;
        this.regDate = regDate;
        this.passportID = passportID;
        this.orderList = new ArrayList<Order>(0);
    }

    protected Client(String name, int age, LocalDate regDate, List<Order> orderList, String passportID) {
        this.name = name;
        this.age = age;
        this.regDate = regDate;
        this.orderList = orderList;
        this.passportID = passportID;
    }

    protected LocalDate getRegDate() {
        return regDate;
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected List<Order> getOrders() {
        return orderList;
    }

    protected void addToOrderList(Order order) {
        orderList.add(order);
    }

    protected void addToOrderList(List<Order> createdList) {
        orderList.addAll(createdList);
    }

    public String toString() {
        return name + " ordered " + getOrders();
    }

    protected String getID() {
        return passportID;
    }

    public boolean equals(Object obj) {
        if (obj.getClass() != getClass()) {
            return false;
        }
        return getID().equals(((Client) obj).getID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportID);
    }
}
