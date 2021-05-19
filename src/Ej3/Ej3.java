/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

import java.util.Scanner;

/**
 *
 * @author TECNOLOGIA GC
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        int [] sumaFilas = new int[3];
        int [] sumaColumnas = new int[3];
        
        Scanner key = new Scanner(System.in);
        
        System.out.println("LLENE LA MATRIZ"
                +"\n****************");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print("ELEMENTO ["+(i+1)+"]"+"["+(j+1)+"]: ");
                matriz[i][j] = key.nextInt();
            }
        }
        
        System.out.println("\nMATRIZ LLENA"
                +"\n***************");
        //IMPRIME MATRIZ FINAL Y SUMA FILAS Y COLUMNAS
        int j = 0, indiceSumaFilas = 0, indiceSumaColumnas = 0, sumaTempFilas = 0
                , sumaTempColumnas = 0;
        for(int i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz[0].length; j++){
                sumaTempFilas += matriz[i][j];
                System.out.print("\t"+matriz[i][j]);
                if(j == matriz[0].length-1){
                    System.out.println("");
                }
            }
//            sumaTempColumnas += matriz[i][j];
            sumaFilas[indiceSumaFilas] = sumaTempFilas;
            sumaColumnas[indiceSumaColumnas] = sumaTempColumnas;
//            j++;
            sumaTempFilas = 0;
            sumaTempColumnas = 0;
            indiceSumaFilas++;
        }
        
        for(int i = 0; i < sumaFilas.length; i++){
            System.out.println("SUMA FILA "+(i+1)+" = "+sumaFilas[i]);
        }
        
        for(int i = 0; i < sumaColumnas.length; i++){
            System.out.println("SUMA COLUMNA "+(i+1)+" = "+sumaColumnas[i]);
        }
    }
    
}
