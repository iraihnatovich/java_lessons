package by.teachmeskills.lesson_11;

public class DocumentDummy {
    private int numDoc;
    private String name;

    DocumentDummy(int numDoc, String name) {
        this.numDoc = numDoc;
        this.name = name;
    }

    public String toString() {
        return "#" + numDoc + " " + name;
    }

    public String getString() {
        return name;
    }

    public int getNumber() {
        return numDoc;
    }

    @Override
    public boolean equals(Object obj) {
        return getNumber() == ((DocumentDummy) obj).getNumber();
    }
}
