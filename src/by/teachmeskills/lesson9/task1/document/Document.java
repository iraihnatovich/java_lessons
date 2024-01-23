package by.teachmeskills.lesson9.task1.document;

import by.teachmeskills.lesson9.task1.EndsInvalidCombinationException;
import by.teachmeskills.lesson9.task1.HaveLettersException;
import by.teachmeskills.lesson9.task1.StartsWithFiveException;

import java.time.LocalDate;

abstract public class Document {
    private final String documentId;
    final LocalDate createdOn = LocalDate.now();

    public Document() {
        this.documentId = null;
    }
    public Document(String documentId) throws StartsWithFiveException, HaveLettersException,
            EndsInvalidCombinationException {
        if (documentId.contains("abc")) {
            throw new HaveLettersException("abc");
        }
        else if (documentId.startsWith("555")) {
            throw new StartsWithFiveException("555 symbols");
        }
        else if (documentId.endsWith("1a2b")) {
            throw new EndsInvalidCombinationException("1a2b combination");
        }
        this.documentId = documentId;
    }
    public String getDocId() {
        return documentId;
    }


    public String getGeneralInfo() {
        return "Document # " + documentId + " created on " + createdOn;
    }

    public abstract String getDetails();

    public boolean equals(Object obj) {
        return getDocId().equals(((Document) obj).getDocId());
    }

}
