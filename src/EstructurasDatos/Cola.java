
package EstructurasDatos;

public class Cola {
    private Nodo [] cola;
    private Nodo cabeza; 
    private Nodo tope;
    
    public Cola(){
        cola = new Nodo[1];
        cabeza = cola[0];
        tope = cola[0];
    }

    public Nodo[] getCola() {
        return cola;
    }

    public void setCola(Nodo[] cola) {
        this.cola = cola;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getTope() {
        return tope;
    }

    public void setTope(Nodo tope) {
        this.tope = tope;
    }

    public void encolar(Nodo nodo){
        Nodo [] colaCopia = new Nodo[cola.length+1];
        
        for (int i = 0; i < cola.length; i++) {
            colaCopia[i] = cola[i];
        }
        
        if(cola[0] != null){
            colaCopia[colaCopia.length-1] = nodo;
            cola = colaCopia;
            tope = cola[cola.length-1];
            cola[cola.length-1].setAntes(cola[cola.length-2]);
            cola[cola.length-1].setDespues(null);
        }else{
            cola[0] = nodo;
            cabeza = cola[0];
            tope = cola[0];
        }
    }
    
    public void desencolar(){
        Nodo [] colaCopia = new Nodo[cola.length-1];
        
        if(cola[0] != null){
            for (int i = 0; i < colaCopia.length; i++) {
                colaCopia[i] = cola[i+1];
            }
            cola = colaCopia;
        }
    }
    
    public String imprimePila(){
        int i = 0;
        int nodoPos = 0, ultimaPos = cola.length-1;
        String resultado = "";
        System.out.println("\nCOLA");
        for (Nodo nodo : cola) {
            if(nodoPos == ultimaPos){
                System.out.print("["+nodo.getValor()+"]");
                resultado += "["+nodo.getValor()+"]";
            }else{
                System.out.print("["+nodo.getValor()+"]-");
                resultado += "["+nodo.getValor()+"]-";
            }
            nodoPos++;
        }
        System.out.println("");
        return resultado;
    }
}
