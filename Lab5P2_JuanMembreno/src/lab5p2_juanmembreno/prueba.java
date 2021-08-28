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
public class prueba {
    private String nombre;
    private String puntuaje;

    public prueba(String nombre, String puntuaje) {
        this.nombre = nombre;
        this.puntuaje = puntuaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuntuaje() {
        return puntuaje;
    }

    public void setPuntuaje(String puntuaje) {
        this.puntuaje = puntuaje;
    }

    @Override
    public String toString() {
        return "prueba{" + "nombre=" + nombre + ", puntuaje=" + puntuaje + '}';
    }
    
}
