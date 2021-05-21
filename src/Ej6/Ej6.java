
package Ej6;

import java.util.Scanner;

public class Ej6 {
    
    public static void main(String[] args) {
        
        Scanner key = new Scanner(System.in);
        
        System.out.println("CUANTOS NUMEROS DESEA INGRESAR: ");
        int dimension = key.nextInt();
        
        int [] arreglo = new int[dimension];
        
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("NUMERO ["+(i+1)+"]: ");
            arreglo[i] = key.nextInt();
        }
        
        int temp = 0;
        //ORDENAMIENTO TIPO BURBUJA
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 0; j < arreglo.length-1; j++){
                if(arreglo[j] < arreglo[j+1]){
                    temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                }
            }
        }
        
        int indice = 0;
        for(int array : arreglo){
            System.out.println("Vector ["+indice+"] = "+array);
            indice++;
        }
        
    }
    
}
