
package EstructurasDatos;

public class ListaCircular {
    private Nodo nodoTope;
    private Nodo cabeza;
    private int size;
    
    public ListaCircular(){
        nodoTope = null;
        size = 0;
    }
    
    public void insertar(Nodo nodo){
        if(size == 0){
            cabeza = nodo;
            nodo.setAnterior(nodo);
            nodo.setSiguiente(nodo);
            nodoTope = nodo;
            size++;
        }else{
            nodo.setAnterior(nodoTope);
            nodo.setSiguiente(cabeza);
            nodoTope.setSiguiente(nodo);
            nodoTope = nodo;
            size++;
        }
    }
    
    public String imprimir(){
        Nodo temp = nodoTope.getSiguiente();
        String listaString =  "";
        int nodoPos = 0;
        int ultimaPos = size-1;
        
        do{
            if(nodoPos != ultimaPos){
                System.out.print("["+temp.getDato()+"]-");
                listaString += "["+temp.getDato()+"]-";
            }else{
                System.out.print("["+temp.getDato()+"]");
                listaString += "["+temp.getDato()+"]";
            }
            nodoPos++;
            temp = temp.getSiguiente();
        }while(temp != cabeza);
        
        System.out.println("");
        return listaString;
    }
    
    public Nodo getNodoTope() {
        return nodoTope;
    }

    public void setNodoTope(Nodo nodoTope) {
        this.nodoTope = nodoTope;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
