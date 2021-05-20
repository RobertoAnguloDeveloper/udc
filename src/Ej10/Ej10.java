/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej10;

import java.util.Scanner;

/**
 *
 * @author hacke
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        
        Scanner key = new Scanner(System.in);
        
        System.out.println("LLENE LA MATRIZ"
                +"\n****************");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print("ELEMENTO ["+(i+1)+"]"+"["+(j+1)+"]: ");
                matriz[i][j] = key.nextInt();
            }
        }
        
        System.out.println("\nMATRIZ ORIGINAL");
        System.out.println("**************************");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print("\t"+matriz[i][j]);
                if(j == matriz[0].length-1){
                    System.out.println("");
                }
            }
        }
        System.out.println("************************");
        
        System.out.println("\nMATRIZ TRANSPUESTA");
        System.out.println("**************************");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print("\t"+matriz[j][i]);
                if(j == matriz[0].length-1){
                    System.out.println("");
                }
            }
        }
        System.out.println("************************");
    }
    
}
