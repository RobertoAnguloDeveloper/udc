/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej9;

/**
 *
 * @author hacke
 */
public class Ej9 {

    public static void main(String[] args) {
        int [][] matriz = {{0,2,5,7,6},{0,0,0,3,8},{2,9,6,3,4},{1,5,6,1,4}
                ,{0,9,2,5,0}};
        int [] renglon = new int[5];
        int contadorCeros = 0;
        
        //IMPRIME MATRIZ
        System.out.println("");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print("\t"+matriz[i][j]);
                if(j == matriz[0].length-1){
                    System.out.println("");
                }
            }
        }
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                if(matriz[i][j] == 0){
                    contadorCeros++;
                }
            }
            renglon[i] = contadorCeros;
            contadorCeros = 0;
        }
        
        System.out.println("");
        
        for(int i = 0; i < renglon.length; i++){
            System.out.println("RENGLON ["+(i+1)+"] tiene "+renglon[i]+" CEROS");
        }
    }
    
}
