
package Ej8;

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {
        int [][] matriz = new int[5][4];
        int [] sumaFilas = new int[5];
        int [] sumaColumnas = new int[4];
        
        Scanner key = new Scanner(System.in);
        
        System.out.println("LLENE LA MATRIZ"
                +"\n****************");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print("ELEMENTO ["+(i+1)+"]"+"["+(j+1)+"]: ");
                matriz[i][j] = key.nextInt();
            }
        }
        
        System.out.println("\nMATRIZ LLENA");
        System.out.println("**************************");
        //SUMA FILAS
        int indiceSumaFilas = 0, indiceSumaColumnas = 0, sumaTempFilas = 0
                , sumaTempColumnas = 0;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                sumaTempFilas += matriz[i][j];
            }
            sumaFilas[indiceSumaFilas] = sumaTempFilas;
            sumaTempFilas = 0;
            indiceSumaFilas++;
        }
        
        //SUMA COLUMNAS
        for(int i = 0; i < matriz[0].length; i++){
            for(int j = 0; j < matriz.length; j++){
                sumaTempColumnas += matriz[j][i];
            }
            sumaColumnas[indiceSumaColumnas] = sumaTempColumnas;
            sumaTempColumnas = 0;
            indiceSumaColumnas++;
        }
        
        //IMPRIME LA MATRIZ
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print("\t"+matriz[i][j]);
                if(j == matriz[0].length-1){
                    System.out.println("");
                }
            }
        }
        
        System.out.println("************************");
        
        
        for(int i = 0; i < sumaFilas.length; i++){
            System.out.println("SUMA DE LA FILA "+(i+1)+" = "+sumaFilas[i]);
        }
        
        System.out.println("");
        for(int i = 0; i < sumaColumnas.length; i++){
            System.out.println("SUMA DE LA COLUMNA "+(i+1)+" = "+sumaColumnas[i]);
        }
    }
    
}
