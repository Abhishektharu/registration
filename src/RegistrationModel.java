import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationModel {
    public static boolean saveRegistration(String name, String gender, int age, String address,
            boolean isStudent) throws ClassNotFoundException, SQLException {

        String strQry =
                "insert into persons(name, gender, age, address, is_student) values (?, ?, ?, ?, ?);";

        try (Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(strQry)) {
            statement.setString(1, name);
            statement.setString(2, gender);
            statement.setInt(3, age);
            statement.setString(4, address);
            statement.setBoolean(5, isStudent);

            return statement.executeUpdate() > 0;
        }
    }
}
