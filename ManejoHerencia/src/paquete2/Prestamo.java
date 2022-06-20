/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected String ciudad;
    protected int tiempoPres;

    public Prestamo(Persona a, String b, int c) {
        beneficiario = a;
        ciudad = b;
        tiempoPres = c;
    }

    public void establecerBeneficiario(Persona a) {
        beneficiario = a;
    }

    public void establecerCiudad(String b) {
        ciudad = b;
    }

    public void establecerTiempoPres(int c) {
        tiempoPres = c;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public int obtenerTiempoPres() {
        return tiempoPres;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Nombre: %s\n"
                + "Ciudad: %s\n"
                + "Meses: %d\n",
                beneficiario, ciudad, tiempoPres);
        return cadena;
    }
}
