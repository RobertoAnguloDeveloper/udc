package Ej1;

import EstructuraDatos.ArbolBinario;
import EstructuraDatos.Nodo;

public class Ej1 {
    public static void main(String[] args) {
        Nodo nodo1 = new Nodo(5);
        Nodo nodo2 = new Nodo(6);
        Nodo nodo3 = new Nodo(7);
        Nodo nodo4 = new Nodo(8);
        ArbolBinario arbol = new ArbolBinario();

        arbol.agregarNodo(nodo1, null);
        arbol.agregarNodo(nodo2, nodo1);
        arbol.agregarNodo(nodo3, nodo2);
        arbol.agregarNodo(nodo4, nodo2);

        System.out.println("RAIZ");
        System.out.println(arbol.getRaiz().getDato());
        System.out.println("Nivel 1");
        System.out.println(arbol.getRaiz().getIzquierdo().getDato() + "<->NULL");
        System.out.println("Nivel 2");
        System.out.println(arbol.getRaiz().getIzquierdo().getIzquierdo().getDato() + "<->"
                + arbol.getRaiz().getIzquierdo().getDerecho().getDato());
        // arbol.imprimir();
    }
}
