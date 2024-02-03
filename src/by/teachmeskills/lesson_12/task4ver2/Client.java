package by.teachmeskills.lesson_12.task4ver2;

import by.teachmeskills.lesson_12.task4ver1.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Client { //package private
    final private LocalDate regDate;
    private String name;
    private int age;
    List<Order> orderList;
    Passport personalPassport;

    protected Client(String name, int age, LocalDate regDate, Passport personalPassport) {
        this.name = name;
        this.age = age;
        this.regDate = regDate;
        this.personalPassport = personalPassport;
        this.orderList = new ArrayList<Order>(0);
    }

    protected Client(String name, int age, LocalDate regDate, Passport personalPassport, List<Order> orderList) {
        this.name = name;
        this.age = age;
        this.regDate = regDate;
        this.personalPassport = personalPassport;
        this.orderList = orderList;
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

    protected Passport getPass() {
        return personalPassport;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != getClass()) {
            return false;
        }
        return getPass().equals(((Client) obj).getPass());
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

}
