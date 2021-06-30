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
        contadorNiveles = 1;
        numeros = new ArrayList<Integer>();
        hojas = new ArrayList<Nodo>();
        internos = new ArrayList<Nodo>();
        nodos = new ArrayList<Nodo>();
    }
    
    public void agregarNodo(Nodo nodo, Nodo padre){
        Nodo nodoAux1 = padre;
        
        if(raiz == null){
            raiz = nodo;
        }else if(nodoAux1.getIzquierdo() != null){
            nodo.setPadre(nodoAux1);
            nodoAux1.setDerecho(nodo);
            contadorNiveles++;
            }else {
                nodo.setPadre(padre);
                nodoAux1.setIzquierdo(nodo);
            }
            contadorNodos++;
    }

    public void preOrden(Nodo padre){
        if(padre != null){
            System.out.print(padre.getDato()+" ");
            preOrden(padre.getIzquierdo());
            preOrden(padre.getDerecho());

            if(padre.getIzquierdo() == null && padre.getDerecho() == null){
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

    public void arbolToArray(Nodo padre, int iterador){
        if(padre != null){
            if(padre.getTipo().equals("raiz")){
                nodos.add(padre);
            }else{
                if(padre.getNivel() <= iterador){
                    nodos.add(padre);
                    iterador++;
                }
            }
            arbolToArray(padre.getIzquierdo(), iterador);
            arbolToArray(padre.getDerecho(), iterador);
        }
    }

    public void ordenarArbolArray(){
        for (int i = 0; i < nodos.size(); i++) {
            for (int j = 1; j < nodos.size()-i-1; j++) {
                if(nodos.get(j).getNivel() > nodos.get(j+1).getNivel()){
                    Nodo aux = nodos.get(j+1);
                    nodos.set(j+1, nodos.get(j));
                    nodos.set(j, aux);
                }
            }
        }
    }

    public void arbolToArrayNumeros(Nodo padre){
        if(padre != null){
            arbolToArrayNumeros(padre.getIzquierdo());
            numeros.add(((Number) padre.getDato()).intValue());
            arbolToArrayNumeros(padre.getDerecho());
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
        asignarNivel(padre, 0);
        if(padre != null){
            tomarHojas(padre.getIzquierdo());
            tomarHojas(padre.getDerecho());

            if(padre.getIzquierdo() == null && padre.getDerecho() == null){
                hojas.add(padre);
                contadorHojas++;
            }
        }
    }

    public void asignarNivel(Nodo padre, int nivelInicial){
        if(padre == null || nivelInicial > contadorNiveles){
            return;
        }

        if(nivelInicial == 0){
            padre.setNivel(0);
        }else{
            padre.setNivel(nivelInicial);
        }

        asignarNivel(padre.getIzquierdo(), nivelInicial+1);
        asignarNivel(padre.getDerecho(), nivelInicial+1);
    }

    public void asignarTipo(Nodo padre){
        if(padre == null){
            return;
        }

        if(padre.getNivel() == 0){
            padre.setTipo("raiz");
        }else{
            padre.setTipo("padre");
        }

        if(padre.getIzquierdo() == null && padre.getDerecho() == null){
            padre.setTipo("hoja");
        }

        asignarTipo(padre.getIzquierdo());
        asignarTipo(padre.getDerecho());
    }

    public void intercambiarSubarbol(Nodo padre){
        if(padre == null){
            return;
        }
        
        if(padre.getIzquierdo() == null && padre.getDerecho() == null){
            return;
        }

        Nodo nodoAux1 = padre.getIzquierdo();
        padre.setIzquierdo(padre.getDerecho());
        padre.setDerecho(nodoAux1);

        if(padre.getIzquierdo() != null){
            intercambiarSubarbol(padre.getIzquierdo());
        }

        if(padre.getDerecho() != null){
            intercambiarSubarbol(padre.getDerecho());
        }
    }

    public void imprimir(){
        int nodoRepetido = 0;
        for (int i = 0; i < nodos.size(); i++) {
            System.out.print("NIVEL "+nodos.get(i).getNivel()+"-> ");
            for (int j = 0; j < nodos.size(); j++) {
                if(nodos.get(i).getNivel() == nodos.get(j).getNivel()){
                    System.out.print(nodos.get(j).getDato()+" ");
                    nodoRepetido = j;
                }
            }
            i = nodoRepetido + 1;
            System.out.println();
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

    public int getContadorNiveles(){
        return contadorNiveles;
    }

    public ArrayList<Integer> getNumeros(){
        return numeros;
    }

    public ArrayList<Nodo> getHojas(){
        tomarHojas(raiz);
        return hojas;
    }

    public ArrayList<Nodo> getInternos(){
        internos.add(raiz);
        for (int i = 0; i < nodos.size(); i++) {
            if(nodos.get(i).getTipo() == "padre"){
                internos.add(nodos.get(i));
            }
        }
        return internos;
    }

    public ArrayList<Nodo> getNodos(){
        return nodos;
    }
}
