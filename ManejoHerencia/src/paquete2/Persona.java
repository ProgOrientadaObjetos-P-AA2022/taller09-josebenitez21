/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author M S I
 */
public class Persona {

    public String nombre;
    private String apellido;
    private String username;

    public Persona(String a, String b, String c) {
        nombre = a;
        apellido = b;
        username = c;
    }

    public void establecerNombre(String a) {
        nombre = a;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerUsername(String a) {
        username = a;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUsername() {
        return username;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Nombre: %s\n"
                + "apellido: %s\n"
                + "Username: %s",
                nombre,
                apellido,
                username);
        return cadena;
    }

}
