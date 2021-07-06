package Ej5;

import EstructuraDatos.ArbolBplus;
import EstructuraDatos.NodoBplus;

public class Ej5 {
    public static void main(String[] args) {
        NodoBplus nodo1 = new NodoBplus(true);
        NodoBplus nodo2 = new NodoBplus(true);
        NodoBplus nodo3 = new NodoBplus(true);
        NodoBplus nodo4 = new NodoBplus(true);
        NodoBplus nodo5 = new NodoBplus(true);
        NodoBplus nodo6 = new NodoBplus(true);

        ArbolBplus arbolB = new ArbolBplus(3);

        System.out.println("SIN ELIMINAR");
        System.out.println("************");
        arbolB.imprimir();
        arbolB = arbolB.eliminar(53);
        System.out.println("\n*******************");
        System.out.println("DESPUES DE ELIMINAR");
        System.out.println("*******************");
        arbolB.imprimir();
    }
    
}
