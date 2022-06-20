/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.Persona;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        String apellido;
        String username;
        String ciudad;
        int meses;
        String option;
        String mensaje;

        System.out.println("Bienvenido a nuestro sistema de Informacion");
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su Username");
        username = entrada.nextLine();
        Persona per = new Persona(nombre, apellido);
        //System.out.printf("%s", per);
        System.out.println("Ingrese su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su los meses para los cuales obtendra el prestamo");
        meses = entrada.nextInt();

        Prestamo pres = new Prestamo(per, ciudad, meses);
        
        System.out.printf("%s", pres);

    }
}
