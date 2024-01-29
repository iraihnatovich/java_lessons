package by.teachmeskills.lesson9.task1;

public class StartsWithFiveException extends RuntimeException {
    public StartsWithFiveException(String text) {
        super("Document id should not start with " + text);
    }
}
