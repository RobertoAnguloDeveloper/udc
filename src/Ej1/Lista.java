/*
 Defina un programa para insertar, si es posible, un elemento antes de otro nodo dado 
como referencia en una lista ordenada.
si la lista es de [2, 7, 9 10, 20, 22]  y si insertas el elemento 4 por ejemplo 
entre 7 y 9, la lista debe quedar [2, 4, 7, 9 10, 20, 22]
 */

package Ej1;

public class Lista{
    private Nodo [] nodo;
    
    public Lista(Nodo nodoCabeza){
        nodo = new Nodo[1];
        this.nodo[0] = nodoCabeza;
    }

    public void insertar(int posicionInsertar
            , Nodo nodoInsertar){
        Nodo [] listaCopia = new Nodo[nodo.length+1];
        
        //COPIANDO LA LISTA PARA LUEGO REORGANIZARLA
        for(int i = 0; i < nodo.length; i++){
            listaCopia[i] = nodo[i];
        }
        
//        nodo = new Nodo[listaCopia.length];
        
        if(posicionInsertar == 0){
            nodo[1] = nodo[0];
            nodo[posicionInsertar] = nodoInsertar;
            
        }else if(posicionInsertar == nodo.length-1){
            nodo[posicionInsertar] = nodoInsertar;
            System.out.println("ENTRO");
        }else{
            for(int i = posicionInsertar; i < nodo.length; i++){
                nodo[i] = nodo[i+1];
            }
            
            nodo[posicionInsertar] = nodoInsertar;
        }
        
//        int pos = 0;
//        for (Nodo nodo1 : nodo) {
//            System.out.println("POS ["+pos+"]: "+(nodo1.getValor()));
//            pos++;
//        }
            
    }
}
