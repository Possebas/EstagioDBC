import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connector {

    private static Connection conn;

    public static Connection connect () {
        try {
            if ( conn != null && conn.isValid(10)) {
                return  conn;
            }

            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:49161:XE",
                    "system",
                    "123456");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, "Erro de conexão!",ex);
        }
        return conn;
    }
}
