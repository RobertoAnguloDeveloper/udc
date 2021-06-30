package Ej3;

import EstructuraDatos.ArbolBinario;
import EstructuraDatos.Nodo;

public class Ej3 {
    public static void main(String[] args) {
        // ARBOL A
        Nodo nodo1 = new Nodo('A');
        Nodo nodo2 = new Nodo('B');
        Nodo nodo3 = new Nodo('C');
        Nodo nodo4 = new Nodo('D');
        Nodo nodo5 = new Nodo('E');
        Nodo nodo6 = new Nodo('F');
        Nodo nodo7 = new Nodo('G');
        Nodo nodo8 = new Nodo('H');

        ArbolBinario arbolA = new ArbolBinario();

        arbolA.agregarNodo(nodo1, null);
        arbolA.agregarNodo(nodo2, nodo1);
        arbolA.agregarNodo(nodo3, nodo1);
        arbolA.agregarNodo(nodo4, nodo2);
        arbolA.agregarNodo(nodo5, nodo2);
        arbolA.agregarNodo(nodo6, nodo3);
        arbolA.agregarNodo(nodo7, nodo5);
        arbolA.agregarNodo(nodo8, nodo5);
        arbolA.asignarNivel(nodo1, 0);
        arbolA.asignarTipo(nodo1);
        arbolA.arbolToArray(nodo1, 0);

        // ARBOL ORIGINAL
        System.out.println("ARBOL ORIGINAL");
        System.out.println("***************************");
        //arbolA.nodosNivelToArray();
        arbolA.imprimir();
        arbolA.intercambiarSubarbol(nodo1);
        //arbolA.arbolToArray(arbolA.getRaiz());
        
        //System.out.println("------CAMBIADO------"+arbolA.getRaiz().getIzquierdo().getDato());

        // ARBOL INTERCAMBIADO
        System.out.println();
        System.out.println("ARBOL INTERCAMBIADO");
        System.out.println("***************************");
        
        //arbolA.imprimir();
    }
}