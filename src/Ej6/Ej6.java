/*
Realice un método que elimine los elementos repetidos de una estructura 
tipo cola implementada por medio de listas.
 */
package Ej6;

import EstructurasDatos.Cola;
import EstructurasDatos.Nodo;
import javax.swing.JOptionPane;

public class Ej6 {

    public static void main(String[] args) {
        Cola cola = new Cola();
        
        boolean loop = true;
        boolean loop2 = true;
        String valor = "";
        
        do{
            int op1 = JOptionPane.showOptionDialog(null, "QUE OPERACION DESEA REALIZAR?"
                    , "COLAS",JOptionPane.YES_NO_CANCEL_OPTION 
                    , JOptionPane.QUESTION_MESSAGE, null
                    , new String[] { "Encolar", "Eliminar repetidos"},"Encolar");
            switch(op1){
                case 0 -> {
                    do{
                        valor = JOptionPane.showInputDialog(null, "Ingrese valor del "
                                + "nodo a insertar", "VALOR DEL NODO"
                                , JOptionPane.INFORMATION_MESSAGE);
                        if(valor != null){
                            Nodo nodo = new Nodo(valor);
                            cola.encolar(nodo);
                        }else
                            System.exit(0);

                        JOptionPane.showMessageDialog(null,cola.imprimir(), "COLA", JOptionPane.INFORMATION_MESSAGE);

                        int op2 = JOptionPane.showConfirmDialog(null, "Desea agregar otro nodo a la Cola?");
                        if(op2 == 0){
                            loop = true;
                        }else{
                            loop = false;
                        }
                    }while(loop);
                }
                
                case 1 -> {
                    do{
                        if(cola.getCabeza() != null){
                            cola.eliminaRepetidos();
                            JOptionPane.showMessageDialog(null,cola.imprimir(), "COLA", JOptionPane.INFORMATION_MESSAGE);
                            
                        }else{
                            JOptionPane.showMessageDialog(null, "LO SIENTO, NO HAY NODOS EN LA COLA", "ERROR", JOptionPane.ERROR_MESSAGE);
                            loop = false;
                        }
                    }while(loop);
                }
                    
                default -> System.exit(0);
            }
        }while(loop2);
    }
}
