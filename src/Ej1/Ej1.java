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
        cuadro.imprimeMatriz(cuadroMagico);
        
        System.out.println("VERIFIQUE FILA: ");
        int verF = key.nextInt();
        cuadro.noFila(cuadroMagico, verF);
        
        System.out.println("VERIFIQUE COLUMNA: ");
        int verC = key.nextInt();
        cuadro.noColumna(cuadroMagico, verC);
        
        System.out.println("VERIFIQUE CELDA LLENA: ");
        int verCeldaX = key.nextInt();
        int verCeldaY = key.nextInt();
        cuadro.isCeldaLlena(cuadroMagico, verCeldaX, verCeldaY);
        
    }
    
}
