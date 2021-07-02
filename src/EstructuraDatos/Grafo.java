package EstructuraDatos;

import java.util.LinkedList;
import java.util.List;

public class Grafo {
    private int [][] matrizAdyacencia;
    private List<Vertice> listaAdyacencia;
    private int numeroVertices;
    private int numeroAristas;

    public Grafo() {
        listaAdyacencia = new LinkedList<Vertice>();
    }
    
    public Grafo(int numeroVertices){
        this.numeroVertices = numeroVertices;
        listaAdyacencia = new LinkedList<Vertice>();
        matrizAdyacencia = new int[numeroVertices][numeroVertices];
    }

    public void insertarVertice(Vertice vertice, Vertice adyacente){
        vertice.addAyacente(adyacente);
        listaAdyacencia.add(vertice);
    }

    public List<Vertice> matrizAdyacenciaToListaAdyacencia(int [][] matrizAdyacencia, List<Vertice> vertices){
        this.matrizAdyacencia = matrizAdyacencia;
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia[0].length; j++) {
                if(matrizAdyacencia[i][j] == 1) {
                   vertices.get(i).addAyacente(vertices.get(j));
                }
            }
        }
        listaAdyacencia = vertices;
        return listaAdyacencia;
    }

    public List<Vertice> getListaAdyacencia() {
        return listaAdyacencia;
    }

    public void imprimir(){

    }
}
