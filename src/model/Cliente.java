package model;

public class Cliente {
    
    private int identificacion;
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;

    public Cliente() {
    }

    public Cliente(int identificacion) {
        this.identificacion = identificacion;
    }

    public Cliente(String nombre, String apellido, String correo, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
    }

    public Cliente(int identificacion, String nombre, String apellido, String correo, String celular) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Cliente{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", celular=" + celular + '}';
    }
    
}
