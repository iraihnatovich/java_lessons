package by.teachmeskills.lesson9.task2;

import static by.teachmeskills.lesson9.task2.Credential.isCorrectCredential;

public class DemoCredentials {
    public static void main(String[] args) {
        try {
            isCorrectCredential("testqqq", "abbbbv", "abbbbv");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }


    }
}
