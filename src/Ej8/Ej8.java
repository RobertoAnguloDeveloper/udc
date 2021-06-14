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
        Cola c = new Cola(6);
        
        c.getCola()[0].setDato('A');
        c.setCabeza(c.getCola()[0]);
        c.getCola()[1].setDato('B');
        c.getCola()[2].setDato('C');
        c.getCola()[0].setDato(null);
        c.setCabeza(c.getCola()[0]);
        c.getCola()[0].setDato('E');
        c.setCabeza(c.getCola()[0]);
        c.getCola()[1].setDato('D');
        c.getCola()[2].setDato('B');
        c.getCola()[3].setDato('C');
        c.getCola()[5].setDato(null);
        
        c.imprimir();
    }
    
}
