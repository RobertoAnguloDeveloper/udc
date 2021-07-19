package JAVA.Cola;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    //Construye los siguientes métodos implementando una Queu tipo Estudiante:
    //agregar
    //buscar
    //ordenar
    //desordenar
    //eliminar
    //insertar
    //recorrerInicioFin
    //recorrerFinInicio
    //imprimir
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

    public boolean buscar(int id) {
        if (id >= 0 && id < this.size) {
            for (int i = 0; i < size; i++) {
                if(cola.poll().getNumeroIdentificacion() == id){
                    return true;
                }
            }
        }
        return false;
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
        if (pos >= 0 && pos < this.size) {
            for (int i = 0; i < size; i++) {
                
            }
        }
    }


}
