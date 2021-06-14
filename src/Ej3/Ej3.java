/*
Defina un programa para insertar elementos en una lista circular.
 */
package Ej3;

import EstructurasDatos.ListaCircular;
import EstructurasDatos.Nodo;
import javax.swing.JOptionPane;


public class Ej3 {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        boolean loop = true;
        String valor = "";
        
        do{
            valor = JOptionPane.showInputDialog(null, "Ingrese valor del "
                    + "nodo a insertar", "VALOR DEL NODO"
                    , JOptionPane.INFORMATION_MESSAGE);
            if(valor != null){
                Nodo nodo = new Nodo(valor);
                lista.insertar(nodo);
            }else
                System.exit(0);
            
            JOptionPane.showMessageDialog(null, lista.imprimir(), "LISTA", JOptionPane.INFORMATION_MESSAGE);
            
            int op = JOptionPane.showConfirmDialog(null, "Desea agregar otro nodo?");
            if(op == 0){
                loop = true;
            }else{
                loop = false;
            }
        }while(loop);
    }
}
