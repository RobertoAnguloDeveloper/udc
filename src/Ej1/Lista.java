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
        Nodo [] seccionCorrer = Arrays.copyOfRange(nodo, indice, nodo.length-1);
        System.out.println(seccionCorrer.length);
        
        for(int i = indice, j = 0; i < nodo.length-1; i++, j++){
            nodo[i+1] = seccionCorrer[j];
        }
        
        return nodo;
    }
    
    public void insertar(int posicionInsertar
            , Nodo nodoInsertar){
        if(cabeza != null){
            if(posicionInsertar == 0){
                nodo = Arrays.copyOf(nodo, nodo.length+1);
                nodo = correDerecha(posicionInsertar, nodo);
                cabeza = nodoInsertar;
                nodo[0] = nodoInsertar;
                cola = nodo[nodo.length-1];
                nodo[0].setDespues(nodo[1]);
            }else if(posicionInsertar > nodo.length-1){
                try{
                    this.nodo[posicionInsertar] = nodoInsertar;
                }catch(ArrayIndexOutOfBoundsException ex){
                    if(posicionInsertar == this.nodo.length){
                        nodo = Arrays.copyOf(nodo, nodo.length+1);
                        nodo[posicionInsertar] = nodoInsertar;
                        cola = nodo[posicionInsertar];
                        nodoInsertar.setAntes(nodo[posicionInsertar-1]);
                    }else{
                        JOptionPane.showMessageDialog(null, 
                                "LA POSICION A INSERTAR ESTA DISTANTE DE LA "
                                        + "COLA DE LA LISTA", "ADVERTENCIA", 
                                        JOptionPane.ERROR_MESSAGE);
                    }
                }
            }else{
                nodo = Arrays.copyOf(nodo, nodo.length+1);
                nodo = correDerecha(posicionInsertar, nodo);
                nodo[posicionInsertar] = nodoInsertar;
                nodoInsertar.setAntes(nodo[posicionInsertar-1]);
                nodoInsertar.setDespues(nodo[posicionInsertar+1]);
                cola = nodo[nodo.length-1];
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