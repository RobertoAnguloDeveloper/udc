/*
CLASE DISEÑADA PARA TODOS LOS EJERCICIOS DE LA ACTIVIDAD DE APRENDIZAJE UNIDAD 3
ESTRUCTURA DE DATOS
 */
package EstructurasDatos;

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
