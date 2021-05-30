/*
Realice dos métodos “Mete_Pila” y “Saca_ Pila” para insertar y eliminar, 
respectivamente, un elemento de una pila implementada por medio de una lista.
 */
package Ej4;

import EstructurasDatos.Nodo;
import EstructurasDatos.Pila;
import javax.swing.JOptionPane;

public class Ej4 {

    public static void main(String[] args) {
        Pila pila = new Pila();
        
        boolean loop = true;
        boolean loop2 = true;
        String valor = "";
        
        do{
            int op1 = JOptionPane.showOptionDialog(null, "QUE OPERACION DESEA REALIZAR?"
                    , "PILA",JOptionPane.YES_NO_CANCEL_OPTION 
                    , JOptionPane.QUESTION_MESSAGE, null
                    , new String[] { "Meter en la Pila", "Sacar de la Pila"},"Meter en la Pila" );
            switch(op1){
                case 0:
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

                        int op2 = JOptionPane.showConfirmDialog(null, "Desea agregar otro nodo a la Pila?");
                        if(op2 == 0){
                            loop = true;
                        }else{
                            loop = false;
                        }
                    }while(loop);
                    break;
                
                case 1:
                    do{
                        if(pila.getPila().length > 0){
                            pila.sacaPila();

                            JOptionPane.showMessageDialog(null,pila.imprimePila(), "PILA", JOptionPane.INFORMATION_MESSAGE);

                            int op2 = JOptionPane.showConfirmDialog(null, "Desea sacar otro nodo de la Pila?");
                            if(op2 == 0){
                                loop = true;
                            }else{
                                loop = false;
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "LO SIENTO YA NO HAY MAS NODOS EN LA PILA", "ERROR", JOptionPane.ERROR_MESSAGE);
                            loop = false;
                            pila = new Pila();
                        }
                    }while(loop);
                    break;
                    
                default:
                    System.exit(0);
                    break;
            }
        }while(loop2);
    }
    
}
