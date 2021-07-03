package Ej8;

import java.util.LinkedList;
import java.util.List;

import EstructuraDatos.Grafo;
import EstructuraDatos.Vertice;

public class Ej8 {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        Vertice v1 = new Vertice("A");
        Vertice v2 = new Vertice("B");
        Vertice v3 = new Vertice("C");

        v1.addAyacente(v2);
        v1.addAyacente(v3);
        v2.addAyacente(v3);
        v2.addAyacente(v1);
        v3.addAyacente(v2);
        v3.addAyacente(v1);

        List<Vertice> vertices = new LinkedList<Vertice>();
        vertices.add(v1);
        vertices.add(v2);
        vertices.add(v3);

        

    }
}
