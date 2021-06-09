/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

public class Nodo {
    private Object dato;
    private Nodo anterior;
    private Nodo siguiente;

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo(Object dato) {
        this.dato = dato;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    public Object getDato() {
        try{
            return dato;
        }catch(NullPointerException err){
           return "null"; 
        }
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
    
    
}
