package EstructuraDatos;

public class ArbolBinario {
    private Nodo raiz;
    private int contadorNodos;
    private int contadorHojas;
    private int contadorNiveles;

    public ArbolBinario(){
        raiz = null;
    }
    
    public void agregarNodo(Nodo nodo, Nodo padre){
        Nodo temp = padre;
        
        if(raiz == null){
            nodo.setNivel(0);
            nodo.setTipo("raiz");
            raiz = nodo;
        }else if(temp.getIzquierdo() != null){
            nodo.setNivel(contadorNiveles);
            nodo.setPadre(temp);
            temp.setDerecho(nodo);
            contadorNiveles++;
            }else {
                nodo.setNivel(contadorNiveles);
                nodo.setPadre(padre);
                temp.setIzquierdo(nodo);
            }
            contadorNodos++;
    }

    public void imprimir(){
        Nodo temp;
        int nivel = 1;

        System.out.println("NIVEL--> 0 = RAIZ"
                            +"\n******************"
                            +"\n"+raiz.getDato());
        System.out.println("");
        
        temp = raiz.getIzquierdo();
        while(temp != null){
            System.out.println("NIVEL-->"+nivel
                            +"\n*************");
            
            System.out.println("IZQ "+temp.getDato());

            if(temp.getPadre().getDerecho() != null){
                System.out.println("DER "+temp.getPadre().getDerecho().getDato());
            }
            System.out.println("");

            if(temp.getIzquierdo() == null && temp.getDerecho() == null){
                contadorHojas++;
            }

            temp = temp.getIzquierdo();
            nivel++;
        }
    }
    
    public Nodo getRaiz(){
        return raiz;
    }

    public int getContadorNodos(){
        return contadorNodos;
    }

    public int getContadorHojas(){
        return contadorHojas;
    }
}
