package by.teachmeskills.lesson7.task2Jobs;

//Создать классы "Директор", "Рабочий", "Бухгалер"
//Реализовать иптерфeйс с мeтодом, которыйї печатаeт название должности и
//имплементировать этот метод в созданные классы.
public class TestJobs {
    public static void main(String[] args) {
        Ceo chief = new Ceo("ceo name");
        chief.printJob();
        Worker secretary = new Worker("office worker");
        secretary.printJob();
        Accountant juniorAccountant = new Accountant("junior accountant");
        juniorAccountant.printJob();
    }
}
