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
        Nodo nodo2 = new Nodo();
        nodo.setValor(30);
        nodo2.setValor("Salir");
        Lista lista = new Lista();
        
        lista.insertar(0, nodo);
        lista.insertar(0, nodo2);
        
        lista.imprimeLista();
    }
    
}
