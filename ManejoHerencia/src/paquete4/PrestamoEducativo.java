/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private String centroEducativo;
    private double valorCarrera;
    private double pagoMensualCa;

    public void establecerNivelEstudio(String a) {
        nivelEstudio = a;
    }

    public void establecerCentroEducativo(String a) {
        centroEducativo = a;
    }

    public void establecerValorCarrera(double a) {
        valorCarrera = a;
    }

    public void establecerPagoMensualCa() {
        pagoMensualCa = (valorCarrera / tiempoPres) - ((valorCarrera / tiempoPres) * 0.10);
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public String obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerPagoMensualCa() {
        return pagoMensualCa;
    }

}
