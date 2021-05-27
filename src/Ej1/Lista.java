/*
 Defina un programa para insertar, si es posible, un elemento antes de otro nodo dado 
como referencia en una lista ordenada.
si la lista es de [2, 7, 9 10, 20, 22]  y si insertas el elemento 4 por ejemplo 
entre 7 y 9, la lista debe quedar [2, 4, 7, 9 10, 20, 22]
 */

package Ej1;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lista{
    private Nodo [] nodo;
    private Nodo cabeza;
    private Nodo cola;
    
    public Lista(){
        nodo = new Nodo[1];
        cabeza = new Nodo();
        cabeza = nodo[0];
        cola = new Nodo();
        cola = nodo[0];
    }
    
    public Nodo [] correDerecha(int indice, Nodo [] nodo){
        Nodo [] listaCopia = new Nodo[nodo.length];
        listaCopia = nodo;
        
        nodo = Arrays.copyOf(nodo, nodo.length+1);
        
        for(int i = indice; i < nodo.length-1; i++){
            Nodo temp = new Nodo();
            temp = listaCopia[i];
            nodo[i+1] =temp;
        }
        return nodo;
    }
    
    public void insertar(int posicionInsertar
            , Nodo nodoInsertar){
        if(cabeza != null){
            if(posicionInsertar == 0){
                this.nodo = correDerecha(posicionInsertar, this.nodo);
                cabeza = nodoInsertar;
                this.nodo[0] = nodoInsertar;
                cola = nodo[nodo.length-1];
                nodo[0].setDespues(nodo[1]);
            }else{
                try{
                    this.nodo[posicionInsertar] = nodoInsertar;
                }catch(ArrayIndexOutOfBoundsException ex){
                    Nodo [] listaTemp = Arrays.copyOf(nodo, nodo.length);
                    if(posicionInsertar == this.nodo.length){
                        this.nodo = correDerecha(posicionInsertar, listaTemp);
                        this.nodo[posicionInsertar] = nodoInsertar;
                        
                    }else{
                        JOptionPane.showMessageDialog(null, 
                                "LA POSICION A INSERTAR ESTA DISTANTE DE LA "
                                        + "COLA DE LA LISTA", "ADVERTENCIA", 
                                        JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }else{
            nodo = new Nodo[1];
            cabeza = nodoInsertar;
            cola = cabeza;
            nodo[0] = nodoInsertar;
        }
    }
    
    public String imprimeLista(){
        int nodoPos = 0, ultimaPos = nodo.length-1;
        String resultado = "";
        for (Nodo nodo1 : nodo) {
            if(nodoPos == ultimaPos){
                System.out.print("["+nodo1.getValor()+"]");
                resultado += "["+nodo1.getValor()+"]";
            }else{
                System.out.print("["+nodo1.getValor()+"] -\t");
                resultado += "["+nodo1.getValor()+"] -\t";
            }
            nodoPos++;
        }
        System.out.println("");
        
        return resultado;
    }
    
}