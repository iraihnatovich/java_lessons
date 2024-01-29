package by.teachmeskills.lesson9.task1.invoice;

import by.teachmeskills.lesson9.task1.document.Document;

public class Invoice extends Document {
    private double finalSumOfMonth;
    private int depCode;

    public Invoice() {
    }

    public Invoice(String invoiceId, double finalSumOfMonth, int depCode) {
        super(invoiceId);
        this.finalSumOfMonth = finalSumOfMonth;
        this.depCode = depCode;
    }

    public String getDetails() {
        return super.getGeneralInfo() + "\nDepartment code is " + depCode + "\nfinal month sum  = " + finalSumOfMonth;
    }

}
