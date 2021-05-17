
import java.util.Arrays;
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
        
        //LLENANDO ARREGLO DE NUMEROS POSIBLES 
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i+1;
        }
        
        //LLENANDO MATRIZ CON CEROS, IDENTIFICANDO ASI POSICION VACIA
        boolean ctrl = false;
        for(int i = 0; i < cuadroMagico.length; i++){
            for(int j = 0; j < cuadroMagico[0].length; j++){
                if(j == (cuadroMagico.length-1)/2 && !ctrl){
                    cuadroMagico[i][j] = 1;
                    ctrl = true;
                }else{
                    cuadroMagico[i][j] = 0;
                }
            }
        }
        
        //LLENANDO TODA LA MATRIZ
        for(int i = 0; i < cuadroMagico.length; i++){
            for(int j = 0; j < cuadroMagico[0].length; j++){
            }
        }
        
        
        //IMPRIME MATRIZ FINAL
        for(int i = 0; i < cuadroMagico.length; i++){
            for(int j = 0; j < cuadroMagico[0].length; j++){
                System.out.print("\t"+cuadroMagico[i][j]);
                if(j == cuadroMagico[0].length-1){
                    System.out.println("");
                }
            }
        }
        
//        for (int numero : numeros) {
//            System.out.print("\t"+numero);
//        }
//        System.out.println("");

        
    }
    
}
