/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.util.Scanner;

/**
 *
 * @author TECNOLOGIA GC
 */
public class Ej2 {

    public static void main(String[] args) {
        
        Scanner key = new Scanner(System.in);
        System.out.println("CUANTAS TEMPERATURAS DESEA INGRESAR?");
        int n = key.nextInt();
        double [] temperaturas = new double[n];
        
        //LLENANDO EL ARREGLO
        for(int i = 0; i < temperaturas.length; i++){
            System.out.print("TEMPERATURA ["+(i+1)+"]: ");
            temperaturas[i] = key.nextDouble();
        }
        
        //SUMANDO TEMPERATURAS
        double promedio = 0;
        for(int i = 0; i < temperaturas.length; i++){
            promedio += temperaturas[i];
        }
        promedio /= n;
        System.out.println("\nPROMEDIO "+promedio);
        
        int mayorIgualromedio = 0;
        //VERIFICANDO QUE DATOS SON MAYORES O IGUALES AL PROMEDIO
        for(int i = 0; i < temperaturas.length; i++){
            if(temperaturas[i] >= promedio){
                mayorIgualromedio++;
            }
        }
        
        System.out.print(mayorIgualromedio+" TEMPERATURAS SON MAYORES O IGUALES AL PROMEDIO");
    }
    
}
