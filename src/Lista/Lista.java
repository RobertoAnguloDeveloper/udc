/*
 Defina un programa para insertar, si es posible, un elemento antes de otro nodo dado 
como referencia en una lista ordenada.
si la lista es de [2, 7, 9 10, 20, 22]  y si insertas el elemento 4 por ejemplo 
entre 7 y 9, la lista debe quedar [2, 4, 7, 9 10, 20, 22]
 */

package Lista;

import javax.swing.JOptionPane;

public class Lista{
    private Nodo [] lista;

    public Lista() {
        lista = new Nodo[1];
    }

    public Nodo[] getLista() {
        return lista;
    }

    public void setLista(Nodo[] lista) {
        this.lista = lista;
    }
    
    public void agregar(Nodo nodo){        
        Nodo [] listaCopia = new Nodo[lista.length+1];
        
        for (int i = 0; i < lista.length; i++) {
            listaCopia[i] = lista[i];
        }
        
        if(lista[0] != null){
            listaCopia[listaCopia.length-1] = nodo;
            lista = listaCopia;
        }else{
            lista[0] = nodo;
        }
    }
    
    public void insertar(int posicion, Nodo nodo){
        Nodo [] listaCopia = new Nodo[lista.length+1];
        
        if(posicion > lista.length){
            JOptionPane.showMessageDialog(null, "POSICION MUY "
                    + "DISTANTE DE LA COLA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            if(posicion == 0){
                if(lista[0] == null){
                    lista[0] = nodo;
                }else {
                    for (int i = posicion+1, j = 0; j < lista.length; i++, j++) {
                        listaCopia[i] = lista[j];
                    }
                    lista = listaCopia;
                    lista[0] = nodo;
                }
            }else if(posicion > lista.length-1){
                for (int i = 0; i <lista.length; i++) {
                    listaCopia[i] = lista[i];
                }

                lista = new Nodo[lista.length+1];

                for (int i = 0; i < lista.length; i++) {
                    lista[i] = listaCopia[i];
                }
            }else{
                for (int i = 0; i < lista.length; i++) {
                    listaCopia[i] = lista[i];
                }

                for (int i = posicion+1, j = posicion; i < listaCopia.length; i++, j++) {
                    listaCopia[i] = lista[j];
                }
                lista = listaCopia;
            }


            lista[posicion] = nodo;
        }
    }
    
    public Lista invertirLista(Lista lista, Lista listaInvertida, int posicionFinal){
        if(posicionFinal >= 0){
            listaInvertida.agregar(lista.getLista()[posicionFinal]);
            listaInvertida = invertirLista(lista, listaInvertida, posicionFinal-1);
        }
        return listaInvertida;
    }
    
    public String imprimeLista(){
        int nodoPos = 0, ultimaPos = lista.length-1;
        String resultado = "";
        
        for (Nodo nodo : lista) {
            if(nodoPos == ultimaPos){
                System.out.print("["+nodo.getValor()+"]");
                resultado += "["+nodo.getValor()+"]";
            }else{
                System.out.print("["+nodo.getValor()+"]-");
                resultado += "["+nodo.getValor()+"]-";
            }
            nodoPos++;
        }
        System.out.println("");
        
        return resultado;
    }
    
}