package by.teachmeskills.lesson6.task3;

//Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен задаваться тремя
//свойствами: количеством купюр номиналом 20, 50 и 100
//Сделать метод для добавления денег в банкомат.
//Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность выполнения операции,
//При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма,
//Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
public class Atm {
    int banknote20;
    int banknote50;
    int banknote100;

    Atm(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    void atmFill(int amount20, int amount50, int amount100) { //только три метода в тестовых целях должно хватить
        banknote20 += amount20;
        banknote50 += amount50;
        banknote100 += amount100;
    }

    void atmFill(int amount20, int amount100) {
        banknote20 += amount20;
        banknote100 += amount100;
    }

    void atmFill(int amount50) {
        banknote50 += amount50;
    }

    boolean atmCashWithdraw(int requestedSum) { //знаю, что решается рекурсией, но пока разбираюсь с этим
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        while (banknote100 > 0 && requestedSum >= 100) { //берем все сотки
            if (requestedSum < 100) break;
            requestedSum -= 100;
            banknote100--;
            count100++;
        }
        //хватает 50к
        if (requestedSum / 50 <= banknote50 && requestedSum >= 50) {
            while (requestedSum % 50 != 0 && banknote20 > 0) { // берем 20ки, пока не станет кратно 50
                requestedSum -= 20;
                banknote20--;
                count20++;
            }
            while (banknote50 > 0) {
                if (requestedSum <= 0) break;
                requestedSum -= 50;
                banknote50--;
                count50++;
            }
        }
        if (requestedSum / 50 > banknote50 && requestedSum >= 50) { // если НЕ хватает 50к
            while (requestedSum % 50 != 0 && banknote20 > 0) {
                requestedSum -= 20;
                banknote20--;
                count20++;
            }
            if ((requestedSum - (banknote50 * 50)) % 20 == 0) { // сможем ли добрать 20ками после выгребания всех 50к e.g. 120 byn
                while (banknote50 > 0) {
                    requestedSum -= 50;
                    banknote50--;
                    count50++;
                }
            } else {
                while (banknote50 > 1) {
                    requestedSum -= 50;
                    banknote50--;
                    count50++;
                }
            }
        }
        while (banknote20 > 0) {
            if (requestedSum <= 0) break;
            requestedSum -= 20;
            banknote20--;
            count20++;
        }

//        System.out.println("requestedSum left = "+requestedSum);
        System.out.println("banknote20 get =  " + count20);
        System.out.println("banknote50 get = " + count50);
        System.out.println("banknote100 get = " + count100);

        return requestedSum == 0;
    }
}


class TestAtm {
    public static void main(String[] args) {
        Atm x = new Atm(22, 2, 0);
//        x.atmFill(310);
        System.out.println(x.atmCashWithdraw(270));
//        System.out.println();
//        System.out.println(x.banknote20);
//        System.out.println(x.banknote50);
//        System.out.println(x.banknote100);

    }
}
