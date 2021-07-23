package JAVA.Arboles;

import java.util.Optional;

public class Nodo {
    private Integer valor;
    private Nodo izquierdo;
    private Nodo derecho;
 
    public Nodo() {}
    public Nodo(Integer valor) {
        this.valor = valor;
    }

    public void agregar(Integer valor) {
        if (this.valor == null) {
            this.valor = valor;
        } else if (this.valor > valor) {
            if (this.izquierdo == null) {
                this.izquierdo = new Nodo(valor);
            } else {
                this.izquierdo.agregar(valor);
            }
        } else {
            if (this.derecho == null) {
                this.derecho = new Nodo(valor);
            } else {
                this.derecho.agregar(valor);
            }
        }
    }

    public Optional<Nodo> buscar(Integer valor) {
        if (valor == this.valor) {
            return Optional.of(this);
        } else if (valor < this.valor) {
            if (this.izquierdo != null) {
                return this.izquierdo.buscar(valor);
            } else {
                return Optional.empty();
            }
        } else {
            if (this.derecho != null) {
                return this.derecho.buscar(valor);
            } else {
                return Optional.empty();
            }
        }
    }

    public void ordenar() {
        if (izquierdo != null) {
            izquierdo.ordenar();
        }
        if (derecho != null) {
            derecho.ordenar();
        }
        if (izquierdo != null && derecho != null) {
            if (izquierdo.valor > derecho.valor) {
                Integer aux = izquierdo.valor;
                izquierdo.valor = derecho.valor;
                derecho.valor = aux;
                ordenar();
            }
        }
    }

    public void ordenarReverso() {
        if (izquierdo != null) {
            izquierdo.ordenarReverso();
        }
        if (derecho != null) {
            derecho.ordenarReverso();
        }
        if (izquierdo != null && derecho != null) {
            if (izquierdo.valor < derecho.valor) {
                Integer aux = izquierdo.valor;
                izquierdo.valor = derecho.valor;
                derecho.valor = aux;
                ordenarReverso();
            }
        }
    }

    public void eliminar(Integer valor) {
        if (valor == this.valor) {
            if (izquierdo != null) {
                izquierdo.eliminar(valor);
            }
            if (derecho != null) {
                derecho.eliminar(valor);
            }
            this.valor = null;
        } else if (valor < this.valor) {
            if (izquierdo != null) {
                izquierdo.eliminar(valor);
            }
        } else {
            if (derecho != null) {
                derecho.eliminar(valor);
            }
        }
    }

    //Build a method that inserts an Integer value into the tree with a given position.
    public void insertar(Integer valor, Integer posicion) {
        if (posicion == 1) {
            agregar(valor);
        } else if (posicion == 2) {
            if (izquierdo != null) {
                izquierdo.insertar(valor, posicion);
            } else {
                izquierdo = new Nodo(valor);
            }
        } else if (posicion == 3) {
            if (derecho != null) {
                derecho.insertar(valor, posicion);
            } else {
                derecho = new Nodo(valor);
                
    
    public void inOrden(){
        if(izquierdo!=null){
            izquierdo.inOrden();
        }
        System.out.println(valor);
        if(derecho!=null){
            derecho.inOrden();
        }
    }
 
    public void preOrden(){
        System.out.println(valor);
        if(izquierdo!=null){
            izquierdo.preOrden();
        }
        if(derecho!=null){
            derecho.preOrden();
        }
    }
 
    public void postOrden(){
        if(izquierdo!=null){
            izquierdo.preOrden();
        }
        if(derecho!=null){
            derecho.preOrden();
        }
        System.out.println(valor);
    }

    public void lista() {
        if (izquierdo != null) {
            izquierdo.lista();
        }
        System.out.println(valor);
        if (derecho != null) {
            derecho.lista();
        }
    }

    @Override
    public String toString() {
        return "Nodo [Valor = " + valor + "]"  + "\nIzquierdo = " + izquierdo  + " Derecho = " + derecho + "]";
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}