/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo081 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        int opcion;                                      // Alex Sanchez
        String mensajeSuma;
        String mensajeSumaDos;
        // mensajeSuma = obtenerTablaSumar(10, 9);// se invoca al método 
        // obtenerTablaSumar
        // y el valor que 
        // devuelve se lo 
        // almacena  en mensajeSuma
        System.out.println("ingrese 1 para ingresar suma \n ingrese 2 para ingresar una multiplicacion2"
                + "2");
        opcion = entrada.nextInt();

        //  mensajeSumaDos = obtenerTablaMultiplicar(10, 9);
        if (opcion == 1) {
            mensajeSuma = obtenerTablaSumar(10, 9);
            System.out.printf("%s\n", mensajeSuma);
            // System.out.printf("%s\n", mensajeSumaDos);
        } else {
            if (opcion == 2) {
                mensajeSumaDos = obtenerTablaMultiplicar(10, 9);
                System.out.printf("%s\n", mensajeSumaDos);
            } else {
                System.out.println("error");
            }
        }
    }

    public static String obtenerTablaSumar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;

    }

    public static String obtenerTablaMultiplicar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;     // Santiago Chavez

    }

}
