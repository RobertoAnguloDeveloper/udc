
package EstructurasDatos;

public class Pila {
    private Nodo [] pila;
    private Nodo cabeza; 
    private Nodo tope;
    
    public Pila(){
        pila = new Nodo[1];
        cabeza = pila[0];
        tope = pila[0];
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
    
    public void eliminaRepetidos(){
        Nodo [] pilaCopia = new Nodo[pila.length];
        
        for (int i = 0; i < pilaCopia.length; i++) {
            pilaCopia[i] = pila[i];
        }
        
        for (int i = 0; i < pila.length; i++) {
            int contador = 0;
            for (int j = 0; j < pilaCopia.length; j++) {
                if(pila[i].getValor().equals(pilaCopia[j].getValor())){
                    contador++;
                    if(contador > 1){
                        pilaCopia[j].setValor("vacio");
                    }
                }
            }
        }
        
        int nuevaDimension = 0;
        for (int i = 0; i < pilaCopia.length; i++) {
            if(pilaCopia[i].getValor() != "vacio"){
                nuevaDimension++;
            }
        }
        
        pila = new Nodo[nuevaDimension];
        
        for (int i = 0, j = 0; i < pila.length; i++) {
            if(pilaCopia[i].getValor() != "vacio"){
                pila[j] = pilaCopia[i];
                j++;
            }
        }
    }
    
    public String imprimePila(){
        int i = 0;
        int nodoPos = 0, ultimaPos = pila.length-1;
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
