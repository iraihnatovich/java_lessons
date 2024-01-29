package by.teachmeskills.lesson9.task2;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String text) {
        super("Password requirement mismatch: " + text);
    }
}
