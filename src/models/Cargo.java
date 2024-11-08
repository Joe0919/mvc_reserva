package models;

/**
 *
 * @author JOEL
 */
public class Cargo {

    private int idCargo;
    private String cargo;
    private String descripcion;
    private boolean borrado;

    public Cargo(int idCargo, String cargo, String descripcion, boolean borrado) {
        this.idCargo = idCargo;
        this.cargo = cargo;
        this.descripcion = descripcion;
        this.borrado = borrado;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

}
