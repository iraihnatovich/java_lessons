package by.teachmeskills.lesson7.task3Registry.document;

import java.time.LocalDate;

abstract public class Document {
    private final String documentId;
    final LocalDate createdOn = LocalDate.now();

    public Document() {
        this.documentId = null;
    } // no param

    public Document(String documentId) { // with param
        this.documentId = documentId;
    }

    public String getDocId() {
        return documentId;
    }

    public String getGeneralInfo() {
        return "Document # " + documentId + " created on " + createdOn;
    }

    public abstract String getDetails();

    @Override
    public boolean equals(Object obj) {
        return getDocId().equals(((Document) obj).getDocId());
    }
}
