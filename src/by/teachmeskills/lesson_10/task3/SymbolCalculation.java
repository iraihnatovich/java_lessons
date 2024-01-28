package by.teachmeskills.lesson_10.task3;

class SymbolCalculation { //package private
    protected static int uniqueSymbols(String s) {
        String stringUniqueSymbols = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (stringUniqueSymbols.indexOf(s.charAt(i)) == -1) {
                stringUniqueSymbols = stringUniqueSymbols.concat(String.valueOf(s.charAt(i)));
                count++;
            }
        }
        return count;
    }

}
