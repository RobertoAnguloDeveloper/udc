/*
Sea C una doble cola circular de 6 elementos. Inicialmente 
la doble cola está vacía (FRENTE = FINAL =0). 
Dibuje el estado de la cola después de realizar 
cada una de las siguientes operaciones:
**Insertar por el extremo derecho tres elementos: A, B y C.
**Eliminar por el extremo izquierdo un elemento.
**Insertar por el extremo izquierdo dos elementos: D y E.
**Eliminar por la derecha un elemento.
 */
package Ej8;

import EstructurasDatos.ColaCircular;
import EstructurasDatos.Nodo;

public class Ej8 {

    public static void main(String[] args) {
        Nodo nodoA = new Nodo("A");
        Nodo nodoB = new Nodo("B");
        Nodo nodoC = new Nodo("C");
        Nodo nodoD = new Nodo("D");
        Nodo nodoE = new Nodo("E");
        Nodo nodoNull = new Nodo(null);
        Nodo nodoNull2 = new Nodo(null);
        Nodo nodoNull3 = new Nodo(null);
        Nodo nodoNull4 = new Nodo(null);
        Nodo nodoNull5 = new Nodo(null);
        ColaCircular c = new ColaCircular(6);
        
        c.encolarDerecha(nodoA);
        c.encolarDerecha(nodoB);
        c.encolarDerecha(nodoC);
        c.encolarDerecha(nodoNull);
        c.encolarDerecha(nodoNull2);
        c.encolarDerecha(nodoNull3);
        System.out.println("1. Insertar por el extremo derecho tres elementos: A, B y C.");
        c.imprimir();
        
        c.desencolar();
        c.encolar(nodoNull4);
        System.out.println("\n2. Eliminar por el extremo izquierdo un elemento.");
        c.imprimir();
        
        c.desencolar();
        c.encolar(nodoD);
        c.encolar(nodoE);
        c.desencolarDerecha();
        System.out.println("\n3. Insertar por el extremo izquierdo dos elementos: D y E.");
        c.imprimir();
        
        c.desencolarDerecha();
        c.encolarDerecha(nodoNull5);
        System.out.println("\n4. Eliminar por la derecha un elemento.");
        c.imprimir();
        
    }
    
}
