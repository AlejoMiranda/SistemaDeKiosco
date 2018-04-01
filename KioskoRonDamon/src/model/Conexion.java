package model;

import java.sql.Connection;
/*establecer la coneccion*/
import java.sql.Statement;
/* ejecutar consultas*/
import java.sql.ResultSet;
/*Recorrer la tabla virtual de mysql*/
import java.sql.DriverManager;
import java.sql.SQLException;

/*obtener la conexion con el driver*/

public class Conexion { // general
    // atributos

    private Connection con;
    private Statement sentencia;
    private ResultSet tablaVirtual/*(rs)*/;

    // constructor
    // datos necesarios
    // server 
    // user
    // pass
    // bdName
    public Conexion(String server, String user, String pass, String bdName) throws ClassNotFoundException, SQLException {
        // definir url de conexion
        String protocolo = "jdbc:mysql://";
        String lineaUsuario = "user=" + user;
        String lineaPass = "password=" + pass;

        String url = protocolo + server + "/" + bdName + "?" + lineaUsuario + "&" + lineaPass;

        System.out.println(url);

        // cargar en tiempo de ejecucion el driver
        Class.forName("com.mysql.jdbc.Driver");
        
        // rescatar el objeto conexion desde el driver
        con = DriverManager.getConnection(url);
    }
    
    public void ejecutar(String sql) throws SQLException{
        // 1. crear la sentencia atraves de la coneccion
            // abrir coneccion
        sentencia = con.createStatement();
        
        // 2. ejecutar sql        
        sentencia.execute(sql);
        System.out.println(sql);
        
        // 3. cerrar la conexion 
        desconectar();
    }
    
    public ResultSet ejecutarSql(String select) throws SQLException{
        sentencia = con.createStatement();
        
        tablaVirtual = sentencia.executeQuery(select);
        
        return tablaVirtual;
    }
    
    public void desconectar() throws SQLException{
        sentencia.close();
    }
//     public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Conexion c = new Conexion("localhost", "root", "", "bd_alimentos");
//        
//        String insert = "insert into alimento values(null,'Lolipop','Sabory',true)";
//        
//        c.ejecutar(insert);
//    }

}
