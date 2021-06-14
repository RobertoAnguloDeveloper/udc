/*
 Defina un programa para insertar, si es posible, un elemento antes de otro nodo dado 
como referencia en una lista ordenada.
 */
package Ej1;

import EstructurasDatos.Nodo;
import EstructurasDatos.Lista;
import javax.swing.JOptionPane;


public class Ej1 {

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        boolean loop = true;
        boolean loop2 = true;
        String valorReferencia = "";
        String valor = "";
        
        do{
            int op1 = JOptionPane.showOptionDialog(null, "QUE OPERACION DESEA REALIZAR?"
                    , "LISTAS",JOptionPane.YES_NO_CANCEL_OPTION 
                    , JOptionPane.QUESTION_MESSAGE, null
                    , new String[] { "Agregar", "Insertar"},"Agregar");
            switch(op1){
                case 0 -> {
                    do{
                        valor = JOptionPane.showInputDialog(null, "Ingrese valor del "
                                + "nodo a agregar", "VALOR DEL NODO"
                                , JOptionPane.INFORMATION_MESSAGE);
                        Nodo nodo = new Nodo(valor);
                        if(valor != null){
                            lista.agregar(nodo);
                        }else
                            System.exit(0);
                        
                        JOptionPane.showMessageDialog(null,lista.imprimir(), "LISTAS", JOptionPane.INFORMATION_MESSAGE);

                        int op2 = JOptionPane.showConfirmDialog(null, "Desea agregar otro nodo a la Lista?");
                        if(op2 == 0){
                            loop = true;
                        }else{
                            loop = false;
                        }
                    }while(loop);
                }
                
                case 1 -> {
                    do{
                        valor = JOptionPane.showInputDialog(null, "Ingrese valor del "
                                + "nodo a insertar", "VALOR DEL NODO"
                                , JOptionPane.INFORMATION_MESSAGE);
                        Nodo nodo = new Nodo(valor);
                        
                        try{
                            if(valor != null){
                                valorReferencia = JOptionPane.showInputDialog(null, "Ingrese el dato del nodo "
                                    + "donde desea insertar el nuevo nodo", "NODO REFERENCIA"
                                    , JOptionPane.INFORMATION_MESSAGE);
                                loop2 = false;
                                lista.insertar(nodo, valorReferencia);

                                JOptionPane.showMessageDialog(null, lista.imprimir(), "LISTA", JOptionPane.INFORMATION_MESSAGE);

                                int op = JOptionPane.showConfirmDialog(null, "Desea insertar otro nodo?");
                                if(op == 0){
                                    loop = true;
                                }else{
                                    loop = false;
                                    loop2 = true;
                                }
                            }else{
                                loop = false;
                            }
                        }catch(NumberFormatException err){
                            if(valorReferencia == null){
                                System.exit(0);
                            }else
                                loop2 = true;
                        }
                    }while(loop);
                }
                
                default -> System.exit(0);
            }
        }while(loop2);
    }
    
}
