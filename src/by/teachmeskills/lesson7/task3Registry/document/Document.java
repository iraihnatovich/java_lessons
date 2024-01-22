package by.teachmeskills.lesson7.task3Registry.document;

import java.time.LocalDate;

abstract public class Document {
    private final int documentNum;
    final LocalDate createdOn = LocalDate.now();

    public Document() {
        this.documentNum =0;
    } // no param

    public Document(int documentNum) { // with param
        this.documentNum = documentNum;
    }

    public int getDocNum() {
        return documentNum;
    }

    public String getGeneralInfo() {
        return "Document # " + documentNum + " created on " + createdOn;
    }

    public abstract String getDetails();

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
}
