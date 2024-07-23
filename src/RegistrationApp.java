import java.sql.SQLException;

public class RegistrationApp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new RegistrationController(new RegistrationModel(), new RegistrationView());
    }
}
