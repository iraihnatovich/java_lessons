package by.teachmeskills.lesson_12.task4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {
    final private LocalDate regDate;
    private String name;
    private int age;
    List <Order> orderList;

    Client (String name, int age, LocalDate regDate){
        this.name = name;
        this.age = age;
        this.regDate = regDate;
        this.orderList = new ArrayList<Order>(0);
    }
    Client (String name, int age, LocalDate regDate, List <Order> orderList){
        this.name = name;
        this.age = age;
        this.regDate = regDate;
        this.orderList = orderList;
    }

    public LocalDate getRegDate(){
        return regDate;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public  List <Order> getOrders(){
         return orderList;
    }

    public void addToOrderList(Order order){
        orderList.add(order);
    }
    public void addToOrderList(List <Order> createdList){
        orderList.addAll(createdList);
    }

    public String toString(){
        return name+" ordered "+getOrders();
    }

}
