import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * The JDBC Driver should be kept at JAVA_HOME\jre\lib\ext
 */
public class DBConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/registrationApp";
        String username = "root";
        String password = "root";

        Class.forName("com.mysql.jdbc.Driver");

        return DriverManager.getConnection(url, username, password);

        
    }
}
