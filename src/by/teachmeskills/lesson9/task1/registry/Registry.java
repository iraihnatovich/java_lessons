package by.teachmeskills.lesson9.task1.registry;

import by.teachmeskills.lesson9.task1.document.Document;
import by.teachmeskills.lesson9.task1.documentRegistryImpl.DocumentRegistryImplementation;

public class Registry implements DocumentRegistryImplementation {

    private final Document[] docsStorage;

    public Registry() {
        Document[] docsStorage = new Document[10];
        this.docsStorage = docsStorage;
    }

    public void saveDoc(Document document) {
        for (int i = 0; i < docsStorage.length; i++) {
            if (docsStorage[i] == null) {
                docsStorage[i] = document;
                break;
            }
        }
    }

    public void printInfo(Document document) {
//        boolean match = false;
        for (int i = 0; i < docsStorage.length; i++) {
            if (docsStorage[i] != null && document.equals(docsStorage[i])) {
//                match = true;
                System.out.println("Found: ");
                System.out.println(docsStorage[i].getDetails());
                return; //заменила break на return, но теперь если нет в массиве, то просто ничего не выдает
            }
        }
//        String result = !match ? "No results found" : "";
//        System.out.println(result);
    }
}
