package EstructuraDatos;

public class ArbolBplus {
    
    public NodoBplus raiz;
    public NodoBplus cabeza;
    public int orden;


    public int getOrden(){
        return this.orden;
    }

    public void setOrden(Integer orden){
        this.orden = orden;
    }

    public ArbolBplus(int orden){
        if(orden < 3){
            System.out.println("ORDEN DEBE SER MAYOR 2");
            System.exit(0);
        }
        this.orden = orden;
        raiz = new NodoBplus(true, true);
        cabeza = raiz;
    }

    public void insertarActualizar(Integer clave, Object valor){
        raiz.insertarActualizar(clave, valor, this);
    }

    public void eliminar(Integer clave){
        raiz.eliminar(clave, this);
    }

    public Object busqueda(Integer clave) {
        return raiz.buscar(clave);
    }

    public void encontrar(ArbolBplus arbol) {
        raiz.encontrar(arbol);
    }

    public void imprimir(){
        imprimir(raiz, orden, 0);
    }

    private void imprimir(NodoBplus nodo, int orden, int indice){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 1; i < orden; i++) {
            stringBuilder.append("|    ");
        }
        if(orden > 0) {
            stringBuilder.append("|----");
        }
        stringBuilder.append(nodo.entradas);
        System.out.println(stringBuilder.toString());
        if(nodo.hijos != null) {
            imprimir(nodo.hijos.get(indice+1), orden-1, 0);
        }
    }
}