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
        
//        try{
//            nodo.
//        }catch(NullPointerException err){
//            
//        }
        
        //COPIANDO LA LISTA PARA LUEGO REORGANIZARLA
        for(int i = 0; i < nodo.length; i++){
            listaCopia[i] = nodo[i];
        }
        
//        nodo = new Nodo[listaCopia.length];
        
        if(posicionInsertar == 0){
            listaCopia[1] = listaCopia[0];
            listaCopia[posicionInsertar] = nodoInsertar;
            
        }else if(posicionInsertar == nodo.length-1){
            listaCopia[posicionInsertar] = nodoInsertar;
//            System.out.println("ENTRO");
        }else if(posicionInsertar > nodo.length-1){
            for(int i = posicionInsertar; i < listaCopia.length-1; i++){
                listaCopia[i] = listaCopia[i+1];
            }
            
            listaCopia[posicionInsertar] = nodoInsertar;
        }
        
        int pos = 0;
        for (Nodo nodo1 : listaCopia) {
            System.out.println("POS ["+pos+"]: "+(nodo1.getValor()));
            pos++;
        }
            
    }
}
