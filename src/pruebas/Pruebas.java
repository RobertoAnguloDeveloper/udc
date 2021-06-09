/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author ROBERTO ANGULO
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo nodo1 = new Nodo("Primero");
        Nodo nodo2 = new Nodo("Segundo");
        Nodo nodo3 = new Nodo("Tercero");
        Nodo nodo4 = new Nodo("Cuarto");
        Nodo nodo5 = new Nodo("Quinto");
        Pila pila = new Pila();
        pila.apilar(nodo1);
        pila.apilar(nodo2);
        pila.apilar(nodo3);
        pila.apilar(nodo4);
        pila.apilar(nodo5);
        
        System.out.println("TOPE = "+pila.getNodoTope().getDato());
    }
    
}
