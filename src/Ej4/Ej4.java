/*
Realice dos métodos “Mete_Pila” y “Saca_ Pila” para insertar y eliminar, 
respectivamente, un elemento de una pila implementada por medio de una lista.
 */
package Ej4;

import EstructurasDatos.Lista;
import EstructurasDatos.Nodo;
import EstructurasDatos.Pila;
import javax.swing.JOptionPane;

public class Ej4 {

    public static void main(String[] args) {
        Pila pila = new Pila();
        
        boolean loop = true;
        String valor = "";
        
        do{
            Nodo nodo = new Nodo();
            valor = JOptionPane.showInputDialog(null, "Ingrese valor del "
                    + "nodo a insertar", "VALOR DEL NODO"
                    , JOptionPane.INFORMATION_MESSAGE);
            nodo.setValor(valor);
            if(valor != null){
                pila.metePila(nodo);
            }else
                System.exit(0);
            
            JOptionPane.showMessageDialog(null,pila.imprimePila(), "PILA", JOptionPane.INFORMATION_MESSAGE);
            
            int op = JOptionPane.showConfirmDialog(null, "Desea agregar otro nodo a la Pila?");
            if(op == 0){
                loop = true;
            }else{
                loop = false;
            }
        }while(loop);
    }
    
}
