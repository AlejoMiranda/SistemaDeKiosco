package model.bd;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Data {

    private final Conexion con;
    private ResultSet rs;
    private String query;

    public Data() throws SQLException, ClassNotFoundException {

        con = new Conexion(
                "localhost",
                "bdAlmaAstrologia",//nombre BD
                "root",
                "12345"//Password
        );

    }
}
