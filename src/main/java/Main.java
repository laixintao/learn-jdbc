import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

            query1(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void query1(Connection conn) {

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM company WHERE age < 30");
            while (rs.next()) {
                System.out.print("Column 1 returned ");
                System.out.println(rs.getString(2));
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}