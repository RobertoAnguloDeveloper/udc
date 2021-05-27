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
        Nodo nodo1 = new Nodo();
        Nodo nodo2 = new Nodo();
        Nodo nodo3 = new Nodo();
        nodo1.setValor(30);
        nodo2.setValor("Salir");
        nodo3.setValor(-2);
        Lista lista = new Lista();
        
        lista.insertar(0, nodo1);
        lista.insertar(1, nodo2);
        lista.insertar(2, nodo3);
        lista.insertar(3, nodo3);
        lista.insertar(5, nodo1);
        lista.imprimeLista();
    }
    
}
