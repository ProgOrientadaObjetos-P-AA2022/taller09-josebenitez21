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
        cadena = String.format("Beneficiario: %s\n"
                + "Ciudad: %s\n"
                + "Tiempo Prestamo: %d\n"
                + "Tipo de Auto: %s\n"
                + "Marca del Auto: %s\n"
                + "Garante: %s"
                + "Valor del Vehiculo: %.2f"
                + "Valor mensual a pagar: %.2f",
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
