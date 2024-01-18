package by.teachmeskills.lesson8.task1;

public class TestPhone {
    public static void main(String[] args) {
        Phone[] phones = {
                new Phone(12345454, "Samsung", 110.4),
                new Phone(83838383, "iPhone", 100),
                new Phone(565665656, "Nokia"),
                new Phone(),
        };
        phones[3].updateNumber(987776655);
        phones[0].updateNumber(111272727);
        for (Phone phone : phones) {
            System.out.println(phone.getNumber()); // выводим только телефон кажлого объекта
            phone.getInfo(); //выводим значения всех переменных кажлого объекта
            phone.receiveCall("Peter", 767676767);
            System.out.println();
        }
        Phone myPhone = new Phone();
        myPhone.sendMessage(phones, "spamspam");


    }
}
