package by.teachmeskills.lesson7.task3Reg.document;

import java.time.LocalDate;

abstract public class Document {
    public int documentNum;
    final LocalDate createdOn = LocalDate.now();

    public Document() {
    } // no param

    public Document(int documentNum) { // with param
        this.documentNum = documentNum;
    }

    public String getDocNum() {
        return String.valueOf(documentNum);
    }

    public String getGeneralInfo() {
        return "Document # " + documentNum + " created on " + createdOn;
    }

    public abstract String getDetails();

}
