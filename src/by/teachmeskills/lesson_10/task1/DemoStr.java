package by.teachmeskills.lesson_10.task1;

import static by.teachmeskills.lesson_10.task1.StrOperation.*;

public class DemoStr {
    public static void main(String[] args) {
        String docNumber = "1223-abc-9402-fef-5e7q";
        System.out.println(getOnlyNumericBlock(docNumber));
        System.out.println(hideAlphabeticBlock(docNumber));
        System.out.println(onlyLetters(docNumber));
        System.out.println(onlyLettersToUpperCase(docNumber));
        System.out.println(hasSymbols(docNumber, "abC"));
//        System.out.println(startWithSymbols(docNumber, "555"));
        System.out.println(startWithSymbols(docNumber, 555));
        System.out.println(endsWithSymbols(docNumber, "1a2b"));
    }
}
