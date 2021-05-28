/*
 Defina un programa para insertar, si es posible, un elemento antes de otro nodo dado 
como referencia en una lista ordenada.
 */
package Ej1;

import javax.swing.JOptionPane;


public class Ej1 {

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        boolean loop1 = true;
        boolean loop2 = true;
        String posicion = "";
        String valor = "";
        int pos = 0;
        
        do{
            valor = JOptionPane.showInputDialog(null, "Ingrese valor del "
                    + "nodo a insertar", "VALOR DEL NODO"
                    , JOptionPane.INFORMATION_MESSAGE);
            if(valor != null){
                do{
                    posicion = JOptionPane.showInputDialog(null, "Ingrese la posición "
                            + "donde desea insertar el nodo", "POSICION"
                            , JOptionPane.INFORMATION_MESSAGE);
                    try{
                        pos = Integer.valueOf(posicion);

                        if(pos >= 0){
                            loop2 = false;
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
                }while(loop2);
            }else
                System.exit(0);
            
            Nodo nodo = new Nodo();
            nodo.setValor(valor);
            lista.insertar(pos, nodo);
            
            JOptionPane.showMessageDialog(null, lista.imprimeLista(), "LISTA", JOptionPane.INFORMATION_MESSAGE);
            
            int op = JOptionPane.showConfirmDialog(null, "Desea agregar otro nodo?");
            if(op == 0){
                loop1 = true;
            }else{
                loop1 = false;
            }
        }while(loop1);
    }
    
}
