package EstructuraDatos;

public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario(){
        raiz = new Nodo();
    }
    
    public void agregarNodo(Nodo nodo){
        Nodo temp = raiz;
        if(temp.getIzquierdo() != null){
            agregarNodo(nodo);
        }else{
            temp.setIzquierdo(nodo);
        }
    }
}
