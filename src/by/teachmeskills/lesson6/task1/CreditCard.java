package by.teachmeskills.lesson6.task1;
//Создать класс CreditCard с полями номер счета, текущая сумма на счете.
// Добавьте метод, который позволяет начислять сумму на кред карту.
// Добавьте метод, который позволяет снимать сумму с карты.
// Программа, которая создает 3 объекта класса CreditCard, у которых задан номер счета, текущая сумма.

// тестовые сценарии: положить деньги на две карты, снять с третьей. Вывести состояние трех карт.

import java.util.Random;

public class CreditCard {
    int number;
    double balance;

    double round(double value, int n) {
        return (double) Math.round(value * n) / n;
    }

    CreditCard(int number) {
        this.number = number;
        Random n = new Random();
        balance = round(n.nextFloat(10000), 100);
    }

    double increase(double sumOfIncome) {
        balance += round(sumOfIncome, 100);
        balance = round(balance, 100);
        // если пишу без строки выше либо balance=round(balance, 100)+round(sumOfIncome, 100) -- не всегда окргуляет до сотых
        return balance;
    }

    //double value = 0.585;
    //System.out.println(new BigDecimal(value));
    //System.out.println(BigDecimal.valueOf(value));

    double withdraw(double sumOfwithdraw) {
        balance -= round(sumOfwithdraw, 100);
        return round(balance, 100);
    }

}

class testCards {
    public static void main(String[] args) {
        CreditCard[] cardsSet = new CreditCard[3];
        for (int i = 0; i < cardsSet.length; i++) {
            cardsSet[i] = new CreditCard(i + 1);
            System.out.println(cardsSet[i].number + " card balance = " + cardsSet[i].balance);
        }
        cardsSet[0].increase(100.873848);
        cardsSet[1].increase(52.74014);
        cardsSet[2].withdraw(100.1);

        for (CreditCard cardItem : cardsSet) {
            System.out.println(cardItem.number + "card balance after operations = " + cardItem.balance);
        }
    }
}

