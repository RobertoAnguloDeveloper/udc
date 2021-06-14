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
        
        ColaCircular c = new ColaCircular(6);
        
        c.encolarDerecha(nodoA);
        c.encolarDerecha(nodoB);
        c.encolarDerecha(nodoC);
        c.imprimir();
        
        c.desencolar();
        c.imprimir();
        
        c.encolar(nodoD);
        c.encolar(nodoE);
        c.imprimir();
        
        c.desencolarDerecha();
        c.imprimir();
        
    }
    
}
