package by.teachmeskills.lesson7.task2Jobs;

public class Ceo implements Print {
    private String ceoPosition;

    public Ceo(String ceoPosition) {
        this.ceoPosition = ceoPosition;
    }

    public void printJob() {
        System.out.println(ceoPosition);
    }

}
