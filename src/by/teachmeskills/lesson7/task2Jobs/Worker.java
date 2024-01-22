package by.teachmeskills.lesson7.task2Jobs;

public class Worker implements Print {
    private String jobName;

    Worker(String jobName) {
        this.jobName = jobName;
    }

    public void printJob() {
        System.out.println(jobName);
    }

}
