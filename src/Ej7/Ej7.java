
package Ej7;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7 {
    
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        System.out.println("CUANTOS NOTAS DE ALUMNOS DESEA INGRESAR: ");
        int dimension = key.nextInt();
        
        double [] arreglo = new double[dimension];
        
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("NOTA ["+(i+1)+"]: ");
            arreglo[i] = key.nextDouble();
        }
        
        int contadorReprobados = 0, contadorAprobados = 0, contadorSuperiores = 0;
        double promedio = 0, porcentajeAprobados = 0, porcentajeReprobados = 0;
        for(int i = 0; i < arreglo.length; i++){
            
            if(arreglo[i] >= 3.0){
                contadorAprobados++;
            }else{
                contadorReprobados++;
            }
            
            if(arreglo[i] >= 4.0){
                contadorSuperiores++;
            }
            promedio += arreglo[i];
        }
        
        promedio /= dimension;
        porcentajeAprobados = (contadorAprobados*100)/dimension;
        porcentajeReprobados = (contadorReprobados*100)/dimension;
        
        System.out.println("*********************************************");
        System.out.println("EL PROMEDIO GENERAL DEL GRUPO ES: "+promedio
                +"\nAPROBADOS: "+contadorAprobados
                +"\nREPROBADOS: "+contadorReprobados
                +"\nPORCENTAJE DE APROBADOS: "+porcentajeAprobados+"%"
                +"\nPORCENTAJE DE REPROBADOS: "+porcentajeReprobados+"%"
                +"\nALUMNOS CON CALIFICACION SUPERIOR O IGUAL A 4.0: "+contadorSuperiores);
    }
    
}
