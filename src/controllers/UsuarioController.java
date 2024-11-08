package controllers;

import conexion.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Usuario;

/**
 *
 * @author JOEL
 */
public class UsuarioController {

    public static Conexion conexion = new Conexion();
    String sql;

    public boolean loginUser(Usuario objUsuario) {
        boolean respuesta = false;

        sql = "SELECT idusuario, concat(nombre,' ',appaterno,' ',apmaterno) 'Datos', cargo, rol "
                + "FROM usuario u JOIN empleado e ON e.idempleado=u.idempleado "
                + "JOIN persona p ON p.idpersona=e.idpersona "
                + "JOIN cargo c ON c.idcargo=e.idcargo "
                + "JOIN rol r ON r.idrol=u.idrol "
                + "WHERE dni = ? and psw = ?";

        try {
            conexion.ps = Conexion.conectar().prepareStatement(sql);
            conexion.ps.setString(1, objUsuario.getEmpleado().getPersona().getDNI());
            conexion.ps.setString(2, objUsuario.getPassword());

            conexion.rt = conexion.ps.executeQuery();
            while (conexion.rt.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al Iniciar Sesion" + e);
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");
        }
        return respuesta;
    }
}
