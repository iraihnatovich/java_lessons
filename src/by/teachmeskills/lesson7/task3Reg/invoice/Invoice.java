package by.teachmeskills.lesson7.task3Reg.invoice;

import by.teachmeskills.lesson7.task3Reg.document.Document;

public class Invoice extends Document {
    double finalSumOfMonth;
    int depCode;

    public Invoice() {
    }

    public Invoice(int documentNum, double finalSumOfMonth, int depCode) {
        super(documentNum);
        this.finalSumOfMonth = finalSumOfMonth;
        this.depCode = depCode;
    }

    public String getDetails() {
        return super.getGeneralInfo() + "\nDepartment code is " + depCode + "\nfinal month sum  = " + finalSumOfMonth;
    }

}
