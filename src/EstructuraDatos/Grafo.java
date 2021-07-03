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

    public boolean existeArista(Object verticeA, Object verticeB){
        boolean existe = false;
        for (int i = 0; i < listaAdyacencia.size(); i++) {
            if(listaAdyacencia.get(i).getValor().equals(verticeA)){
                for (int j = 0; j < listaAdyacencia.get(i).getAdyacentes().size(); j++) {
                    if(listaAdyacencia.get(i).getAdyacentes().get(j).getValor().equals(verticeB)){
                        existe = true;
                        return existe;
                    }
                }
            }else{
                existe = false;
            }
        }
        return existe;
    }

    public List<Vertice> getListaAdyacencia() {
        return listaAdyacencia;
    }

    public void imprimir(){
        // IMPRIME MATRIZ DE ADYACENCIA
        System.out.println("\nMATRIZ DE ADYACENCIA");
        System.out.println("********************");
        for (int k = 0; k < listaAdyacencia.size(); k++) {
            System.out.print("  " + listaAdyacencia.get(k).getValor() + "    ");
        }
        System.out.println("\n-----------------");
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.out.print(listaAdyacencia.get(i).getValor() + "|");
            for (int j = 0; j < matrizAdyacencia[0].length; j++) {
                System.out.print(matrizAdyacencia[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nLISTA DE ADYACENCIA");
        System.out.println("********************"); 
        for (int i = 0; i < listaAdyacencia.size(); i++){ 
            System.out.print(listaAdyacencia.get(i).getValor() + "|");
            for (int j = 0; j < listaAdyacencia.get(i).getAdyacentes().size(); j++) {
                System.out.print(listaAdyacencia.get(i).getAdyacentes().get(j).getValor() + "\t");
            } 
            System.out.println(); 
        }
        
        for (int i = 0; i < listaAdyacencia.size(); i++) {
            System.out.println("\nVERTICE");
            System.out.println(listaAdyacencia.get(i).getValor());
            System.out.println("ADYACENTES");
            for (int j = 0; j < listaAdyacencia.get(i).getAdyacentes().size(); j++) {
                System.out.print(listaAdyacencia.get(i).getAdyacentes().get(j).getValor()+" \t");
            }
            System.out.println();
        }
    }
}
