/*
Realice un método recursivo que dadas dos listas ordenadas ascendentemente, 
la mezcle generando una nueva lista ordenada descendentemente.
 */
package Ej2;

import EstructurasDatos.Lista;
import EstructurasDatos.Nodo;
import javax.swing.JOptionPane;

public class Ej2 {
    
    public static void main(String[] args) {
        Nodo dato;
        Lista lista1 = new Lista();
        Lista lista2 = new Lista();
        Lista listasMezcladas = new Lista();
        
        //LLENANDO LISTA 1
        boolean loop = true;
        int i = 0;
        do{
            String valor = JOptionPane.showInputDialog(null, 
                    "INGRESE EL VALOR DEL NODO["+i+"]", "LLENADO DE LISTA 1", 
                    JOptionPane.INFORMATION_MESSAGE);
            
            if(valor == null){
                loop = false;
                JOptionPane.showMessageDialog(null, "NO INGRESO DATOS EN LA LISTA 1 "
                        + "NODO["+i+"]", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            }else{
                dato = new Nodo(valor);
                lista1.agregar(dato);
            }
            i++;
        }while(loop);
        
        //LLENANDO LISTA 2
        loop = true;
        i = 0;
        do{
            String valor = JOptionPane.showInputDialog(null, 
                    "INGRESE EL VALOR DEL NODO["+i+"]", "LLENADO DE LISTA 2", 
                    JOptionPane.INFORMATION_MESSAGE);
            
            if(valor == null){
                loop = false;
                JOptionPane.showMessageDialog(null, "NO INGRESO DATOS EN LA LISTA 2 "
                        + "NODO["+i+"]", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            }else{
                dato = new Nodo(valor);
                lista2.agregar(dato);
            }
            i++;
        }while(loop);
        
        JOptionPane.showMessageDialog(null, lista1.imprimir(), "LISTA 1", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, lista2.imprimir(), "LISTA 2", JOptionPane.INFORMATION_MESSAGE);
        
        lista1.toArray();
        lista2.toArray();
        
        listasMezcladas.invertirLista(lista1.getLista(), listasMezcladas,lista1.getSize()-1);
        listasMezcladas.invertirLista(lista2.getLista(), listasMezcladas,lista2.getSize()-1);
        
        JOptionPane.showMessageDialog(null, listasMezcladas.imprimir(), "LISTAS MEZCLADAS", JOptionPane.INFORMATION_MESSAGE);
    }
}
