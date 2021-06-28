package EstructuraDatos;

public class ArbolBinario {
    private Nodo raiz;
    private int contadorNodos;
    private int contadorHojas;
    private int contadorNiveles;
    public int iter;
    public int nivel;

    public ArbolBinario(){
        raiz = null;
        iter = 0;
        nivel = 0;
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

    public void imprimir(Nodo nodo){
        if(nodo != null){
            if(nodo.getIzquierdo() != null || nodo.getDerecho() != null){
                imprimir(nodo.getIzquierdo());
                System.out.println(nodo.getDato());
                imprimir(nodo.getDerecho());
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
}
