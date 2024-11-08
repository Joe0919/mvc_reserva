package models;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *
 * @author JOEL
 */
public class Empleado {

    private int idEmpleado;
    private Persona persona;
    private Cargo cargo;
    private double sueldo;
    private Timestamp fecha_contrato;
    private boolean borrado;

    public Empleado() {
        this.idEmpleado = 0;
        this.persona = null;
        this.cargo = null;
        this.sueldo = 0.0;
        this.fecha_contrato = null;
        this.borrado = false;
    }

    public Empleado(int idEmpleado, Persona persona, Cargo cargo, Double sueldo, Timestamp fecha_contrato, boolean borrado) {
        this.idEmpleado = idEmpleado;
        this.persona = persona;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.fecha_contrato = fecha_contrato;
        this.borrado = borrado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Timestamp getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(Timestamp fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

}
