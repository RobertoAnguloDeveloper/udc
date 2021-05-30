/*
CLASE DISEÑADA PARA TODOS LOS EJERCICIOS DE LA ACTIVIDAD DE APRENDIZAJE UNIDAD 3
ESTRUCTURA DE DATOS
 */

package Lista;

import javax.swing.JOptionPane;

public class Lista{
    private Nodo [] lista;
    private Nodo cabeza;
    private Nodo cola;

    public Lista() {
        lista = new Nodo[1];
        cabeza = lista[0];
        cola = lista[0];
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
            cola = lista[lista.length-1];
            lista[lista.length-1].setAntes(lista[lista.length-2]);
            lista[lista.length-1].setDespues(null);
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
                    lista[0].setAntes(null);
                    lista[0].setDespues(lista[1]);
                }
            }else if(posicion > lista.length-1){
                for (int i = 0; i <lista.length; i++) {
                    listaCopia[i] = lista[i];
                }

                lista = new Nodo[lista.length+1];

                for (int i = 0; i < lista.length; i++) {
                    lista[i] = listaCopia[i];
                }
                
                lista[posicion] = nodo;
                lista[posicion].setAntes(lista[posicion-1]);
                lista[posicion].setDespues(null);
            }else{
                for (int i = 0; i < lista.length; i++) {
                    listaCopia[i] = lista[i];
                }

                for (int i = posicion+1, j = posicion; i < listaCopia.length; i++, j++) {
                    listaCopia[i] = lista[j];
                }
                lista = listaCopia;
                lista[posicion].setAntes(lista[posicion-1]);
                lista[posicion].setDespues(lista[posicion+1]);
            }

            lista[posicion] = nodo;
        }
    }
    
    public void insertarListaCircular(int posicion, Nodo nodo){
        Nodo [] listaCopia = new Nodo[lista.length+1];
        
        if(posicion > lista.length){
            JOptionPane.showMessageDialog(null, "POSICION MUY "
                    + "DISTANTE DE LA COLA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            if(posicion == 0){
                if(lista[0] == null){
                    lista[0] = nodo;
                    cabeza = lista[0];
                    cola = lista[0];
                    cola.setDespues(cabeza);
                }else {
                    for (int i = posicion+1, j = 0; j < lista.length; i++, j++) {
                        listaCopia[i] = lista[j];
                    }
                    lista = listaCopia;
                    lista[0] = nodo;
                    cabeza = lista[0];
                    cola = lista[lista.length-1];
                    cola.setDespues(cabeza);
                    lista[0].setAntes(null);
                    lista[0].setDespues(lista[1]);
                }
            }else if(posicion > lista.length-1){
                for (int i = 0; i <lista.length; i++) {
                    listaCopia[i] = lista[i];
                }

                lista = new Nodo[lista.length+1];

                for (int i = 0; i < lista.length; i++) {
                    lista[i] = listaCopia[i];
                }
                
                lista[posicion] = nodo;
                cabeza = lista[0];
                cola = lista[posicion];
                cola.setDespues(cabeza);
                lista[posicion].setAntes(lista[posicion-1]);
                lista[posicion].setDespues(null);
            }else{
                for (int i = 0; i < lista.length; i++) {
                    listaCopia[i] = lista[i];
                }

                for (int i = posicion+1, j = posicion; i < listaCopia.length; i++, j++) {
                    listaCopia[i] = lista[j];
                }
                lista = listaCopia;
                cabeza = lista[0];
                cola = lista[lista.length-1];
                cola.setDespues(cabeza);
                lista[posicion].setAntes(lista[posicion-1]);
                lista[posicion].setDespues(lista[posicion+1]);
            }

            lista[posicion] = nodo;
            cabeza = lista[0];
            cola = lista[lista.length-1];
            cola.setDespues(cabeza);
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