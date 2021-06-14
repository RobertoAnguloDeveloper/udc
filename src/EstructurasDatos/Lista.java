/*
CLASE DISEÑADA PARA TODOS LOS EJERCICIOS DE LA ACTIVIDAD DE APRENDIZAJE UNIDAD 3
ESTRUCTURA DE DATOS
 */

package EstructurasDatos;

import javax.swing.JOptionPane;

public class Lista{
    private Nodo [] lista;
    private Nodo nodoTope;
    private Nodo cabeza;
    private int size;
    
    public Lista(){
        nodoTope = null;
        size = 0;
    }
    
    public void agregar(Nodo nodo){
        if(size == 0){
            nodo.setAnterior(null);
            nodo.setSiguiente(null);
            cabeza = nodo;
            nodoTope = cabeza;
            size++;
        }else{
            nodo.setAnterior(nodoTope);
            nodo.setSiguiente(null);
            nodoTope.setSiguiente(nodo);
            nodoTope = nodo;
            size++;
        }
    }
    
    public void insertar(Nodo nodo, Object valorNodoAnterior){
        Nodo temp = cabeza;
        int contador = 0;
        boolean noEncontrado = true;
        while(temp != null){
            if((temp.getDato()+"").equals(valorNodoAnterior)){
                if(contador == 0){
                    nodo.setAnterior(null);
                    nodo.setSiguiente(cabeza);
                    cabeza.setAnterior(nodo);
                    cabeza = nodo;
                }else{
                    nodo.setAnterior(temp.getAnterior());
                    temp.getAnterior().setSiguiente(nodo);
                    nodo.setSiguiente(temp);
                    temp.setAnterior(nodo);
                }
                noEncontrado = false;
            }
            temp = temp.getSiguiente();
            contador++;
        }
        
        if(noEncontrado){
            JOptionPane.showMessageDialog(null, "NODO NO ENCONTRADO", "AVISO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Lista invertirLista(Nodo [] lista, Lista listaInvertida, int posicionFinal){
        if(posicionFinal >= 0){
            listaInvertida.agregar(lista[posicionFinal]);
            listaInvertida = invertirLista(lista, listaInvertida, posicionFinal-1);
        }
        return listaInvertida;
    }
    
    public Nodo [] toArray(){
        lista = new Nodo[size];
        
        int i = 0;
        while(cabeza != null){
            lista[i] = cabeza;
            cabeza = cabeza.getSiguiente();
            i++;
        }
        
        return lista;
    }
    
    public boolean buscar(Object valor){
        boolean encontrado = false;
        if(!listaVacia()){
            String dato = String.valueOf(valor);
            
            for (int i = lista.length-1; i >= 0; i--) {
                if(String.valueOf(lista[i].getDato()).equals(dato)){
                    System.out.println("NODO ENCONTRADO EN LA POSICION ["+i+"]");
                    encontrado = true;
                }
            }
            
            if(!encontrado){
                System.out.println("NODO NO ENCONTRADO");
            }
        }else
            System.out.println("NO SE PUEDE BUSCAR, LISTA VACIA");
        
        return encontrado;
    }
    
    public String imprimir(){
        Nodo temp = cabeza;
        String listaString =  "";
        int nodoPos = 0;
        
        while(temp != null){
            if(nodoPos < size){
                if(nodoPos == size-1){
                    System.out.print("["+temp.getDato()+"]");
                    listaString += "["+temp.getDato()+"]";
                    nodoPos++;
                }else{
                    System.out.print("["+temp.getDato()+"]-");
                    listaString += "["+temp.getDato()+"]-";
                    nodoPos++;
                }
            }else{
                System.out.print("-["+temp.getDato()+"]");
                listaString += "-["+temp.getDato()+"]";
            }
            temp = temp.getSiguiente();
        }
        
        System.out.println("");
        return listaString;
    }
    
    public String toString(){
        String listaString = "";
        
        for (int i = 0; i < lista.length; i++) {
            listaString += lista[i].getDato()+"\n";
        }
        
        return listaString;
    }
    
    public boolean listaVacia(){
        return size == 0;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
        
    public Nodo[] getLista() {
        return lista;
    }

    public void setLista(Nodo[] lista) {
        this.lista = lista;
    }

    public Nodo getNodoTope() {
        return nodoTope;
    }

    public void setNodoTope(Nodo nodoTope) {
        this.nodoTope = nodoTope;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}