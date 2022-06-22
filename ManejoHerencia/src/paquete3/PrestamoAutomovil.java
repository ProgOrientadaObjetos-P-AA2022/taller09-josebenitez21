/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAuto;
    private String marcaAuto;
    private Persona garante;
    private double valorVe;
    private double valorMensualP;

    public PrestamoAutomovil(Persona pe, int m, String ci, String ta, String ma,
            Persona g1, double valV, double valM) {
        super(pe, ci.toLowerCase(), m);
        tipoAuto = ta;
        marcaAuto = ma;
        garante = g1;
        valorVe = valV;
        valorMensualP = valM;
    }

    public void establecerTipoAuto(String a) {
        tipoAuto = a;
    }

    public void establecerMarcaAuto(String a) {
        marcaAuto = a;
    }

    public void establecerGarante(Persona a) {
        garante = a;
    }

    public void establecerValorVe(double a) {
        valorVe = a;
    }

    public void establecerValorMensualP() {
        valorMensualP = valorVe / tiempoPres;
    }

    public String obtenerTipoAuto() {
        return tipoAuto;
    }

    public String obtenerMarcaAuto() {
        return marcaAuto;
    }

    public Persona obtenerGarante() {
        return garante;
    }

    public double obtenerValorVe() {
        return valorVe;
    }

    public double obtenerValorMensualP() {
        return valorMensualP;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format(" %s\n"
                + "Ciudad: %s\n"
                + "Tiempo Prestamo: %d\n"
                + "Tipo de Auto: %s\n"
                + "Marca del Auto: %s\n"
                + "Garante: %s\n"
                + "Valor del Vehiculo: %.2f\n"
                + "Valor mensual a pagar: %.2f\n",
                beneficiario,
                ciudad,
                tiempoPres,
                tipoAuto,
                tipoAuto,
                marcaAuto,
                valorVe,
                valorMensualP);
        return cadena;
    }

}
