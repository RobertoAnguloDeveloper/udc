package Ej9;

import java.util.LinkedList;
import java.util.List;

import EstructuraDatos.Grafo;
import EstructuraDatos.Vertice;

public class Ej9 {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        Vertice v1 = new Vertice("A");
        Vertice v2 = new Vertice("B");
        Vertice v3 = new Vertice("C");
        Vertice v4 = new Vertice("D");

        v1.addAyacente(v2);
        v1.addAyacente(v3);
        v2.addAyacente(v3);
        v3.addAyacente(v4);

        List<Vertice> vertices = new LinkedList<Vertice>();
        vertices.add(v1);
        vertices.add(v2);
        vertices.add(v3);
        vertices.add(v4);

        grafo.listaAdyacenciaToMatrizAdyacencia(vertices);
        grafo.imprimirListaDeAdyacencia();
        grafo.imprimirMatrizDeAdyacencia();

        for (Vertice vertex : grafo.recorridoEnProfundidad()) {
            System.out.print(vertex.getValor()+" -> ");
        }
    }
}