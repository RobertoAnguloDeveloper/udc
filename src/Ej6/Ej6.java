
package Ej6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {
        Double [] notasEstudiante = new Double[5];
        
        Scanner key = new Scanner(System.in);
        
        //LLENANDO EL ARREGLO
        double notaComparar = 0;
        for(int i = 0; i < notasEstudiante.length; i++){
            System.out.println("Ingrese las notas del estudiante: ");
            notasEstudiante[i] = key.nextDouble();
        }
        
        //ORDENANDO ARREGLO DESCENDENTEMENTE (MAYOR A MENOR)
        int inicio = 0;
        int fin = notasEstudiante.length-1;
        Arrays.sort(notasEstudiante, Collections.reverseOrder());
            
        int indice = 0;
        for (double notas : notasEstudiante) {
            indice++;
            System.out.println("Nota ["+indice+"]: "+notas);
        }
    }
}
