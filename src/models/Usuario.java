package models;

import java.sql.Timestamp;

/**
 *
 * @author JOEL
 */
public class Usuario {

    private int idUsuario;
    private Empleado empleado;
    private Rol rol;
    private String password;
    private Timestamp fecha_creacion;
    private Timestamp fecha_edicion;
    private Timestamp ultimo_acceso;
    private boolean estado;
    private boolean borrado;

    public Usuario() {

        this.idUsuario = 0;
        this.empleado = null;
        this.rol = null;
        this.password = "";
        this.fecha_creacion = new Timestamp(System.currentTimeMillis());
        this.fecha_edicion = null;
        this.ultimo_acceso = null;
        this.estado = true;
        this.borrado = false;
    }

    public Usuario(int idUsuario, Empleado empleado, Rol rol, String password, Timestamp fecha_creacion, Timestamp fecha_edicion, Timestamp ultimo_acceso, boolean estado, boolean borrado) {
        this.idUsuario = idUsuario;
        this.empleado = empleado;
        this.rol = rol;
        this.password = password;
        this.fecha_creacion = fecha_creacion;
        this.fecha_edicion = fecha_edicion;
        this.ultimo_acceso = ultimo_acceso;
        this.estado = estado;
        this.borrado = borrado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Timestamp fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Timestamp getFecha_edicion() {
        return fecha_edicion;
    }

    public void setFecha_edicion(Timestamp fecha_edicion) {
        this.fecha_edicion = fecha_edicion;
    }

    public Timestamp getUltimo_acceso() {
        return ultimo_acceso;
    }

    public void setUltimo_acceso(Timestamp ultimo_acceso) {
        this.ultimo_acceso = ultimo_acceso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

}
