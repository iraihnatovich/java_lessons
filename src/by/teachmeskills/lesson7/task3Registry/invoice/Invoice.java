package by.teachmeskills.lesson7.task3Registry.invoice;

import by.teachmeskills.lesson7.task3Registry.document.Document;

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
