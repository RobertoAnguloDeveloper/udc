package Ej3;

import java.util.Map;
import java.util.TreeMap;

import EstructuraDatos.ArbolBinario;
import EstructuraDatos.Nodo;

public class Ej3 {
    public static void main(String[] args) {
        //ARBOL A
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
        
        
        //arbolA.imprimir();
        //ARBOL ORIGINAL
        System.out.println("ARBOL ORIGINAL");
        System.out.println("***************************");
        System.out.println(arbolA.getRaiz().getDato());
        System.out.println(arbolA.getRaiz().getIzquierdo().getDato()+" - "+arbolA.getRaiz().getDerecho().getDato());

        /*Nodo temp = arbolA.getRaiz().getIzquierdo();
        arbolA.getRaiz().setIzquierdo(arbolA.getRaiz().getDerecho());
        arbolA.getRaiz().setDerecho(temp);*/
        arbolA.intercambiarSubarbol(nodo1);
        //ARBOL INTERCAMBIADO
        System.out.println("ARBOL INTERCAMBIADO");
        System.out.println("***************************");
        System.out.println(arbolA.getRaiz().getDato());
        System.out.println(arbolA.getRaiz().getIzquierdo().getDato()+" - "+arbolA.getRaiz().getDerecho().getDato());
        //System.out.println(arbolA.getRaiz().getIzquierdo().getIzquierdo().getDato());
    }
}
