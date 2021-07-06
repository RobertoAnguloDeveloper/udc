package Ej5;

import EstructuraDatos.ArbolBplus;

public class Ej5 {
    public static void main(String[] args) {
        ArbolBplus arbolB = new ArbolBplus(3);

        arbolB = arbolB.insertar(32);
        arbolB = arbolB.insertar(2);
        arbolB = arbolB.insertar(7);
        arbolB = arbolB.insertar(4);
        arbolB = arbolB.insertar(5);
        arbolB = arbolB.insertar(5);
        arbolB = arbolB.insertar(53);
        arbolB = arbolB.insertar(61);
        arbolB = arbolB.insertar(90);
        arbolB = arbolB.insertar(100);
        arbolB = arbolB.insertar(70);

        System.out.println("SIN ELIMINAR");
        System.out.println("************");
        arbolB.imprimir();
        arbolB = arbolB.eliminar(5);
        System.out.println("\n*******************");
        System.out.println("DESPUES DE ELIMINAR");
        System.out.println("*******************");
        arbolB.imprimir();
    }
}