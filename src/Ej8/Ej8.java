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

import EstructurasDatos.Cola;
import EstructurasDatos.Nodo;

public class Ej8 {

    public static void main(String[] args) {
        Cola c = new Cola();
        
        Nodo nodoA = new Nodo();
        nodoA.setValor("A");
        Nodo nodoB = new Nodo();
        nodoB.setValor("B");
        Nodo nodoC = new Nodo();
        nodoC.setValor("C");
        Nodo nodoD = new Nodo();
        nodoD.setValor("D");
        Nodo nodoE = new Nodo();
        nodoE.setValor("E");
        
        c.encolarDerecha(nodoA);
        c.encolarDerecha(nodoB);
        c.encolarDerecha(nodoC);
        c.imprimeCola();
        
        
        c.desencolar();
        c.imprimeCola();

        c.encolar(nodoD);
        c.encolar(nodoE);
        c.imprimeCola();
        
        c.desencolarDerecha();
        c.imprimeCola();
    }
    
}
