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
public class decano {

    private String nombre;
    private String apellido;
    private String titulo;
    private int id;
    private int edad;
    private String titulouniversitario;
    private String titulomaestria;
 private String usuario;
    private String contrasena;
    public decano() {
    }

    public decano(String nombre, String apellido, String titulo, int id, int edad, String titulouniversitario, String titulomaestria, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.id = id;
        this.edad = edad;
        this.titulouniversitario = titulouniversitario;
        this.titulomaestria = titulomaestria;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTitulouniversitario() {
        return titulouniversitario;
    }

    public void setTitulouniversitario(String titulouniversitario) {
        this.titulouniversitario = titulouniversitario;
    }

    

    public String getTitulomaestria() {
        return titulomaestria;
    }

    public void setTitulomaestria(String titulomaestria) {
        this.titulomaestria = titulomaestria;
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
        return "decano{" + "nombre=" + nombre + ", apellido=" + apellido + ", titulo=" + titulo + ", id=" + id + ", edad=" + edad + ", titulouniversitario=" + titulouniversitario + ", titulomaestria=" + titulomaestria + '}';
    }

}
