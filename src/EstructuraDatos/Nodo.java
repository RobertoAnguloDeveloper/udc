package EstructuraDatos;

public class Nodo {
    private Object dato;
    private Nodo izquierdo;
    private Nodo derecho;
    private Nodo padre;
    private int nivel;
    private String tipo;
    
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

    public Nodo getPadre(){
        return padre;
    }

    public void setPadre(Nodo padre){
        this.padre = padre;
    }

    public int getNivel(){
        return nivel;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}
