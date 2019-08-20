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


// ESTADOS
/*
    try {
            ResultSet rs = conn.prepareStatement("select tname from tab where tname = 'ESTADOS'")
                    .executeQuery();
            if(!rs.next()){
                conn.prepareStatement("CREATE TABLE ESTADOS(\n"
                        + " ID_ESTADO INTEGER NOT NULL PRIMARY KEY,\n"
                        + " NOME VARCHAR(100) NOT NULL\n"
                        + " )\n").execute();
            }
            PreparedStatement pst = conn.prepareStatement(
                            "INSERT INTO ESTADOS (ID_ESTADO, NOME) \n" + "VALUES (ESTADOS_SEQ.NEXTVAL, 'TOCANTINS')");
            pst.executeUpdate();

            rs = conn.prepareStatement("select * from estados").executeQuery();
            while (rs.next()){
                System.out.println(String.format("Nome do Estado: %s", rs.getString("nome")));
            }
        }   catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, "Erro de consulta!",ex);
    }

    -- INSERT INTO ESTADOS (ID_ESTADO, NOME) 
    -- VALUES (ESTADOS_SEQ.NEXTVAL, 'PARA');

    /*INSERT INTO ESTADOS (ID_ESTADO, NOME) 
    VALUES (ESTADOS_SEQ.NEXTVAL, 'TOCANTINS');*/

    /*INSERT INTO ESTADOS (ID_ESTADO, NOME) 
    VALUES (ESTADOS_SEQ.NEXTVAL, 'NA')
    INSERT INTO ESTADOS (ID_ESTADO, NOME) 
    VALUES (ESTADOS_SEQ.NEXTVAL, 'CALIFORNIA')
    INSERT INTO ESTADOS (ID_ESTADO, NOME) 
    VALUES (ESTADOS_SEQ.NEXTVAL, 'BUENOS AIRES');
    INSERT INTO ESTADOS (ID_ESTADO, NOME) 
    VALUES (ESTADOS_SEQ.NEXTVAL, 'BOROUGHS');
    INSERT INTO ESTADOS (ID_ESTADO, NOME) 
    VALUES (ESTADOS_SEQ.NEXTVAL, 'S�O PAULO');
*/

//  CIDADES
/*
    try {
            ResultSet rs = conn.prepareStatement("select tname from tab where tname = 'CIDADES'")
                    .executeQuery();
            if(!rs.next()){
                conn.prepareStatement("CREATE TABLE CIDADES(\n"
                        + " ID_ESTADO INTEGER NOT NULL PRIMARY KEY,\n"
                        + " NOME VARCHAR(100) NOT NULL\n"
                        + " )\n").execute();
            }
            PreparedStatement pst = conn.prepareStatement(
                            "INSERT INTO CIDADES (ID_ESTADO, NOME) \n" + "VALUES (CIDADES_SEQ.NEXTVAL, 'SAO PAULO')");
            pst.executeUpdate();

            rs = conn.prepareStatement("select * from estados").executeQuery();
            while (rs.next()){
                System.out.println(String.format("Nome da Cidade: %s", rs.getString("nome")));
            }
        }   catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, "Erro de consulta!",ex);
    }

    /*INSERT INTO CIDADES (ID_CIDADE, NOME) 
    VALUES (CIDADES_SEQ.NEXTVAL, 'NA');*/
    /*INSERT INTO CIDADES (ID_CIDADE, NOME) 
    VALUES (CIDADES_SEQ.NEXTVAL, 'SAN FRANCISCO');*/
    /*INSERT INTO CIDADES (ID_CIDADE, NOME) 
    VALUES (CIDADES_SEQ.NEXTVAL, 'LONDRES');*/
    /*INSERT INTO CIDADES (ID_CIDADE, NOME) 
    VALUES (CIDADES_SEQ.NEXTVAL, 'ITU');*/
    /*INSERT INTO CIDADES (ID_CIDADE, NOME) 
    VALUES (CIDADES_SEQ.NEXTVAL, 'BUENOS AIRES');
    }
*/

//  BAIRROS
/*
    try {
            ResultSet rs = conn.prepareStatement("select tname from tab where tname = 'BAIRROS'")
                    .executeQuery();
            if(!rs.next()){
                conn.prepareStatement("CREATE TABLE BAIRROS(\n"
                        + " ID_BAIRRO INTEGER NOT NULL PRIMARY KEY,\n"
                        + " NOME VARCHAR(100) NOT NULL\n"
                        + " )\n").execute();
            }
            PreparedStatement pst = conn.prepareStatement(
                            "INSERT INTO BAIRROS (ID_ESTADO, NOME) \n" + "VALUES (BAIRROS_SEQ.NEXTVAL, 'SAO PAULO')");
            pst.executeUpdate();

            rs = conn.prepareStatement("select * from bairros").executeQuery();
            while (rs.next()){
                System.out.println(String.format("Nome do Bairro: %s", rs.getString("nome")));
            }
        }   catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, "Erro de consulta!",ex);
    }

    /*INSERT INTO BAIRROS (ID_BAIRRO, NOME) 
    VALUES (BAIRROS_SEQ.NEXTVAL, 'NA');*/
    /*INSERT INTO BAIRROS (ID_BAIRRO, NOME) 
    VALUES (BAIRROS_SEQ.NEXTVAL, 'BETWEEN HYDE AND POWELL STREETS');*/
    /*INSERT INTO BAIRROS (ID_BAIRRO, NOME) 
    VALUES (BAIRROS_SEQ.NEXTVAL, 'CROYDON');*/
    /*INSERT INTO BAIRROS (ID_BAIRRO, NOME) 
    VALUES (BAIRROS_SEQ.NEXTVAL, 'QUALQUER');*/
    /*INSERT INTO BAIRROS (ID_BAIRRO, NOME) 
    VALUES (BAIRROS_SEQ.NEXTVAL, 'CAMINITO');
    }
*/
