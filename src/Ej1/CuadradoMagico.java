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
    private int filaNoExiste, columnaNoExiste;
    
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
        try{
            int celda = cuadroMagico[i][0];
            return false;
        }catch(ArrayIndexOutOfBoundsException err){
            return true;
        }
    }
    
    public boolean noColumna(int [][] cuadroMagico, int j){
        try{
            int celda = cuadroMagico[0][j];
            return false;
        }catch(ArrayIndexOutOfBoundsException err){
            return true;
        }
    }
    
    public boolean isCeldaLlena(int [][] cuadroMagico, int i, int j){
        return cuadroMagico[i][j] != 0;
    }
    
    public boolean celdaExiste(int [][] cuadroMagico, int i, int j){
        try{
            int celda = cuadroMagico[i][j];
            return true;
        }catch(ArrayIndexOutOfBoundsException err){
            return false;
        }
        
    }
    
    public int [] celdaVacia(int [][] cuadroMagico){
        //IMPRIME MATRIZ FINAL
        int [] coordenadasCeldaVacia = new int[2];
        for(int i = 0; i < cuadroMagico.length; i++){
            for(int j = 0; j < cuadroMagico[0].length; j++){
                if(cuadroMagico[i][j] == 0){
                    coordenadasCeldaVacia[0] = i;
                    coordenadasCeldaVacia[1] = j;
                    return coordenadasCeldaVacia;
                }
            }
        }
        
        if(coordenadasCeldaVacia[0] == 0 || coordenadasCeldaVacia[1] == 0){
            coordenadasCeldaVacia[0] = -1;
            coordenadasCeldaVacia[1] = -1;
        }
        return coordenadasCeldaVacia;
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
