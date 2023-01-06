/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

import static ejemplos01.Ejemplo03.obtenerSuma;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo042 {

    public static void main(String[] args) {
        // 
        int [] arreglo1 = {100, 200 , 300, 400, 500};
        int [] arreglo2 = {1000, 2000, 3000, 4000, 5000};
        
        for (int i = 0; i < arreglo1.length; i++) {
            int primerValor = arreglo1 [i];
            int segundoValor = arreglo2 [i];
            obtenerSuma(primerValor, segundoValor);          
        }
        
        for (int i = 0; i < arreglo1.length; i++) {
            
            obtenerSuma(arreglo1[i], arreglo2[i]);
    
    }

 

    }

}
