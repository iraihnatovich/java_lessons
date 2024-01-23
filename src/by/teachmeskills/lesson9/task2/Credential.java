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
        try {
            if (login.length() >= 20 || login.contains(" ")) {
                throw new WrongLoginException("login problem");
            }
            if (password.length() >= 20 || password.contains(" ") || !isDigitPassword(password) || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("password problem");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
//            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }
}
