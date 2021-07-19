package JAVA.Pila;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalPila {
    public static void main(String[] args) {
        Pila pila = new Pila();
        Scanner key = new Scanner(System.in);
        
        int op = 0;
        do {
            System.out.println("******MENU CARRO*******");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Ordenar");
            System.out.println("4. Desordenar");
            System.out.println("5. Eliminar");
            System.out.println("6. Insertar");
            System.out.println("7. Recorrer coleccion de INICIO A FIN");
            System.out.println("8. Recorrer coleccion de FIN A INICIO");
            System.out.println("9. Imprimir colección");
            System.out.println("10. Salir");
            System.out.println("******MENU CARRO*******");

            try{
                System.out.print(">");
                op = key.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Opcion invalida");
                key = new Scanner(System.in);
            }
            
            switch (op) {
                case 1:
                    System.out.println("**********AGREGAR**********");
                    System.out.print("Ingrese el marca del carro: ");
                    String marca = key.next();
                    System.out.print("Ingrese el modelo del carro: ");
                    String modelo = key.next();
                    System.out.print("Ingrese el color del carro: ");
                    String color = key.next();
                    System.out.print("Ingrese la placa del carro: ");
                    String placa = key.next();
                    Carro nuevo = new Carro(marca, modelo, color, placa.toUpperCase());
                    pila.agregar(nuevo);
                    System.out.println("**********AGREGAR**********");
                    break;

                case 2:
                    System.out.println("**********BUSCAR**********");
                    System.out.print("Ingrese la placa del carro: ");
                    String busqueda = key.next();
                    int indice = pila.buscarPorPlaca(busqueda);
                    if (indice != -1){
                        System.out.println("El carro se encuentra en la posición ["+indice+"]");
                        pila.imprimir(indice);
                    }else{
                        System.out.println("El carro no se encuentra en la colección");
                    }
                    System.out.println("**********BUSCAR**********");
                    break;

                case 3:
                    System.out.println("**********ORDENAR**********");
                    pila.ordenar();
                    System.out.println("PILA ORDENADA POR PLACA");
                    System.out.println("**********ORDENAR**********");
                    break;
                
                case 4:
                    System.out.println("**********DESORDENAR**********");
                    pila.desordenar();
                    System.out.println("PILA DESORDENADA POR PLACA");
                    System.out.println("**********DESORDENAR**********");
                    break;
                
                case 5:
                    System.out.println("**********ELIMINAR**********");
                    System.out.print("Ingrese la placa del carro: ");
                    String eliminar = key.next();
                    pila.eliminar(eliminar.toUpperCase());
                    System.out.println("**********ELIMINAR**********");
                    break;

                case 6:
                    System.out.println("**********INSERTAR**********");
                    System.out.print("Ingrese el marca del carro: ");
                    String marcaIn = key.next();
                    System.out.print("Ingrese el modelo del carro: ");
                    String modeloIn = key.next();
                    System.out.print("Ingrese el color del carro: ");
                    String colorIn = key.next();
                    System.out.print("Ingrese la placa del carro: ");
                    String placaIn = key.next();
                    Carro nuevoIn = new Carro(marcaIn, modeloIn, colorIn, placaIn.toUpperCase());
                    System.out.print("Ingrese la posición donde desea insertar el Carro: ");
                    int pos = key.nextInt();
                    pila.insertar(pos, nuevoIn);
                    System.out.println("**********INSERTAR**********");
                    break;

                case 7:
                    System.out.println("**********RECORRER DE INICIO A FIN**********");
                    pila.recorrerInicioFin();
                    System.out.println("**********RECORRER DE INICIO A FIN**********");
                    break;

                case 8:
                    System.out.println("**********RECORRER DE FIN A INICIO**********");
                    pila.recorrerFinInicio();
                    System.out.println("**********RECORRER DE FIN A INICIO**********");
                    break;

                case 9:
                    System.out.println("**********IMPRIMIR**********");
                    pila.imprimir();
                    System.out.println("**********IMPRIMIR**********");
                    break;
                default:
                    break;
            }
        } while (op != 10);
    }
}