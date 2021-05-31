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
        String posicion = "";
        String valor = "";
        int pos = 0;
        
        do{
            int op1 = JOptionPane.showOptionDialog(null, "QUE OPERACION DESEA REALIZAR?"
                    , "LISTAS",JOptionPane.YES_NO_CANCEL_OPTION 
                    , JOptionPane.QUESTION_MESSAGE, null
                    , new String[] { "Agregar", "Insertar"},"Agregar");
            switch(op1){
                case 0 -> {
                    do{
                        Nodo nodo = new Nodo();
                        valor = JOptionPane.showInputDialog(null, "Ingrese valor del "
                                + "nodo a agregar", "VALOR DEL NODO"
                                , JOptionPane.INFORMATION_MESSAGE);
                        nodo.setValor(valor);
                        if(valor != null){
                            lista.agregar(nodo);
                        }else
                            System.exit(0);

                        JOptionPane.showMessageDialog(null,lista.imprimeLista(), "LISTAS", JOptionPane.INFORMATION_MESSAGE);

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
                        Nodo nodo = new Nodo();
                        valor = JOptionPane.showInputDialog(null, "Ingrese valor del "
                                + "nodo a insertar", "VALOR DEL NODO"
                                , JOptionPane.INFORMATION_MESSAGE);
                        nodo.setValor(valor);
                        
                        posicion = JOptionPane.showInputDialog(null, "Ingrese la posición "
                            + "donde desea insertar el nodo", "POSICION"
                            , JOptionPane.INFORMATION_MESSAGE);
                        
                        try{
                            pos = Integer.valueOf(posicion);

                            if(pos >= 0 && valor != null){
                                loop2 = false;
                                lista.insertar(pos, nodo);

                                JOptionPane.showMessageDialog(null, lista.imprimeLista(), "LISTA", JOptionPane.INFORMATION_MESSAGE);

                                int op = JOptionPane.showConfirmDialog(null, "Desea insertar otro nodo?");
                                if(op == 0){
                                    loop = true;
                                }else{
                                    loop = false;
                                    loop2 = true;
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "SOLO VALORES "
                                        + "POSITIVOS", "ERROR", JOptionPane.ERROR_MESSAGE);
                                loop2 = true;
                            }
                        }catch(NumberFormatException err){
                            if(posicion == null){
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
