/*
 Defina un programa para insertar, si es posible, un elemento antes de otro nodo dado 
como referencia en una lista ordenada.
 */
package Ej1;



/**
 *
 * @author hacke
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo nodo = new Nodo();
        
        Lista lista = new Lista(nodo);
        
        lista.insertar(1, nodo);
    }
    
}
