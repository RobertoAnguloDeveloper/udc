
package EstructurasDatos;

public class Pila {
    private Nodo [] pila;
    private Nodo cabeza; 
    private Nodo cola;
    
    public Pila(){
        pila = new Nodo[1];
        cabeza = pila[0];
        cola = pila[0];
    }

    public Nodo[] getPila() {
        return pila;
    }

    public void setPila(Nodo[] pila) {
        this.pila = pila;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getCola() {
        return cola;
    }

    public void setCola(Nodo cola) {
        this.cola = cola;
    }
    
    public void metePila(Nodo nodo){
        Nodo [] pilaCopia = new Nodo[pila.length+1];
        
        for (int i = 0; i < pila.length; i++) {
            pilaCopia[i] = pila[i];
        }
        
        if(pila[0] != null){
            pilaCopia[pilaCopia.length-1] = nodo;
            pila = pilaCopia;
            cola = pila[pila.length-1];
            pila[pila.length-1].setAntes(pila[pila.length-2]);
            pila[pila.length-1].setDespues(null);
        }else{
            pila[0] = nodo;
            cabeza = pila[0];
            cola = pila[0];
        }
    }
    
    public void sacaPila(){
        Nodo [] listaCopia = new Nodo[pila.length-1];
        
        for (int i = 0; i < listaCopia.length; i++) {
            listaCopia[i] = pila[i];
        }
        
        if(pila[0] != null){
            pila = listaCopia;
        }
    }
    
    public String imprimePila(){
        int i = 0;
        String resultado = "";
        for (Nodo nodo : pila) {
            System.out.print("["+nodo.getValor()+"]-");
            resultado += "["+nodo.getValor()+"]-";
            i++;
        }
        return resultado;
    }
}
