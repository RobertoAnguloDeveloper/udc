/*
CLASE DISEÑADA PARA TODOS LOS EJERCICIOS DE LA ACTIVIDAD DE APRENDIZAJE UNIDAD 3
ESTRUCTURA DE DATOS
 */
package EstructurasDatos;

public class Nodo {
    private Object dato;
    private Nodo anterior;
    private Nodo siguiente;

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo(Object dato) {
        this.dato = dato;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    public Object getDato() {
        try{
            return dato;
        }catch(NullPointerException err){
           return "Null"; 
        }
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
}
