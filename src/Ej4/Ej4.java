package Ej4;

import EstructuraDatos.ArbolB;
import EstructuraDatos.Nodo;

public class Ej4 {
    public static void main(String[] args) {
        Nodo nodo1 = new Nodo(1);
        ArbolB arbolB = new ArbolB(5);

        arbolB.insertar(nodo1);

        System.out.println("PAGINARAIZ[0] = "+arbolB.getPaginaRaiz()[0].getDato());
    }
}
