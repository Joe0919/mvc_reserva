
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import conexion.Conexion;

/**
 *
 * @author JOEL
 */
public class DatabaseHelpers {

    public static Conexion conexion = new Conexion();

    public void LimpJtable(DefaultTableModel mdtb) {
        while (mdtb.getRowCount() > 0) {
            mdtb.removeRow(0);
        }
    }

    public String DevolverRegistroDto(String sq, int pos) {//se usa en procedimiento que te envian un mensaje
        String rs = "";
        try {
            conexion.st = Conexion.conectar().createStatement();
            conexion.rt = conexion.st.executeQuery(sq);
            if (conexion.rt.next()) {
                rs = conexion.rt.getString(pos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public String ObtenerRegistro(String sq) {//se usa en procedimiento que te envian un mensaje
        String rs = "";
        try {
            conexion.st = Conexion.conectar().createStatement();
            conexion.rt = conexion.st.executeQuery(sq);
            while (conexion.rt.next()) {
                rs = conexion.rt.getInt(1) + "," + conexion.rt.getString(2) + "," + conexion.rt.getString(3)
                        + "," + conexion.rt.getString(4) + "," + conexion.rt.getString(5);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet DevolverRegistro(String sq) {
        try {
            conexion.st = Conexion.conectar().createStatement();
            conexion.rt = conexion.st.executeQuery(sq);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexion.rt;
    }

    public void LlenarJtable(DefaultTableModel mdtb, String cnst, int lgt) {
        try {
            LimpJtable(mdtb);
            String[] dt = new String[lgt];
            conexion.rt = DevolverRegistro(cnst);

            while (conexion.rt.next()) {
                for (int n = 0; n < lgt; n++) {
                    dt[n] = conexion.rt.getString(n + 1);
                }
                mdtb.addRow(dt);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void LlenarJtable1(DefaultTableModel mdtb, String cnst, int lgt) {
        try {
            String[] dt = new String[lgt];
            conexion.rt = DevolverRegistro(cnst);

            while (conexion.rt.next()) {
                for (int n = 0; n < lgt; n++) {
                    dt[n] = conexion.rt.getString(n + 1);
                }
                mdtb.addRow(dt);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void LlenarCombo(JComboBox cbo, String Consulta, int pos) {
        cbo.removeAllItems();

        try {
            conexion.rt = DevolverRegistro(Consulta);
            while (conexion.rt.next()) {
                cbo.addItem(conexion.rt.getString(pos));
            }
//            cbo.setSelectedIndex(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean Verficnst(String sq) {
        boolean b = false;
        try {
            conexion.st = conexion.conectar().createStatement();
            conexion.rt = conexion.st.executeQuery(sq);
            b = conexion.rt.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    public void CrearRegistro(String sq) {
        try {
            conexion.st = conexion.conectar().createStatement();
            conexion.st.executeUpdate(sq);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void EliminarRegistro(String sq) {
        try {
            conexion.st = conexion.conectar().createStatement();
            conexion.st.executeUpdate(sq);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String ObtenerTipo(String sq) {//se usa en procedimiento que te envian un mensaje
        String rs = "";
        try {
            conexion.st = Conexion.conectar().createStatement();
            conexion.rt = conexion.st.executeQuery(sq);
            while (conexion.rt.next()) {
                rs = conexion.rt.getInt(1) + "," + conexion.rt.getString(2) + "," + conexion.rt.getString(3)
                        + "," + conexion.rt.getString(4) + "," + conexion.rt.getString(5);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
