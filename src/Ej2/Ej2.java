/*
Realice un método recursivo que dadas dos listas ordenadas ascendentemente, 
la mezcle generando una nueva lista ordenada descendentemente.
 */
package Ej2;

import Lista.Lista;
import Lista.Nodo;
import java.util.List;
import javax.swing.JOptionPane;

public class Ej2 {
    
    
    public static List mezclarListas(int indiceLista1, List lista1, 
            List listasMezcladas){
        
        if(indiceLista1 >= 0){
            listasMezcladas.add(lista1.get(indiceLista1));
            mezclarListas(indiceLista1-1, lista1, listasMezcladas);
        }
        
        return listasMezcladas;
    }
    
    public static void imprimir(List lista, String numeroLista){
        System.out.println("LISTA "+numeroLista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(" NODO["+i+"]: "+lista.get(i));
        }
    }
    
    public static void main(String[] args) {
        Nodo dato;
        Lista lista1 = new Lista();
        Lista lista2 = new Lista();
        Lista listasMezcladas = new Lista();
        
        //LLENANDO LISTA 1
        boolean loop = true;
        int i = 0;
        do{
            dato = new Nodo();
            dato.setValor(JOptionPane.showInputDialog(null, 
                    "INGRESE EL VALOR DEL NODO["+i+"]", "LLENADO DE LISTA 1", 
                    JOptionPane.INFORMATION_MESSAGE));
            
            if(dato.getValor() == null){
                loop = false;
                JOptionPane.showMessageDialog(null, "NO INGRESO DATOS EN LA LISTA 1 "
                        + "NODO["+i+"]", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            }else{
                lista1.agregar(dato);
            }
            i++;
        }while(loop);
        
        //LLENANDO LISTA 2
        loop = true;
        i = 0;
        do{
            dato = new Nodo();
            dato.setValor(JOptionPane.showInputDialog(null, 
                    "INGRESE EL VALOR DEL NODO["+i+"]", "LLENADO DE LISTA 1", 
                    JOptionPane.INFORMATION_MESSAGE));
            
            if(dato.getValor() == null){
                loop = false;
                JOptionPane.showMessageDialog(null, "NO INGRESO DATOS EN LA LISTA 1 "
                        + "NODO["+i+"]", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            }else{
                lista1.agregar(dato);
            }
            i++;
        }while(loop);
        
       
        
    }
    
}
