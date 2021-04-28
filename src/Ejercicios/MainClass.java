package Ejercicios;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int promedio = 0;
        int contadorHombres = 0,  contadorMujeres = 0, contadorMujeresIngenieria = 0;
        System.out.println("INGRESE NUMERO DE ESTUDIANTES: ");
        int n = keyboard.nextInt();
        Estudiantes[] estudiantes = new Estudiantes[n];
        
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiantes();
            System.out.println("Ingrese la edad del estudiantes [" + (i+1) + "]: ");
            int edad = keyboard.nextInt();
            int sexo, carrera;
            estudiantes[i].setEdad(edad);
            System.out.println("Ingrese [1]Masculino [2]Femenino para el sexo del estudiante [" + (i+1) + "]: ");
            sexo = keyboard.nextInt();
            estudiantes[i].setSexo(sexo);
            System.out.println("Ingrese [1]Ingenieria  o [2]Otra para la carrera del estudiante [" + (i+1) + "]: ");
            carrera = keyboard.nextInt();
            estudiantes[i].setCarrera(carrera);
        }
        
        
        for(int i = 0; i < estudiantes.length; i++){
            promedio = promedio+estudiantes[i].getEdad();
            if(estudiantes[i].getSexo().equals("Masculino")){
                contadorHombres++;
            }else if(estudiantes[i].getSexo().equals("Femenino")){
                if(estudiantes[i].getCarrera().equals("Ingenieria")){
                    contadorMujeresIngenieria++;
                }
                contadorMujeres++;
            }
        }
                       
        System.out.println("EDAD PROMEDIO = "+(promedio/n));
        System.out.println("PORCENTAJE HOMBRES = "+((contadorHombres*100)/n)+"%");
        System.out.println("PORCENTAJE MUJERES ESTUDIANTES INGENIERIA = "+((contadorMujeresIngenieria*100)/contadorMujeres)+"%");
    }
}
