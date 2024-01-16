package by.teachmeskills.lesson7.task3Registry.registry;

import by.teachmeskills.lesson7.task3Registry.document.Document;
import by.teachmeskills.lesson7.task3Registry.infoInteract.InfoInteraction;

public class Registry implements InfoInteraction {

    final Document [] docsStorage;

    public Registry() { // при создании регистра создаем массив из 2x10 (всегда!) доков
        Document[] docsStorage = new Document [10]; // docsStorage[0] -- номера доков (по ним 'поиск'), docsStorage[1] - остальная инфа
        this.docsStorage = docsStorage;
    }
    // предполагаю, что удалять и перезаписывать элементы не надо

    public void saveDoc(Document document) {
        for (int i = 0; i < docsStorage.length; i++) {
            if (docsStorage[i] == null) { // if в массиве не заполнена ячейка
                docsStorage[i] = document;
                break;
            }
        }
    }

    public void getInfo(Document document) { //выводим всю инфу документа при совпадении номеров дока
        boolean match = false;
        for (int i = 0; i < docsStorage.length; i++) {
            if (docsStorage[i] != null && document.getDocNum() == docsStorage[i].getDocNum()) {
                match = true;
                System.out.println("Found: ");
                System.out.println(docsStorage[i].getDetails());
                break;
            }
        }
        String result = !match ? "No results found" : "";
        System.out.println(result);
    }
}


