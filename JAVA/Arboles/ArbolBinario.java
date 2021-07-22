package JAVA.Arboles;

import java.util.TreeMap;

public class ArbolBinario{
    private TreeMap<Integer, Integer> arbol;

    public ArbolBinario(){
        arbol = new TreeMap<>();
    }

    //Method that returns the raiz of the tree
    public Integer getRaiz(){
        return arbol.firstKey();
    }

    public void agregar(int key, int value){
        if(arbol.containsKey(key)){
            arbol.put(key, arbol.get(key) + value);
        }else{
            arbol.put(key, value);
        }
    }

    public int buscar(int key){
        if(arbol.containsKey(key)){
            return arbol.get(key);
        }else{
            return 0;
        }
    }

    //Tree imprimir formatter
    public void ordenar(){
        
    }

    //Revesed order of the tree
    public void desordenar(){
        
    }

    public void eliminar(int valor){
        arbol.remove(valor);
    }

    public void insertar(int valor){
        arbol.put(valor,valor);
    }
}