package Ej5;

import EstructuraDatos.ArbolBplus;
import EstructuraDatos.NodoBplus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;

public class Ej5 {
    public static void main(String[] args) {
        //ARBOL 
        ArbolBplus arbol = new ArbolBplus(5);
        arbol.insertarActualizar(1, 1);
        arbol.insertarActualizar(2, 1);
        arbol.insertarActualizar(3, 3);
        arbol.insertarActualizar(4, 4);
        arbol.insertarActualizar(5, 5);
        
        List<Entry<Integer,Object>> entradas = arbol.raiz.entradas;

        /*for (Entry<Integer,Object> entrada : entradas){
            System.out.println("CLAVE "+entrada.getKey()+" VALOR "+entrada.getValue());
        }*/

        arbol.imprimir();

    }
}
