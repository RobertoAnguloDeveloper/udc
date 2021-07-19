package JAVA.Cola;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private Queue<Estudiante> cola;
    private Estudiante[] arrayCola;
    private int size;

    public Cola() {
        this.cola = new LinkedList<>();
        this.size = 0;
    }

    public void agregar(Estudiante e) {
        this.cola.add(e);
        this.size++;
    }

    public Estudiante buscar(int id) {
        for (int i = 0; i < size; i++) {
            if(cola.poll().getNumeroIdentificacion() == id){
                return cola.element();
            }
        }
        return null;
    }

    public void ordenar() {
        Estudiante aux;
        for (int i = 0; i < this.size - 1; i++) {
            for (int j = 0; j < this.size - 1; j++) {
                if (this.cola.poll().getNumeroIdentificacion() > this.cola.poll().getNumeroIdentificacion()) {
                    aux = this.cola.poll();
                    this.cola.add(aux);
                }
            }
        }
    }

    public void desordenar() {
        Estudiante aux;
        for (int i = 0; i < this.size - 1; i++) {
            for (int j = 0; j < this.size - 1; j++) {
                if (this.cola.poll().getNumeroIdentificacion() < this.cola.poll().getNumeroIdentificacion()) {
                    aux = this.cola.poll();
                    this.cola.add(aux);
                }
            }
        }
    }

    public void eliminar(int id) {
        if (id >= 0 && id < this.size) {
            for (int i = 0; i < size; i++) {
                if(cola.poll().getNumeroIdentificacion() == id){
                    this.cola.remove();
                    this.size--;
                }
            }
        }
    }

    public Estudiante[] colaToArray() {
        arrayCola = new Estudiante[size];
        for (int i = 0; i < size; i++) {
            arrayCola[i] = this.cola.poll();
        }
        return arrayCola;
    }

    public void arrayToCola(Estudiante[] array) {
        if(array != null){
            cola.clear();
        }
        
        for (int i = 0; i < array.length; i++) {
            this.cola.add(array[i]);
        }
    }


    public void insertar(int pos, Estudiante e) {
        colaToArray();
        Estudiante [] aux = new Estudiante[size + 1];
        Estudiante [] auxIzq = Arrays.copyOfRange(arrayCola, 0, pos-1);
        Estudiante [] auxDer = Arrays.copyOfRange(arrayCola, pos+1, arrayCola.length-1);

        if(pos == 0){
            aux[pos] = e;
            for (int i = pos+1, j = 0; i < aux.length; i++, j++) {
                aux[i] = auxDer[j];
            }
        }

        if(pos == arrayCola.length-1){
            aux[pos] = e;
            for (int i = 0, j = 0; i < aux.length-1; i--, j++) {
                aux[i] = auxIzq[j];
            }
        }

        if(pos != 0 || pos != size-1){
            for (int i = 0; i < auxIzq.length; i++) {
                aux[i] = auxIzq[i];
            }

            for (int i = 0, j = pos+1; i < auxDer.length; i++, j++) {
                aux[j] = auxDer[i];
            }
        }
        aux[pos] = e;
        arrayToCola(aux);
    }

    public void imprimir(){
        for(int i = 0; i < size; i++){
            System.out.println(cola.poll());
        }
    }
}
