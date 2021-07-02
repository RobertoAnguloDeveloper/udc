package EstructuraDatos;

import java.util.LinkedList;
import java.util.List;

public class Grafo {
    private int [][] matrizAdyacencia;
    private List<List<Vertice>> listaAdyacencia;
    private int numeroVertices;
    private int numeroAristas;

    public Grafo() {
        listaAdyacencia = new LinkedList<List<Vertice>>();
    }
    
    public Grafo(int numeroVertices){
        this.numeroVertices = numeroVertices;
        listaAdyacencia = new LinkedList<List<Vertice>>();
        matrizAdyacencia = new int[numeroVertices][numeroVertices];
    }

    public void insertarVertice(Vertice vertice, Vertice adyacente){
        vertice.addAyacente(adyacente);
    }

    public void insertarVertice(List<Vertice> adyacentes){
        listaAdyacencia.add(adyacentes);
    }

    public List<List<Vertice>> matrizAdyacenciaToListaAdyacencia(int [][] matrizAdyacencia){
        
        return listaAdyacencia;
    }
}
