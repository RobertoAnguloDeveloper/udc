package EstructuraDatos;

public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario(){
        raiz = null;
    }
    
    public void agregarNodo(Nodo nodo, Nodo padre){
        Nodo temp = padre;
        
        if(raiz == null){
            raiz = nodo;
        }else if(temp.getIzquierdo() != null){
            nodo.setPadre(temp);
            temp.setDerecho(nodo);
            }else {
                nodo.setPadre(padre);
                temp.setIzquierdo(nodo);
            }
    }

    public void imprimir(){
        Nodo temp;
        int nivel = 1;

        System.out.println("RAIZ"
                            +"\n*****"
                            +"\n"+raiz.getDato());
        System.out.println("SUBARBOL IZQUIERDO"
                            +"\n*****************");
        temp = raiz.getIzquierdo();
        while(temp != null){
            System.out.println("NIVEL-->"+nivel
                            +"\n*****************");
            
            System.out.println("IZQ "+temp.getDato());
            if(temp.getDerecho() != null){
                System.out.println("DER "+temp.getDerecho().getDato());
            }
            nivel++;
            temp = temp.getIzquierdo();
        }
    }
    
    public Nodo getRaiz(){
        return raiz;
    }
}
