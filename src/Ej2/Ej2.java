/*
Realice un método recursivo que dadas dos listas ordenadas ascendentemente, 
la mezcle generando una nueva lista ordenada descendentemente.
 */
package Ej2;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class Ej2 {
    public static List llenarLista(List lista, int numeroLista){
        boolean loop = true;
        int i = 0;
        
        do{
            String dato = JOptionPane.showInputDialog(null, 
                    "INGRESE EL VALOR DEL NODO["+i+"]", "LLENADO DE LISTA "+numeroLista, 
                    JOptionPane.INFORMATION_MESSAGE);
            
            if(dato == null){
                loop = false;
                JOptionPane.showMessageDialog(null, "NO INGRESO DATOS EN LA LISTA "
                        +numeroLista+" NODO["+i+"]", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            }else{
                lista.add(dato);
            }
            i++;
        }while(loop);
        
        return lista;
    }
    
    public static List mezclarListas(int indiceLista1, List lista1, 
            int indiceLista2, List lista2, List listasMezcladas){
        
        if(indiceLista1 < lista1.size() && indiceLista1 >= 0){
            listasMezcladas.add(lista1.get(indiceLista1));
            mezclarListas(indiceLista1--, lista1, indiceLista2, lista2, listasMezcladas);
        }
        
        
        return listasMezcladas;
    }
    
    public static void imprimir(List lista, int numeroLista){
        System.out.println("LISTA "+numeroLista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(" NODO["+i+"]: "+lista.get(i));
        }
    }
    
    public static void main(String[] args) {
        List lista1 = new LinkedList();
        List lista2 = new LinkedList();
        List listasMezcladas = new LinkedList();
        
        lista1 = llenarLista(lista1, 1);
        imprimir(lista1, 1);
        lista2 = llenarLista(lista2, 2);
        imprimir(lista2, 2);
        
        mezclarListas(lista1.size()-1, lista1, lista2.size()-1, lista2, listasMezcladas);
    }
    
}
