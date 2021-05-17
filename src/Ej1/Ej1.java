package Ej1;


import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int dimension = 0;
        
        do{
            System.out.print("DIGITE DIMENSION DE LA MATRIZ: ");
            dimension = key.nextInt();
            
            if(dimension%2 == 0 || dimension == 1 || dimension < 0 || dimension > 11){
                System.out.println("INGRESE UN NUMERO ENTRE 3 Y 11");
            }
        }while(dimension%2 == 0 || dimension == 1 || dimension < 0 || dimension > 11);
        
        int [][] cuadroMagico = new int[dimension][dimension];

        int [] numeros = new int[dimension*dimension];
        
        CuadradoMagico cuadro = new CuadradoMagico();
        
        cuadro.numeros(numeros);
        cuadro.llenadoInicial(cuadroMagico);
        
        int indiceNumeros = 0, posicionGuiaFila = 0, posicionGuiaColumna = 0;
        
        for(int i = 0; i < cuadroMagico.length; i++){
            for(int j = 0; j < cuadroMagico[0].length; j++){
                if(i == cuadro.getNumeroUnoFila() && j == cuadro.getNumeroUnoColumna()){
                    posicionGuiaFila = cuadroMagico[i].length-1;
                    posicionGuiaColumna = j+1;
                    cuadroMagico[posicionGuiaFila][posicionGuiaColumna] = numeros[indiceNumeros+1];
                }else{
                    
                }
            }
        }
        
        cuadro.imprimeMatriz(cuadroMagico);
        
//        System.out.println("VERIFIQUE FILA: ");
//        int verF = key.nextInt();
//        cuadro.noFila(cuadroMagico, verF);
//        
//        System.out.println("VERIFIQUE COLUMNA: ");
//        int verC = key.nextInt();
//        cuadro.noColumna(cuadroMagico, verC);
//        
//        System.out.println("VERIFIQUE CELDA LLENA: ");
//        int verCeldaX = key.nextInt();
//        int verCeldaY = key.nextInt();
//        cuadro.isCeldaLlena(cuadroMagico, verCeldaX, verCeldaY);
//        
    }
    
}
