import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author laixintao
 * @version: Main.java, v 0.1 2020年06月22日 4:35 PM laixintao Exp $
 */
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://127.0.0.1:5432/jdbc_test?user=postgres";
        Connection conn;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connect success!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}