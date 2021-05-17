/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

/**
 *
 * @author hacke
 */
public class CuadradoMagico {
    private int numeroUnoFila;
    private int numeroUnoColumna;
    private int [] numeros;
    
    public void numeros(int [] numeros){
        //LLENANDO ARREGLO DE NUMEROS POSIBLES 
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i+1;
        }
        this.numeros = numeros;
    }
    
    public void llenadoInicial(int [][] cuadroMagico){
        //LLENANDO MATRIZ CON CEROS, IDENTIFICANDO ASI POSICION VACIA
        boolean ctrl = false;
        for(int i = 0; i < cuadroMagico.length; i++){
            for(int j = 0; j < cuadroMagico[0].length; j++){
                if(j == (cuadroMagico.length-1)/2 && !ctrl){
                    cuadroMagico[i][j] = 1;
                    numeroUnoFila = i;
                    numeroUnoColumna = j;
                    ctrl = true;
                }else{
                    cuadroMagico[i][j] = 0;
                }
            }
        }
    }
    
    public boolean noFila(int [][] cuadroMagico, int i){
        boolean ctrl = false;
        
        try{
            int celda = cuadroMagico[i][0];
//            System.out.println("SI EXISTE FILA");
            return ctrl = false;
        }catch(ArrayIndexOutOfBoundsException err){
//            System.out.println("NO EXISTE FILA");
            return ctrl = true;
        }
    }
    
    public boolean noColumna(int [][] cuadroMagico, int j){
        boolean ctrl = false;
        
        try{
            int celda = cuadroMagico[0][j];
//            System.out.println("SI EXISTE COLUMNA");
            return ctrl = false;
        }catch(ArrayIndexOutOfBoundsException err){
//            System.out.println("NO EXISTE COLUMNA");
            return ctrl = true;
        }
    }
    
    public boolean isCeldaLlena(int [][] cuadroMagico, int i, int j){
        boolean ctrl = false;
        
        ctrl = cuadroMagico[i][j] != 0;
        
        if(ctrl){
//            System.out.println("CELDA LLENA");
        }else{
//            System.out.println("CELDA VACIA");
        }
        return ctrl;
    }
    
    public void imprimeMatriz(int [][] cuadroMagico){
        //IMPRIME MATRIZ FINAL
        for(int i = 0; i < cuadroMagico.length; i++){
            for(int j = 0; j < cuadroMagico[0].length; j++){
                System.out.print("\t"+cuadroMagico[i][j]);
                if(j == cuadroMagico[0].length-1){
                    System.out.println("");
                }
            }
        }
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    
    public int getNumeroUnoFila() {
        return numeroUnoFila;
    }

    public void setNumeroUnoFila(int numeroUnoFila) {
        this.numeroUnoFila = numeroUnoFila;
    }

    public int getNumeroUnoColumna() {
        return numeroUnoColumna;
    }

    public void setNumeroUnoColumna(int numeroUnoColumna) {
        this.numeroUnoColumna = numeroUnoColumna;
    }
    
}
