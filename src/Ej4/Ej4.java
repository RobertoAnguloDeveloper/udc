
package Ej4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Double [] notasEstudiante = new Double[5];
        
        Scanner key = new Scanner(System.in);
        
        //LLENANDO EL ARREGLO
        for(int i = 0; i < notasEstudiante.length; i++){
            System.out.println("Ingrese las notas del estudiante: ");
            notasEstudiante[i] = key.nextDouble();
        }
        
        //ORDENANDO ARREGLO DESCENDENTEMENTE (MAYOR A MENOR)
        Arrays.sort(notasEstudiante, Collections.reverseOrder());
            
        int indice = 0;
        for (double notas : notasEstudiante) {
            indice++;
            System.out.println("Nota ["+indice+"]: "+notas);
        }
    }
}
