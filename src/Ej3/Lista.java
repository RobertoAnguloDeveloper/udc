/*
Defina un programa para insertar elementos en una lista circular.
 */

package Ej3;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class Lista{
    private List<Nodo> lista;
    private Nodo cabeza;
    private Nodo cola;
    
    public Lista(){
        lista = new LinkedList<Nodo>();
        cabeza = new Nodo();
        cola = new Nodo();
        cola.setDespues(cabeza);
    }
    
    public void correrLista(int indice){
        List<Nodo> temp = lista.subList(indice, lista.size()-1);
        lista.addAll(indice+1, temp);        
    }
    
    public void llenarLista(){
        boolean loop = true;
        int i = 0;
        Nodo dato = new Nodo();
        String valor = "";
        do{
            valor = JOptionPane.showInputDialog(null, 
                    "INGRESE EL VALOR DEL NODO["+i+"]", "LLENADO DE LISTA ", 
                    JOptionPane.INFORMATION_MESSAGE);
            dato.setValor(valor);
            if(dato == null){
                loop = false;
                JOptionPane.showMessageDialog(null, "NO INGRESO DATOS EN EL NODO["+i+"]", 
                        "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            }else{
                lista.add(dato);
            }
            i++;
        }while(loop);
    }
    
    public void imprimeLista(){
        int nodoPos = 0, ultimaPos = lista.size()-1;
        String resultado = "";
        for (Nodo nodo1 : lista) {
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
    }

    public List<Nodo> getLista() {
        return lista;
    }

    public void setLista(List<Nodo> lista) {
        this.lista = lista;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getCola() {
        return cola;
    }

    public void setCola(Nodo cola) {
        this.cola = cola;
    }
    
    
    
}