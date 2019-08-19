import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Connection conn = Connector.connect();
        try {
            ResultSet rs = conn.prepareStatement("select tname from tab where tname = 'PAISES'")
                    .executeQuery();
            if(!rs.next()){
                conn.prepareStatement("CREATE TABLE PAISES(\n"
                        + " ID_PAIS INTEGER NOT NULL PRIMARY KEY,\n"
                        + " NOME VARCHAR(100) NOT NULL\n"
                        + " )\n").execute();
            }
            PreparedStatement pst = conn.prepareStatement(
                            "INSERT INTO PAISES (ID_PAIS, NOME) \n" + "VALUES (PAISES_SEQ.NEXTVAL, 'EUA')");
            pst.executeUpdate();

            rs = conn.prepareStatement("select * from paises").executeQuery();
            while (rs.next()){
                System.out.println(String.format("Nome do Pais: %s", rs.getString("nome")));
            }
        }   catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, "Erro de consulta!",ex);
        }

    }
}
