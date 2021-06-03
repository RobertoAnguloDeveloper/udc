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
        
        for (int i = 0; i < 6; i++) {
            c.insertarDerecha(new Nodo());
        }
        
        Nodo frente = new Nodo();
        Nodo ultimo = new Nodo();
        frente = c.getCola()[0];
        ultimo = c.getCola()[0];
        c.setCabeza(frente);
        c.setTope(ultimo);
        
        c.getCola()[0].setValor('A');
        c.setCabeza(c.getCola()[0]);
        c.getCola()[1].setValor('B');
        c.getCola()[2].setValor('C');
        c.setTope(c.getCola()[2]);
        c.getCola()[0].setValor(null);
        c.getCola()[0].setValor('E');
        c.getCola()[1].setValor('D');
        c.getCola()[2].setValor('B');
        c.getCola()[3].setValor('C');
        c.getCola()[5].setValor(null);
        
        c.imprimeCola();
    }
    
}
