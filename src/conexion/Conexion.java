/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JOEL
 */
public class Conexion {

    public static String usuario, password, host, db, url;

    public PreparedStatement ps = null;
    public CallableStatement cllst = null;
    public Connection conec1 = null;
    public Statement st = null, st1 = null;
    public ResultSet rt = null, rt1 = null;

    public static Connection conectar() {
        try {
            usuario = "root";
            password = "";
            host = "localhost";
            db = "db_reservas";
            url = "jdbc:mysql://" + host + "/" + db;
            Connection conec = DriverManager.getConnection(url, usuario, password);
            return conec;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local " + e);
        }
        return null;
    }
}
