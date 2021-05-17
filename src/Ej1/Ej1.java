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
        
        //LLENANDO EL CUADRO MAGICO SEGUNDO NUMERO
        for(int i = 0; i < cuadroMagico.length; i++){
            for(int j = 0; j < cuadroMagico[0].length; j++){
                if(i == cuadro.getNumeroUnoFila() && j == cuadro.getNumeroUnoColumna()){
                    ++indiceNumeros;
                    posicionGuiaFila = cuadroMagico[i].length-1;
                    posicionGuiaColumna = j+1;
                    cuadroMagico[posicionGuiaFila][posicionGuiaColumna] = numeros[indiceNumeros];
                    indiceNumeros++;
                    posicionGuiaFila--;
                    posicionGuiaColumna++;
                }
            }
        }
        
        //LLENANDO EL RESTO
        for(int i = 0; i < (dimension*dimension); i++){
            if(cuadro.celdaExiste(cuadroMagico, posicionGuiaFila, posicionGuiaColumna) 
                    && !cuadro.isCeldaLlena(cuadroMagico, posicionGuiaFila, posicionGuiaColumna)){
                
                cuadroMagico[posicionGuiaFila][posicionGuiaColumna] = numeros[indiceNumeros];
                
                indiceNumeros++;
                posicionGuiaFila--;
                posicionGuiaColumna++;
            }
            
            if(cuadro.noFila(cuadroMagico, posicionGuiaFila)){
                posicionGuiaFila = cuadroMagico.length-1;
            }else if(cuadro.noColumna(cuadroMagico, posicionGuiaColumna)){
                posicionGuiaColumna = 0;
            }else if(cuadro.isCeldaLlena(cuadroMagico, posicionGuiaFila, posicionGuiaColumna)){
                posicionGuiaFila += 2;
                posicionGuiaColumna--;
            }
            
            if(cuadro.noFila(cuadroMagico, posicionGuiaFila) 
                    && cuadro.noColumna(cuadroMagico, posicionGuiaColumna)){
                posicionGuiaFila = 1;
                posicionGuiaColumna = cuadroMagico[0].length-1;
            }
        }
        
        cuadro.imprimeMatriz(cuadroMagico);     
    }
    
}
