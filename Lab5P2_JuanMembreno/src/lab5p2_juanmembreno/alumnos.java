/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_juanmembreno;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class alumnos {
     private String nombre;
    private String apellido;
    private int numerocuenta;
    private String carrera;
    private int anocursa;
    private int cantidaddeclasesfaltantes;
private String usuario;
    private String contrasena;
    ArrayList<prueba> lp=new ArrayList();
    
    public alumnos() {
    }

    public alumnos(String nombre, String apellido, int numerocuenta, String carrera, int anocursa, int cantidaddeclasesfaltantes, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numerocuenta = numerocuenta;
        this.carrera = carrera;
        this.anocursa = anocursa;
        this.cantidaddeclasesfaltantes = cantidaddeclasesfaltantes;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public alumnos(String nombre, String apellido, int numerocuenta, String carrera, int anocursa, int cantidaddeclasesfaltantes, String usuario, String contrasena,ArrayList<prueba> lp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numerocuenta = numerocuenta;
        this.carrera = carrera;
        this.anocursa = anocursa;
        this.cantidaddeclasesfaltantes = cantidaddeclasesfaltantes;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.lp=lp;
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

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAnocursa() {
        return anocursa;
    }

    public void setAnocursa(int anocursa) {
        this.anocursa = anocursa;
    }

    public int getCantidaddeclasesfaltantes() {
        return cantidaddeclasesfaltantes;
    }

    public void setCantidaddeclasesfaltantes(int cantidaddeclasesfaltantes) {
        this.cantidaddeclasesfaltantes = cantidaddeclasesfaltantes;
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

    public ArrayList<prueba> getLp() {
        return lp;
    }

    public void setLp(ArrayList<prueba> lp) {
        this.lp = lp;
    }

    @Override
    public String toString() {
        return "alunnos{" + "nombre=" + nombre + ", apellido=" + apellido + ", numerocuenta=" + numerocuenta + ", carrera=" + carrera + ", anocursa=" + anocursa + ", cantidaddeclasesfaltantes=" + cantidaddeclasesfaltantes + '}';
    }
    
}
