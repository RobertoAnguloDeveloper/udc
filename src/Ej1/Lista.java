/*
 Defina un programa para insertar, si es posible, un elemento antes de otro nodo dado 
como referencia en una lista ordenada.
si la lista es de [2, 7, 9 10, 20, 22]  y si insertas el elemento 4 por ejemplo 
entre 7 y 9, la lista debe quedar [2, 4, 7, 9 10, 20, 22]
 */

package Ej1;

public class Lista{
    private Nodo [] nodo;
    private Nodo cabeza;
    private Nodo cola;
    
    public Lista(){
        nodo = new Nodo[1];
        cabeza = new Nodo();
        cabeza = nodo[0];
        cola = new Nodo();
        cola = nodo[0];
        
    }
    
    public void correr(Nodo [] listaCopia){
        for(int i = 0; i < listaCopia.length-1; i++){
            Nodo temp = new Nodo();
            temp = listaCopia[i];
            nodo[i+1] =temp;
        }
    }
    
    public Nodo [] copiaLista(Nodo [] listaCopia){
        for(int i = 0; i < nodo.length; i++){
            listaCopia[i] = nodo[i];
        }
        return listaCopia;
    }
    
    public void insertar(int posicionInsertar
            , Nodo nodoInsertar){
        Nodo [] listaCopia = new Nodo[nodo.length+1];
        
        nodo = new Nodo[copiaLista(listaCopia).length];
        
        if(cabeza != null){
            if(posicionInsertar == 0){
                cabeza = nodoInsertar;
                nodo[0] = nodoInsertar;
                correr(listaCopia);
                
            }else{
                nodo[posicionInsertar] = nodoInsertar;
                correr(listaCopia);
            }
        }else{
            nodo = new Nodo[1];
            cabeza = nodoInsertar;
            nodo[0] = nodoInsertar;
        }
    }
    
    public void imprimeLista(){
        int nodoPos = 0;
        for (Nodo nodo1 : nodo) {
            System.out.println("NODO ["+nodoPos+"]: "+(nodo1.getValor()));
            nodoPos++;
        }
    }
}
