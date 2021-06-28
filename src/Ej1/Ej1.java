package Ej1;

import EstructuraDatos.ArbolBinario;
import EstructuraDatos.Nodo;

public class Ej1 {
    public static void main(String[] args) {
        //ARBOL A
        Nodo nodo1 = new Nodo('K');
        Nodo nodo2 = new Nodo('B');
        Nodo nodo3 = new Nodo('W');
        Nodo nodo4 = new Nodo('A');
        Nodo nodo5 = new Nodo('F');
        Nodo nodo6 = new Nodo('M');
        Nodo nodo7 = new Nodo('Z');
        Nodo nodo8 = new Nodo('D');
        Nodo nodo9 = new Nodo('L');
        Nodo nodo10 = new Nodo('O');
        Nodo nodo11 = new Nodo('P');
        ArbolBinario arbolA = new ArbolBinario();

        arbolA.agregarNodo(nodo1, null);
        arbolA.agregarNodo(nodo2, nodo1);
        arbolA.agregarNodo(nodo3, nodo1);
        arbolA.agregarNodo(nodo4, nodo2);
        arbolA.agregarNodo(nodo5, nodo2);
        arbolA.agregarNodo(nodo6, nodo3);
        arbolA.agregarNodo(nodo7, nodo3);
        arbolA.agregarNodo(nodo8, nodo5);
        arbolA.agregarNodo(nodo9, nodo6);
        arbolA.agregarNodo(nodo10, nodo6);
        arbolA.agregarNodo(nodo11, nodo10);

        System.out.println("ARBOL A");
        System.out.println("***************************");
        System.out.println("PREORDEN");
        System.out.println("*********");
        arbolA.preOrden(nodo1);

        System.out.println("\n\nINORDEN");
        System.out.println("*********");
        arbolA.inOrden(nodo1);

        System.out.println("\n\nPOSTORDEN");
        System.out.println("*********");
        arbolA.postOrden(nodo1);

        //ARBOL B
        Nodo nodoNum1 = new Nodo(25);
        Nodo nodoNum2 = new Nodo(20);
        Nodo nodoNum3 = new Nodo(90);
        Nodo nodoNum4 = new Nodo(10);
        Nodo nodoNum5 = new Nodo(23);
        Nodo nodoNum6 = new Nodo(80);
        Nodo nodoNum7 = new Nodo(100);
        Nodo nodoNum8 = new Nodo(8);
        Nodo nodoNum9 = new Nodo(21);
        Nodo nodoNum10 = new Nodo(62);
        Nodo nodoNum11 = new Nodo(47);
        Nodo nodoNum12 = new Nodo(32);
        ArbolBinario arbolB = new ArbolBinario();

        arbolB.agregarNodo(nodoNum1, null);
        arbolB.agregarNodo(nodoNum2, nodoNum1);
        arbolB.agregarNodo(nodoNum3, nodoNum1);
        arbolB.agregarNodo(nodoNum4, nodoNum2);
        arbolB.agregarNodo(nodoNum5, nodoNum2);
        arbolB.agregarNodo(nodoNum6, nodoNum3);
        arbolB.agregarNodo(nodoNum7, nodoNum3);
        arbolB.agregarNodo(nodoNum8, nodoNum4);
        arbolB.agregarNodo(nodoNum9, nodoNum5);
        arbolB.agregarNodo(nodoNum10, nodoNum6);
        arbolB.agregarNodo(nodoNum11, nodoNum10);
        arbolB.agregarNodo(nodoNum12, nodoNum11);

        System.out.println("\n\nARBOL B");
        System.out.println("*************************************");
        System.out.println("PREORDEN");
        System.out.println("*********");
        arbolB.preOrden(nodoNum1);

        System.out.println("\n\nINORDEN");
        System.out.println("*********");
        arbolB.inOrden(nodoNum1);

        System.out.println("\n\nPOSTORDEN");
        System.out.println("*********");
        arbolB.postOrden(nodoNum1);
    }
}