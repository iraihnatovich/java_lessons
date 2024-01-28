package by.teachmeskills.lesson7.task2Jobs;

public class Accountant implements Print {
    private String activityName;

    public Accountant(String activityName) {
        this.activityName = activityName;
    }

    public void printJob() {
        System.out.println(activityName);
    }
}
