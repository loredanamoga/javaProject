/**
 * Created by loredanamoga on 7/19/2017.
 */

public class Login {

    ReadInput readInput = new ReadInput();

    public boolean login(String user, String pass) {


        if (user.equals(Constants.USERNAME) && pass.equals(Constants.PASS)) {
            return true;

        }
        return false;
    }

    public boolean loginValidation() {


        for (int i = 0; i < Constants.MAX_NUMBERS_OF_TRY; i++) {
            System.out.println("Enter username:");
            String username = readInput.readText();
            System.out.println("Enter password:");
            String password = readInput.readText();
            if (login(username, password)) {
                System.out.println("Welcome " + Constants.USERNAME + "! Login successfully !");
                return true;
            } else {
                System.out.println("Username or parola are wrong.\n " +
                        "You have " + (Constants.MAX_NUMBERS_OF_TRY - i - 1) + " more attempts");
            }
        }
        return false;
    }
}
