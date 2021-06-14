
package EstructurasDatos;

public class Cola {
    private Nodo [] cola;
    private Nodo nodoTope;
    private Nodo cabeza;
    private int size;
    
    public Cola(){
        cabeza = null;
        nodoTope = null;
        size = 0;
    }
    
    public Cola(int n){
        nodoTope = cabeza;
        size = 6;
    }
    
    public void encolar(Nodo nodo){
        if(size == 0){
            cabeza = nodo;
            nodoTope = nodo;
            nodoTope.setSiguiente(null);
            size++;
        }else{
            nodo.setSiguiente(cabeza);
            cabeza = nodo;
            size++;
        }
        
        asignaAnteriores();
    }
    
    public void encolarDerecha(Nodo nodo){
        if(cabeza == null){
            nodo.setAnterior(null);
            nodo.setSiguiente(null);
            nodoTope = nodo;
            cabeza = nodoTope;
            size++;
        }else{
            nodo.setAnterior(nodoTope);
            nodoTope.setSiguiente(nodo);
            nodo.setSiguiente(null);
            nodoTope = nodo;
            size++;
        }
    }
    
    public void desencolar(){
        if(size > 0){
            if(cabeza != nodoTope){
                cabeza = cabeza.getSiguiente();
                cabeza.setAnterior(null);
                size--;
            }else{
                cabeza = null;
            }
        }
    }
    
    public void desencolarDerecha(){
        if(size > 0){
            if(nodoTope != cabeza){
                nodoTope = nodoTope.getAnterior();
                nodoTope.setSiguiente(null);
                size--;
            }else{
                cabeza = null;
            }
        }
    }
    
    public void asignaAnteriores(){
        Nodo temp = cabeza;
        Nodo aux = temp;
        temp.setAnterior(null);
        while(temp.getSiguiente() != null){
            temp = temp.getSiguiente();
            temp.setAnterior(aux);
            aux = temp;
        }
    }
    
    public void reubicaNodoTope(){
        Nodo temp = cabeza;
        while(temp.getSiguiente() != null){
            temp = temp.getSiguiente();
        }
        nodoTope = temp;
    }
    
    public void eliminaRepetidos(){
        Nodo temp = cabeza;
        Nodo auxiliar = cabeza;
        Nodo ultimoEliminado = null;
        int contador = 0, i = 0;
        
        while(temp != null){
            if((temp.getDato()+"").equals(auxiliar.getDato()+"")){
                contador++;
                
                if(ultimoEliminado != null){
                    if((temp.getDato()+"").equals(ultimoEliminado.getDato()+"")){
                        contador++;
                    }
                }
                
                if(contador > 1){
                    if(temp != cabeza && temp != nodoTope){
                        temp.getSiguiente().setAnterior(temp.getAnterior());
                        temp.getAnterior().setSiguiente(temp.getSiguiente());
                    }else if(temp == cabeza){
                        temp.getSiguiente().setAnterior(null);
                        cabeza = temp;
                    }else if(temp == nodoTope){
                        temp.getAnterior().setSiguiente(null);
                        nodoTope = temp.getAnterior();
                    }
                    contador = 0;
                    ultimoEliminado = temp;
                    size--;
                }
            }
            
            if(temp == nodoTope && auxiliar.getSiguiente() != null){
                auxiliar = auxiliar.getSiguiente();
                temp = cabeza;
                contador = 0;
            }else{
                temp = temp.getSiguiente();
            }
        }
        
        reubicaNodoTope();
    }
    
    public boolean colaVacia(){
        return size == 0;
    }
    
    public String imprimir(){
        Nodo temp = cabeza;
        String listaString =  "";
        int nodoPos = 0;
        
        while(temp != null){
            if(temp != nodoTope){
                System.out.print("["+temp.getDato()+"]-");
                listaString += "["+temp.getDato()+"]-";
            }else{
                System.out.print("["+temp.getDato()+"]");
                listaString += "["+temp.getDato()+"]";
            }
            temp = temp.getSiguiente();
        }
        
        System.out.println("");
        return listaString;
    }

    public Nodo[] getCola() {
        return cola;
    }

    public void setCola(Nodo[] cola) {
        this.cola = cola;
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
