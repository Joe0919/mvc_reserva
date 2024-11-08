package models;

/**
 *
 * @author JOEL
 */
public class Rol {

    private int idRol;
    private String rol;
    private String descripcion;
    private boolean estado;
    private boolean borrado;

    public Rol(int idRol, String rol, String descripcion, boolean estado, boolean borrado) {
        this.idRol = idRol;
        this.rol = rol;
        this.descripcion = descripcion;
        this.estado = estado;
        this.borrado = borrado;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
