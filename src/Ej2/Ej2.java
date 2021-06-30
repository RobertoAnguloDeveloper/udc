package Ej2;

import java.util.ArrayList;

import EstructuraDatos.ArbolBinario;
import EstructuraDatos.Nodo;

public class Ej2 {
    public static void main(String[] args) {
        
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
        ArbolBinario arbol = new ArbolBinario();

        arbol.agregarNodo(nodoNum1, null);
        arbol.agregarNodo(nodoNum2, nodoNum1);
        arbol.agregarNodo(nodoNum3, nodoNum1);
        arbol.agregarNodo(nodoNum4, nodoNum2);
        arbol.agregarNodo(nodoNum5, nodoNum2);
        arbol.agregarNodo(nodoNum6, nodoNum3);
        arbol.agregarNodo(nodoNum7, nodoNum3);
        arbol.agregarNodo(nodoNum8, nodoNum4);
        arbol.agregarNodo(nodoNum9, nodoNum5);
        arbol.agregarNodo(nodoNum10, nodoNum6);
        arbol.agregarNodo(nodoNum11, nodoNum10);
        arbol.agregarNodo(nodoNum12, nodoNum11);
        arbol.asignarNivel(nodoNum1, 0);
        arbol.asignarTipo(nodoNum1);

        System.out.println("CANTIDAD DE NODOS = "+arbol.getContadorNodos());
        System.out.println("*************************");
        System.out.println("VALOR MAYOR = "+arbol.valorMayor());
        System.out.println("*************************");
        System.out.println("VALOR PROMEDIO = "+arbol.promedio());
        System.out.println("*************************");

        ArrayList<Nodo> hojas = arbol.getHojas();
        ArrayList<Nodo> internos = arbol.getInternos();

        System.out.println();
        System.out.println("NODOS HOJA");
        System.out.println("*************************");
        for (int i = 0; i < hojas.size(); i++) {
            System.out.print(hojas.get(i).getDato()+" ");
        }
        System.out.println("\n*************************");

        System.out.println();
        System.out.println("NODOS INTERNOS");
        System.out.println("*************************");
        for (int i = 0; i < internos.size(); i++) {
            System.out.print(internos.get(i).getDato()+" ");
        }
        System.out.println("\n*************************");

    }
}
