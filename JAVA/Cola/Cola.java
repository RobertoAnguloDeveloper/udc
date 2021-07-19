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
        colaToArray();
        for (int i = 0; i < arrayCola.length; i++) {
            if (arrayCola[i].getNumeroIdentificacion() == id) {
                return arrayCola[i];
            }
        }
        return null;
    }

    public void ordenar() {
        if(cola != null) {
            colaToArray();
            //Ordena de menor a mayor la cola por numeroIdentificacion
            Arrays.sort(arrayCola, (Estudiante e1, Estudiante e2) -> e1.getNumeroIdentificacion() - e2.getNumeroIdentificacion());
            arrayToCola();
        }
    }

    public void desordenar() {
        if(cola != null) {
            colaToArray();
            //Ordena de mayor a menor la cola por numeroIdentificacion
            Arrays.sort(arrayCola, (Estudiante e1, Estudiante e2) -> e2.getNumeroIdentificacion() - e1.getNumeroIdentificacion());
            arrayToCola();
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
            arrayCola[i] = cola.poll();
        }
        arrayToCola();
        return arrayCola;
    }

    public void arrayToCola() {
        if(arrayCola != null){
            cola.clear();
        }else if(cola != null){
            colaToArray();
            cola.clear();
        }
        
        for (int i = 0; i < arrayCola.length; i++) {
            this.cola.add(arrayCola[i]);
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
        arrayToCola();
    }

    public void imprimir(){
        for (Estudiante estudiante : cola) {
            System.out.println(estudiante.toString());
        }
    }
}
