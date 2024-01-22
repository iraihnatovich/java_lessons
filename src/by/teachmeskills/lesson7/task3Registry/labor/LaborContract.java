package by.teachmeskills.lesson7.task3Registry.labor;

import by.teachmeskills.lesson7.task3Registry.document.Document;

import java.time.LocalDate;

public class LaborContract extends Document {
    private LocalDate finishAt ;
    private String contractorName;

    public LaborContract() {
    }

    public LaborContract(int documentNum, String contractorName, int yearOfFinish, int mothOfFinish, int dayOfFinish) {
        super(documentNum);
        this.contractorName = contractorName;
        this.finishAt = LocalDate.of(yearOfFinish, mothOfFinish, dayOfFinish);
    }



    public String getDetails() {
        return super.getGeneralInfo() + "\nContractor " + contractorName + "\nThis contract finishes at " + finishAt;
    }

}
