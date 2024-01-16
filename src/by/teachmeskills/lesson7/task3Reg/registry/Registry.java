package by.teachmeskills.lesson7.task3Reg.registry;

import by.teachmeskills.lesson7.task3Reg.document.Document;
import by.teachmeskills.lesson7.task3Reg.infoInteract.InfoInteraction;

import java.util.Objects;

public class Registry implements InfoInteraction {

    final String[][] docsStorage;

    public Registry() { // при создании регистра создаем массив из 2x10 (всегда!) доков
        String[][] docsStorage = new String[2][10]; // docsStorage[0] -- номера доков (по ним 'поиск'), docsStorage[1] - остальная инфа
        this.docsStorage = docsStorage;
    }
    // предполагаю, что удалять и перезаписывать элементы не надо

    public void saveDoc(Document document) {
        for (int j = 0; j < docsStorage[0].length; j++) {
            if (docsStorage[0][j] == null) { // в массиве не заполнена ячейка номер
                docsStorage[0][j] = document.getDocNum();
                docsStorage[1][j] = document.getDetails(); // нет задания менять параметры докум из реестра, поэтому сохраняю в строке
                break;
            }
        }
    }

    public void getInfo(Document document) { //выводим всю инфу документа при совпадении номеров дока
        boolean match = false;
        for (int j = 0; j < docsStorage[0].length; j++) {
            String numToFind = document.getDocNum();
            if (Objects.equals(docsStorage[0][j], numToFind)) {
                match = true;
                System.out.println("Found: ");
                System.out.println(docsStorage[1][j]);
                break;
            }
        }
        String result = !match ? "No results found" : "";
        System.out.println(result);
    }
}


