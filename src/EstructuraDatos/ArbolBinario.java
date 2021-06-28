package EstructuraDatos;

public class ArbolBinario {
    private Nodo raiz;
    private int contadorNodos;
    private int contadorHojas;
    private int contadorNiveles;
    public int iter;

    public ArbolBinario(){
        raiz = null;
        iter = 0;
    }
    
    public void agregarNodo(Nodo nodo, Nodo padre){
        Nodo temp = padre;
        
        if(raiz == null){
            nodo.setNivel(0);
            nodo.setTipo("raiz");
            raiz = nodo;
        }else if(temp.getIzquierdo() != null){
            nodo.setNivel(contadorNiveles);
            nodo.setTipo("padre");
            nodo.setPadre(temp);
            temp.setDerecho(nodo);
            contadorNiveles++;
            }else {
                nodo.setNivel(contadorNiveles);
                nodo.setTipo("padre");
                nodo.setPadre(padre);
                temp.setIzquierdo(nodo);
            }
            contadorNodos++;
    }

    public void preOrden(Nodo padre){
        //SUBARBOL IZQUIERDO
        if(padre != null){
            System.out.println("NODO = "+padre.getDato());
            if(padre.getIzquierdo() != null){
                preOrden(padre.getIzquierdo());
                preOrden(padre.getDerecho());
            }
        }
    }

    public void asignaHojas(){
        Nodo temp = raiz;

        while (temp != null && !temp.getTipo().equals("hoja")) {
            if(temp.getIzquierdo() == null){
                System.out.println("LEAF = "+temp.getDato());
                temp.setTipo("hoja");
                temp = temp.getPadre().getDerecho();
            }else {
                temp = temp.getIzquierdo();
            }
        }

        temp = raiz.getDerecho();
        while (temp != null && !temp.getTipo().equals("hoja")) {
            if(temp.getIzquierdo() == null){
                System.out.println("LEAF = "+temp.getDato());
                temp.setTipo("hoja");
                temp = temp.getPadre().getDerecho();
            }else {
                temp = temp.getIzquierdo();
            }
        }
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
