package by.teachmeskills.lesson9.task1;

public class HaveLettersException extends RuntimeException {
    public HaveLettersException(String text) {
        super("Document id should not contain letters " + text);
    }
}
