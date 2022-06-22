/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author M S I
 */
public class InstitucionEducativa {

    private String nombreI;
    private String siglas;

    public InstitucionEducativa(String a, String b) {
        nombreI = a;
        siglas = b;
    }

    public void establecerNombreI(String a) {
        nombreI = a;

    }

    public void establecerSiglas(String a) {
        siglas = a;
    }

    public String obtenerNombreI() {
        return nombreI;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Nombre del Centro Educativo: %s\n"
                + "Siglas del Centro Educativo: %s", nombreI, siglas);
        return cadena;
    }

}
