/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;


import paquete2.*;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double pagoMensualCa;

    public PrestamoEducativo(Persona pe, int m, String ci, String k,
            InstitucionEducativa ie, double vc, double vmc ) {
        super(pe, ci.toUpperCase(), m);
        nivelEstudio = k ;
        centroEducativo = ie;
        valorCarrera = vc;
        pagoMensualCa = vmc;
    }

    public void establecerNivelEstudio(String a) {
        nivelEstudio = a;
    }

    public void establecerCentroEducativo(InstitucionEducativa a) {
        centroEducativo = a;
    }

    public void establecerValorCarrera(double a) {
        valorCarrera = a;
    }

    public void establecerPagoMensualCa() {
        pagoMensualCa = (valorCarrera / tiempoPres)
                - ((valorCarrera / tiempoPres) * 0.10);
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerPagoMensualCa() {
        return pagoMensualCa;
    }

    @Override
    public String toString() {

        String cadena = "----------------Datos de préstamo educativo---------------";
        cadena = String.format("%s%s", cadena, super.toString());
        cadena = String.format("%s\n"
                + "Nivel de estudio: %s\n"
                + "Centro Educativo: %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual de pago: %.2f\n",
                cadena,
                obtenerNivelEstudio(),
                obtenerCentroEducativo(),
                obtenerValorCarrera(),
                obtenerPagoMensualCa());

        return cadena;
    }
}
