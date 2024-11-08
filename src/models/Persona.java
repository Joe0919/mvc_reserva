package models;

/**
 *
 * @author JOEL
 */
public class Persona {

    private int idPersona;
    private String DNI;
    private String nombres;
    private String apPaterno;
    private String apMaterno;
    private String direccion;
    private String telefono;
    private String email;
    private boolean borrado;

    public Persona() {
        this.idPersona = 0;
        this.DNI = "";
        this.nombres = "";
        this.apPaterno = "";
        this.apMaterno = "";
        this.direccion = "";
        this.telefono = "";
        this.email = "";
        this.borrado = false;
    }

    public Persona(int idPersona, String DNI, String nombres, String apPaterno, String apMaterno, String direccion, String telefono, String email, boolean borrado) {
        this.idPersona = idPersona;
        this.DNI = DNI;
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.borrado = borrado;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

}
