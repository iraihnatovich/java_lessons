package by.teachmeskills.lesson9.task2;

public class Credential {

    private static boolean isDigitPassword(String password) {
        int countDigit = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                countDigit += 1;
                break;
            }
        }
        return countDigit > 0;
    }

    public static boolean isCorrectCredential(String login, String password,
                                              String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean isCorrect = false;
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("login should contain <20 symbols and should not contain spaces");
        } else if (password.length() >= 20 || password.contains(" ") || !isDigitPassword(password) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("password should contain <20 symbols and should not contain spaces." +
                    " And at least one digit. " +
                    "Password should match confirmPassword");
        }
        else {
            isCorrect = true;
        }
        return isCorrect;
    }
}
