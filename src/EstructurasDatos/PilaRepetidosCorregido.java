
package EstructurasDatos;

public class PilaRepetidosCorregido {
    private Nodo [] pila;
    private Nodo cabeza; 
    private Nodo tope;
    private int primero;
    private int ultimo;
    
    public PilaRepetidosCorregido(){
        pila = new Nodo[1];
        cabeza = pila[0];
        tope = pila[0];
        primero = 0;
        ultimo = 0;
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
        return tope;
    }

    public void setCola(Nodo cola) {
        this.tope = cola;
    }

    public Nodo getTope() {
        return tope;
    }

    public void setTope(Nodo tope) {
        this.tope = tope;
    }

    public int getPrimero() {
        return primero;
    }

    public void setPrimero(int primero) {
        this.primero = primero;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }
    
    public void metePila(Nodo nodo){
        Nodo [] pilaCopia = new Nodo[pila.length+1];
        
        for (int i = 0; i < pila.length; i++) {
            pilaCopia[i] = pila[i];
        }
        
        if(pila[0] != null){
            pilaCopia[pilaCopia.length-1] = nodo;
            pila = pilaCopia;
            tope = pila[pila.length-1];
            pila[pila.length-1].setAntes(pila[pila.length-2]);
            pila[pila.length-1].setDespues(null);
        }else{
            pila[0] = nodo;
            cabeza = pila[0];
            tope = pila[0];
        }
        primero = 0;
        ultimo = pila.length-1;
    }
    
    public void sacaPila(){
        Nodo [] listaCopia = new Nodo[pila.length-1];
        
        for (int i = 0; i < listaCopia.length; i++) {
            listaCopia[i] = pila[i];
        }
        
        if(pila[0] != null){
            pila = listaCopia;
        }
        primero = 0;
        ultimo = pila.length-1;
    }
    
    public void eliminaRepetidos(){
        Nodo [] pilaCopia = new Nodo[pila.length];
        
        for (int i = 0; i < pilaCopia.length; i++) {
            pilaCopia[i] = pila[i];
        }
        
        for (int i = 0; i < pila.length; i++) {
            int contador = 0;
            for (int j = 0; j < pilaCopia.length; j++) {
                if(pilaCopia[j].getValor().equals(pila[i].getValor())){
                    contador++;
                    if(contador > 1 && j != pilaCopia.length-1){
                        pilaCopia[j].setValor(pilaCopia[j+1].getValor());
                    }
                }
            }
        }
        
        pila = new Nodo[pila.length-1];
        
        for (int i = 0; i < pila.length; i++) {
            pila[i] = pilaCopia[i];
        }
    }
    
    public String imprimePila(){
        int nodoPos = 0, ultimaPos = ultimo;
        String resultado = "";
        System.out.println("\nPILA");
        for (Nodo nodo : pila) {
            if(nodoPos == ultimaPos){
                System.out.print("["+nodo.getValor()+"]");
                resultado += "["+nodo.getValor()+"]";
            }else{
                System.out.print("["+nodo.getValor()+"]-");
                resultado += "["+nodo.getValor()+"]-";
            }
            nodoPos++;
        }
        return resultado;
    }
}
