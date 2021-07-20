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
            Arrays.sort(arrayCola, (Estudiante e1, Estudiante e2) -> e1.getNumeroIdentificacion() - e2.getNumeroIdentificacion());
            arrayToCola();
        }
    }

    public void desordenar() {
        if(cola != null) {
            colaToArray();
            Arrays.sort(arrayCola, (Estudiante e1, Estudiante e2) -> e2.getNumeroIdentificacion() - e1.getNumeroIdentificacion());
            arrayToCola();
        }
    }

    public boolean eliminar(int id) {
        for (Estudiante estudiante : cola) {
            if(estudiante.getNumeroIdentificacion() == id) {
                cola.remove(estudiante);
                size--;
                return true;
            }
        }
        return false;
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
        if(cola != null){
            colaToArray();
            Estudiante [] aux = new Estudiante[arrayCola.length+1];

            if(pos == 0){
                for (int i = 1, j = 0; j < arrayCola.length; i++, j++) {
                    aux[i] = arrayCola[j];
                }
                aux[pos] = e;
            }

            if(pos == arrayCola.length-1){
                for (int i = 0; i < arrayCola.length; i++) {
                    aux[i] = arrayCola[i];
                }
                aux[pos+1] = aux[pos];
                aux[pos] = e;
            }

            if(pos != 0 || pos != size-1){
                Estudiante [] auxIzq = Arrays.copyOfRange(arrayCola, 0, pos);
                Estudiante [] auxDer = Arrays.copyOfRange(arrayCola, pos, arrayCola.length);
                for (int i = 0; i < auxIzq.length; i++) {
                    aux[i] = auxIzq[i];
                }
                aux[pos] = e;
                for (int i = pos+1, j = 0; i < aux.length; i++, j++) {
                    aux[i] = auxDer[j];
                }
            }
            arrayCola = aux;
            size++;
            arrayToCola();
        }else{
            cola.add(e);
            size++;
        }
    }

    public void recorrerInicioFin(){
        if(cola != null){
            for (Estudiante estudiante : cola) {
                System.out.println(estudiante.toString());
                System.out.println("********************************");
            }
        }else{
            System.out.println("La cola esta vacia");
        }
    }

    public void recorrerFinInicio(){
        if(cola != null){
            colaToArray();
            for (int i = size-1; i >= 0; i--) {
                System.out.println(arrayCola[i].toString());
                System.out.println("********************************");
            }
        }else{
            System.out.println("La cola esta vacia");
        }
    }

    public void imprimir(){
        for (Estudiante estudiante : cola) {
            System.out.println(estudiante.toString());
            System.out.println("********************************");
        }
    }

    public int getSize() {
        return size;
    }
}
