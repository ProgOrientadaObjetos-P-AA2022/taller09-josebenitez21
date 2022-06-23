/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.*;

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
        int option;
        String mensaje;
        ///////////Variables prestamo vehiculo//////////////
        String tipo;
        String marca;
        String garantePer;
        String garanteAp;
        String garanteUser;
        double valorVe;
        double valorMensual = 0;
        //////////Variables de prestamo Educativo////////
        String nivelEs;
        String centroEd;
        String siglasEd;
        double valorCarre;
        double pagoMensu = 0;

        do {
            System.out.println("De acuerdo a las opciones, seleccione el prestamo"
                    + "que necesita: "
                    + "\n[1]Prestamo Automovil\n[2]Prestamo Estudiantil\n"
                    + "[3] Salir");
            option = entrada.nextInt();
            entrada.nextLine();
            //if (option == 1 || option == 2 || option == 5) {
            if (option == 1 || option == 2 || option == 5) {

                System.out.println("Bienvenido a nuestro sistema de Informacion");
                System.out.println("Ingrese su nombre");
                nombre = entrada.nextLine();
                System.out.println("Ingrese su apellido");
                apellido = entrada.nextLine();
                System.out.println("Ingrese su Username");
                username = entrada.nextLine();
                Persona per = new Persona(nombre, apellido, username);
                //System.out.printf("%s", per);
                System.out.println("Ingrese su ciudad");
                ciudad = entrada.nextLine();
                System.out.println("Ingrese su los meses para los cuales obtendra el prestamo");
                meses = entrada.nextInt();
                entrada.nextLine();//limpieza de buffer

                Persona person = new Persona(nombre, apellido, username);
                person.establecerNombre(nombre);
                person.establecerApellido(apellido);
                person.establecerUsername(username);
                switch (option) {
                    case 1:

                        System.out.println("Ingrese el tipo de automovil");
                        tipo = entrada.nextLine();
                        System.out.println("Ingrese la marca del Auto");
                        marca = entrada.nextLine();
                        System.out.println("Ingrese el nombre de su garante");
                        garantePer = entrada.nextLine();
                        System.out.println("Ingrese el apellido de su"
                                + " garante");
                        garanteAp = entrada.nextLine();
                        System.out.println("Ingrese el username de su "
                                + "garante");
                        garanteUser = entrada.nextLine();
                        System.out.println("Ingrese el valor del automovil");
                        valorVe = entrada.nextDouble();

                        Persona garante1 = new Persona(garantePer, garanteAp,
                                garanteUser);
                        garante1.establecerNombre(garantePer);
                        garante1.establecerApellido(garanteAp);
                        garante1.establecerUsername(garanteUser);

                        PrestamoAutomovil prestAuto = new PrestamoAutomovil(
                                person, meses, ciudad, tipo, marca, garante1, valorVe, valorMensual);
                        prestAuto.establecerBeneficiario(person);
                        prestAuto.establecerTiempoPres(meses);
                        prestAuto.establecerCiudad(ciudad);
                        prestAuto.establecerTipoAuto(tipo);
                        prestAuto.establecerMarcaAuto(marca);
                        prestAuto.establecerGarante(garante1);
                        prestAuto.establecerValorVe(valorVe);
                        prestAuto.establecerValorMensualP();
                        System.out.printf("%s\n", prestAuto);
                        break;
                    case 2:
                        System.out.println("Ingresa tu nivel de estudio");
                        nivelEs = entrada.nextLine();
                        System.out.println("Ingresa el nombre del Centro "
                                + "Educativo");
                        centroEd = entrada.nextLine();
                        System.out.println("Ingresa las siglas del Centro "
                                + "Educativo");
                        siglasEd = entrada.nextLine();
                        System.out.println("Ingrese el costo de la carrera");
                        valorCarre = entrada.nextDouble();
                        InstitucionEducativa nuevaIns = new InstitucionEducativa(centroEd, siglasEd);
                        PrestamoEducativo presEd = new PrestamoEducativo(person,
                                meses, ciudad, nivelEs, nuevaIns, valorCarre, pagoMensu);
                        presEd.establecerBeneficiario(person);
                        presEd.establecerTiempoPres(meses);
                        presEd.establecerCiudad(ciudad);
                        presEd.establecerNivelEstudio(nivelEs);
                        presEd.establecerCentroEducativo(nuevaIns);
                        presEd.establecerValorCarrera(valorCarre);
                        presEd.establecerPagoMensualCa();
                        System.out.printf("%s\n", presEd);
                        break;

                    default:

                }
            } else {

                //System.out.println("--------Intente nuevamente-------");
            }
            if (option == 3) {
                System.out.println("--------Gracias por usar nuestro servicio"
                        + "--------");
            }
        } while (option != 3);

    }
}
