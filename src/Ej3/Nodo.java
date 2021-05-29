/*
Defina un programa para insertar elementos en una lista circular.
 */
package Ej3;

public class Nodo {
    private Object antes;
    private Object despues;
    private Object valor;

    public Object getAntes() {
        return antes;
    }

    public void setAntes(Object antes) {
        this.antes = antes;
    }

    public Object getDespues() {
        return despues;
    }

    public void setDespues(Object despues) {
        this.despues = despues;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
}
