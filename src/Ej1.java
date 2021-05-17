
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
        int numeroMedio = (dimension*dimension+1)/2;
        
        int medioAdress = (dimension+1)/2;
        cuadroMagico[medioAdress][medioAdress] = numeroMedio;

//        System.out.println("El numero del medio es: "+numeroMedio
//                +"\nSu direccion es: ["+medioAdress+"]"+"["+medioAdress+"]");

        int [] numeros = new int[dimension*dimension];

        for(int i = 0; i<numeros.length; i++){
            numeros[i] = i+1;
        }
    }
    
}
