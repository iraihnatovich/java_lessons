package by.teachmeskills.lesson_11;

public class OutOfBoundException extends RuntimeException{
    OutOfBoundException(){
        super("Index should not be greater than array length");
    }


}
