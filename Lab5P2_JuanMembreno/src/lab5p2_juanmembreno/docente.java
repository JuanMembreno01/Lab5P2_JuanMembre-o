/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_juanmembreno;

/**
 *
 * @author usuario
 */
public class docente {
    private String nombre;
    private String apellido;
    private String titulo;
    private String titulomaestria;
    private String cantidaddealumnosmax;
    private String nombreclase;
    private String descripcion;
 private String usuario;
    private String contrasena;
    public docente() {
    }

    public docente(String nombre, String apellido, String titulo, String titulomaestria, String cantidaddealumnosmax, String nombreclase, String descripcion, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.titulomaestria = titulomaestria;
        this.cantidaddealumnosmax = cantidaddealumnosmax;
        this.nombreclase = nombreclase;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.contrasena = contrasena;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulomaestria() {
        return titulomaestria;
    }

    public void setTitulomaestria(String titulomaestria) {
        this.titulomaestria = titulomaestria;
    }

    public String getCantidaddealumnosmax() {
        return cantidaddealumnosmax;
    }

    public void setCantidaddealumnosmax(String cantidaddealumnosmax) {
        this.cantidaddealumnosmax = cantidaddealumnosmax;
    }

    public String getNombreclase() {
        return nombreclase;
    }

    public void setNombreclase(String nombreclase) {
        this.nombreclase = nombreclase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "docente{" + "nombre=" + nombre + ", apellido=" + apellido + ", titulo=" + titulo + ", titulomaestria=" + titulomaestria + ", cantidaddealumnosmax=" + cantidaddealumnosmax + ", nombreclase=" + nombreclase + ", descripcion=" + descripcion + '}';
    }
    
            
}
