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
public class ceo {
    private String nombre;
    private String apellido;
    private String titulo;
    private int id;
    private int anose;
    private int eded;
    private String usuario;
    private String contrasena;

    public ceo() {
    }

    public ceo(String nombre, String apellido, String titulo, int id, int anose, int eded, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.id = id;
        this.anose = anose;
        this.eded = eded;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnose() {
        return anose;
    }

    public void setAnose(int anose) {
        this.anose = anose;
    }

    public int getEded() {
        return eded;
    }

    public void setEded(int eded) {
        this.eded = eded;
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
        return "ceo{" + "nombre=" + nombre + ", apellido=" + apellido + ", titulo=" + titulo + ", id=" + id + ", anose=" + anose + ", eded=" + eded + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }
    
}
