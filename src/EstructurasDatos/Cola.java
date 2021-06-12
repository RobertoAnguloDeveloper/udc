
package EstructurasDatos;

public class Cola {
    private Nodo [] cola;
    private Nodo cabeza; 
    private Nodo tope;
    private int primero;
    private int ultimo;
    
    public Cola(){
        cola = new Nodo[1];
        cabeza = cola[0];
        tope = cola[0];
        primero = 0;
        ultimo = 0;
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
        
        primero = 0;
        ultimo = cola.length-1;
    }
    
    public void desencolar(){
        Nodo [] colaCopia = new Nodo[cola.length-1];
        
        if(cola[0] != null){
            for (int i = 0; i < colaCopia.length; i++) {
                colaCopia[i] = cola[i+1];
            }
            cola = colaCopia;
        }
        
        primero = 0;
        ultimo = cola.length-1;
    }
    
    public void eliminaRepetidos(){
        Nodo [] colaCopia = new Nodo[cola.length];
        
        for (int i = 0; i < colaCopia.length; i++) {
            colaCopia[i] = cola[i];
        }
        
        for (int i = 0; i < cola.length; i++) {
            int contador = 0;
            for (int j = 0; j < colaCopia.length; j++) {
                if(cola[i].getValor().equals(colaCopia[j].getValor())){
                    contador++;
                    if(contador > 1){
                        colaCopia[j].setValor("vacio");
                    }
                }
            }
        }
        
        int nuevaDimension = 0;
        for (int i = 0; i < colaCopia.length; i++) {
            if(colaCopia[i].getValor() != "vacio"){
                nuevaDimension++;
            }
        }
        
        System.out.println("");
        for (Nodo nodo : colaCopia) {
            System.out.println(nodo.getValor());
        }
        
        cola = new Nodo[nuevaDimension];
        
        for (int i = 0, j = 0; i < colaCopia.length; i++) {
            if(!colaCopia[i].getValor().equals("vacio")){
                cola[j] = colaCopia[i];
                j++;
            }
        }
        
        primero = 0;
        ultimo = cola.length-1;
    }
    
    public void insertarDerecha(Nodo nodo){        
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
        }
        
        primero = 0;
        ultimo = cola.length-1;
    }
    
    public void elimarDerecha(){
        Nodo [] colaCopia = new Nodo[cola.length-1];
        
        for (int i = 0; i < colaCopia.length; i++) {
            colaCopia[i] = cola[i];
        }
        
        if(cola[0] != null){
            cola = colaCopia;
        }
        
        primero = 0;
        ultimo = cola.length-1;
    }
    
    public String imprimeCola(){
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
