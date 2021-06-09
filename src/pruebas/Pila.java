/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

public class Pila {
    private Nodo [] pila;
    private Nodo nodoTope;
    private int size;
    private int tope;
    
    public Pila(){
        nodoTope = null;
        size = 0;
    }
    
    public Pila(int size){
        pila = new Nodo[size];
    }
    
    public void apilar(Nodo nodo){
        if(size == 0){
            nodo.setAnterior(null);
            nodoTope = nodo;
        }else{
            nodo.setAnterior(nodoTope);
            nodoTope = nodo;
        }
        sizePlus();
    }

    public void desapilar(){
        if(!pilaVacia()){
            nodoTope = nodoTope.getAnterior();
            sizeMinus();
        }else{
            System.out.println("NO EXISTEN MAS NODOS EN LA PILA");
        }
    }
    
    public void vaciarPila(){
        while(!pilaVacia()){
            desapilar();
            System.out.println("DESAPILO");
        }
    }
    
    public void imprimir(){
        pila = new Nodo[size];
        
        for (int i = pila.length-1; i >= 0; i--) {
            pila[i] = nodoTope;
            desapilar();
        }
        
        int pos = 0;
        for (Nodo nodo : pila) {
            System.out.println("Nodo ["+pos+"] = "+nodo.getDato());
            pos++;
            apilar(nodo);
        }
        
    }
    
    public boolean pilaVacia(){
        return size == 0;
    }
    
    public Nodo[] getPila() {
        return pila;
    }

    public void setPila(Nodo[] pila) {
        this.pila = pila;
    }

    public Nodo getNodoTope() {
        return nodoTope;
        
    }

    public void setNodoTope(Nodo nodoTope) {
        this.nodoTope = nodoTope;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public void sizePlus(){
        size++;
        tope = size - 1;
    }

    public void sizeMinus(){
        size--;
        tope = size - 1;
    }
    
    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }
    
}
