package EstructuraDatos;

import java.util.ArrayList;
import java.util.Collections;

public class ArbolBinario {
    private Nodo raiz;
    private int contadorNodos;
    private int contadorHojas;
    private int contadorNiveles;
    private ArrayList<Integer> numeros;
    private ArrayList<Nodo> hojas;
    private ArrayList<Nodo> nodos;
    private ArrayList<Nodo> internos;

    public ArbolBinario(){
        raiz = null;
        numeros = new ArrayList<Integer>();
        hojas = new ArrayList<Nodo>();
        internos = new ArrayList<Nodo>();
        nodos = new ArrayList<Nodo>();
    }
    
    public void agregarNodo(Nodo nodo, Nodo padre){
        Nodo temp = padre;
        
        if(raiz == null){
            nodo.setNivel(0);
            nodo.setTipo("raiz");
            raiz = nodo;
        }else if(temp.getIzquierdo() != null){
            nodo.setNivel(contadorNiveles);
            nodo.setTipo("padre");
            nodo.setPadre(temp);
            temp.setDerecho(nodo);
            contadorNiveles++;
            }else {
                nodo.setNivel(contadorNiveles);
                nodo.setTipo("padre");
                nodo.setPadre(padre);
                temp.setIzquierdo(nodo);
            }
            contadorNodos++;
    }

    public void preOrden(Nodo padre){
        if(padre != null){
            System.out.print(padre.getDato()+" ");
            preOrden(padre.getIzquierdo());
            preOrden(padre.getDerecho());

            if(padre.getIzquierdo() == null && padre.getDerecho() == null){
                padre.setTipo("hoja");
                contadorHojas++;
            }
        }
    }

    public void inOrden(Nodo padre){
        if(padre != null){
            inOrden(padre.getIzquierdo());
            System.out.print(padre.getDato()+" ");
            inOrden(padre.getDerecho());
        }
    }

    public void postOrden(Nodo padre){
        if(padre != null){
            postOrden(padre.getIzquierdo());
            postOrden(padre.getDerecho());
            System.out.print(padre.getDato()+" ");
        }
    }

    public void arbolToArrayNumeros(Nodo padre){
        if(padre != null){
            arbolToArrayNumeros(padre.getIzquierdo());
            numeros.add(((Number) padre.getDato()).intValue());
            arbolToArrayNumeros(padre.getDerecho());
        }
    }

    public void arbolToArray(Nodo padre){
        if(padre != null){
            arbolToArray(padre.getIzquierdo());
            nodos.add(padre);
            arbolToArray(padre.getDerecho());
        }
    }

    public int valorMayor(){
        arbolToArrayNumeros(raiz);
        Collections.sort(numeros);
        return numeros.get(numeros.size()-1);
    }

    public int promedio(){
        int sumatoria = 0;
        for (int i = 0; i < numeros.size(); i++) {
            sumatoria += numeros.get(i);
        }
        return sumatoria/numeros.size();
    }

    public void tomarHojas(Nodo padre){
        if(padre != null){
            tomarHojas(padre.getIzquierdo());
            tomarHojas(padre.getDerecho());

            if(padre.getIzquierdo() == null && padre.getDerecho() == null){
                padre.setTipo("hoja");
                hojas.add(padre);
                contadorHojas++;
            }
        }
    }

    public Nodo getRaiz(){
        return raiz;
    }

    public int getContadorNodos(){
        return contadorNodos;
    }

    public int getContadorHojas(){
        return contadorHojas;
    }

    public ArrayList<Integer> getNumeros(){
        return numeros;
    }

    public ArrayList<Nodo> getHojas(){
        tomarHojas(raiz);
        return hojas;
    }

    public ArrayList<Nodo> getInternos(){
        arbolToArray(raiz);
        internos.add(raiz);
        for (int i = 0; i < nodos.size(); i++) {
            if(nodos.get(i).getTipo() == "padre"){
                internos.add(nodos.get(i));
            }
        }
        return internos;
    }
}
