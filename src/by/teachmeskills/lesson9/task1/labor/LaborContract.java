package by.teachmeskills.lesson9.task1.labor;

import java.time.LocalDate;

import by.teachmeskills.lesson9.task1.document.Document;


public class LaborContract extends Document {
    private LocalDate finishAt;
    private String contractorName;

    public LaborContract() {
    }

    public LaborContract(String laborId, String contractorName, LocalDate finishAt) {
        super(laborId);
        this.contractorName = contractorName;
        this.finishAt = finishAt;
    }


    public String getDetails() {
        return super.getGeneralInfo() + "\nContractor " + contractorName + "\nThis contract finishes at " + finishAt;
    }

}
