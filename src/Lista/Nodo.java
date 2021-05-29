/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author hacke
 */
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
