package by.teachmeskills.lesson7.task2Jobs;
//Создать классы "Директор", "Рабочий", "Бухгалер"
//Реализовать иптерфeйс с мeтодом, которыйї печатаeт название должности и
//имплементировать этот метод в созданные классы.

abstract class Job implements Print { //класс абстрактный, но без абстр методов
    String jobName;

    Job(String jobName) { //конструктор есть, но использ его (создать экземпл JOB) не можем
        this.jobName = jobName;
    }

    public void printJob() { //interface method
        System.out.println(jobName);
    }
}

class Ceo extends Job {
    Ceo(String jobName) {
        super(jobName);
    }

    public String occupation() { //добавила, чтобы классы-наследники отличались друг от друга
        return "management";
    } //добавила, чтобы наследники отличались

}

class Worker extends Job {
    Worker(String jobName) {
        super(jobName);
    }

    public String occupation() {
        return "task exeсution";
    }
}

class Accountant extends Job {
    Accountant(String jobName) {
        super(jobName);
    }

    public String occupation() {
        return "budgeting";
    }
}

class TestJob {
    public static void main(String[] args) {
        Job chief = new Ceo("ceo name");
        chief.printJob();
        System.out.println(chief.occupation());
        Worker secretary = new Worker("office worker");
        secretary.printJob();
//        Job undefJob = new Job();
//        undefJob.printJob();
//        System.out.println(undefJob.occupation());
    }
}

