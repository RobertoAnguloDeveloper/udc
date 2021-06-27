package EstructuraDatos;

public class Nodo {
    private Object dato;
    private Nodo izquierdo;
    private Nodo derecho;
    
    public Nodo() {}

    public Nodo(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
        return dato;
    }

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Nodo getIzquierdo(){
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo){
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho(){
        return derecho;
    }

    public void setDerecho(Nodo derecho){
        this.derecho = derecho;
    }
}
