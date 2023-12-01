/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2;

/**
 *
 * @author hapav
 */public class Usuario {

    private String Nombre;
    private Object guardado;

    public Usuario(String Nombre, Object guardado) {
        this.Nombre = Nombre;
        this.guardado = guardado;
    }

    public Usuario(String Nombre) {
        this.Nombre = Nombre;
    }

    public Usuario() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Object getGuardado() {
        return guardado;
    }

    public void setGuardado(Object guardado) {
        this.guardado = guardado;
    }

    @Override
    public String toString() {
        return Nombre;
    }

}
