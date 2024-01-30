package by.teachmeskills.lesson_10.task1;

import static java.lang.String.valueOf;

class StrOperation { //package-private
    private static boolean isOnlyDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) { // хотя бы одна буква
                return false;
            }
        }
        return true;
    }

    private static boolean isOnlyLetters(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) { //хотя бы одна цифра
                return false;
            }
        }
        return true;
    }

    //выводим два первых блока по 4 цифры в одну строку
    protected static String getOnlyNumericBlock(String doc) {
        String result = "";
        String[] initialStringBlocks = doc.split("-");
        for (int i = 0; i < initialStringBlocks.length; i++) {
            if (isOnlyDigits(initialStringBlocks[i])) {
                result = result.concat(initialStringBlocks[i]);
            }
        }
        return result;
    }

    //заменяем каждую букву (в блоках из 3 букв) на *
    protected static String hideAlphabeticBlock(String doc) {
        String[] initialStringBlocks = doc.split("-");
        for (int i = 0; i < initialStringBlocks.length; i++) {
            if (isOnlyLetters(initialStringBlocks[i])) {
                initialStringBlocks[i] = initialStringBlocks[i].replaceAll("[a-z]", "*");
                //замена кажд буква из алф блока на *
            }
        }
        return String.join("-", initialStringBlocks);
    }

    //выводим на экран только буквы в формате ууу/ууу/у/у
    protected static String onlyLetters(String doc) {
        for (int i = 0; i < doc.length(); i++) {
            if (Character.isAlphabetic(doc.charAt(i))) {
                doc = doc.substring(doc.indexOf(doc.charAt(i))); // убираем лишнее до первой буквы включ
                break;
            }
        }
        return doc.replaceAll("[^a-zA-Z]", "/").replaceAll("[/]{2,}", "/");

    }

    //выводим на экран только буквы в формате Letters:YYY/YYY/Y/Y
    protected static StringBuilder onlyLettersToUpperCase(String doc) {
        StringBuilder result = new StringBuilder("Letters:");
        return result.append(onlyLetters(doc).toUpperCase());// в задании без пробелов строка-результат
    }

    //содержит ли последовательность символов (независимо от регистра)
    protected static boolean hasSymbols(String doc, String symbolSet) {
        return doc.toUpperCase().contains(symbolSet.toUpperCase()) || doc.toLowerCase().contains(symbolSet.toLowerCase());
    }

    //начинается ли с последовательность символов
    protected static boolean startWithSymbols(String doc, String symbolSet) {
        return doc.toUpperCase().startsWith(symbolSet.toUpperCase()) || doc.toLowerCase().startsWith(symbolSet.toLowerCase());

    }

    protected static boolean startWithSymbols(String doc, int number) { // перегрузка метода
        return doc.startsWith(valueOf(number));

    }

    //заканчивается ли с последовательностью символов
    protected static boolean endsWithSymbols(String doc, String symbolSet) {
        return doc.toUpperCase().endsWith(symbolSet.toUpperCase()) || doc.toLowerCase().endsWith(symbolSet.toLowerCase());

    }
}
