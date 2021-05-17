
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
        
        int medioAdress = ((dimension+1)/2)-1;
        cuadroMagico[medioAdress][medioAdress] = numeroMedio;

//        System.out.println("El numero del medio es: "+numeroMedio
//                +"\nSu direccion es: ["+medioAdress+"]"+"["+medioAdress+"]");

        int [] numeros = new int[dimension*dimension];
        int [] pares = new int[numeros.length/2];
        int [] restantes = new int[numeros.length/2];
        int [] esquina = new int[4];
                
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i+1;
        }
        
        int contadorEsquina = 0, contadorRestantes = 0;
        for(int i = 0; i < numeros.length; i++){
            //LLENANDO ARREGLO DE ESQUINAS
            if(numeros[i] % 2 == 0){
                if(contadorEsquina < esquina.length){
                    esquina[contadorEsquina] = numeros[i];
                    contadorEsquina++;
                }
                //LLENANDO ARREGLO DE NUMEROS RESTANTES
            }else if(numeros[i] != numeroMedio){
                restantes[contadorRestantes] = numeros[i];
                contadorRestantes++;
            }
        }
        
        //INSERTANDO ESQUINAS
        for(int i = 0; i < cuadroMagico.length; i++){
            for(int j = 0; j < cuadroMagico[0].length; j++){
                if(i == 0 && j == 0){
                    cuadroMagico[i][j] = esquina[0];
                }else if(i == 0 && j == cuadroMagico.length-1){
                    cuadroMagico[i][j] = esquina[1];
                }else if(i == cuadroMagico.length-1 && j == 0){
                    cuadroMagico[i][j] = esquina[2];
                }else if(i == cuadroMagico.length-1 && j == cuadroMagico.length-1){
                    cuadroMagico[i][j] = esquina[3];
                }
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
