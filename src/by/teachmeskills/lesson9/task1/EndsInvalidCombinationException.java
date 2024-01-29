package by.teachmeskills.lesson9.task1;

public class EndsInvalidCombinationException extends RuntimeException {
    public EndsInvalidCombinationException(String text) {
        super("Doc id should not end with " + text);
    }
}
