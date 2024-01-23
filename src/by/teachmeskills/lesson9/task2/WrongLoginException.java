package by.teachmeskills.lesson9.task2;

public class WrongLoginException extends RuntimeException{

    public WrongLoginException(){}
    public WrongLoginException(String text){
        super("Login requirement mismatch: "+text);
    }

}
