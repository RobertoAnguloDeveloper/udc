package Ej6;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import EstructuraDatos.Grafo;
import EstructuraDatos.Vertice;

public class Ej6 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        List<Vertice> vertices = new LinkedList<Vertice>();

        System.out.print("Digite el número de vértices del grafo: ");
        int cantidadVertices = key.nextInt();

        Grafo grafo = new Grafo();

        for (int i = 0; i < cantidadVertices; i++) {
            System.out.print("Ingrese el valor del vertice [" + (i + 1) + "]: ");
            vertices.add(new Vertice(key.next()));
        }

        int[][] matrizAdyacencia = new int[cantidadVertices][cantidadVertices];

        System.out.println("\nESTABLEZCA LA RELACION ENTRE LOS VERTICES");
        System.out.println("*****************************************");
        int relacion = 0;
        boolean loop = false;
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia[0].length; j++) {
                do {
                    System.out.print("\tDe " + vertices.get(i).getValor() + " -> " + vertices.get(j).getValor()
                                + "\n[1 para SI || 0 para NO]: ");
                    try {
                        relacion = key.nextInt();
                        if (relacion != 0 && relacion != 1) {
                            System.out.println("\n*******************ERROR*********************" 
                                            + "\n<-------------SOLO NUMEROS, 0 o 1-------------> \n");
                            loop = true;
                        } else {
                            loop = false;
                        }
                    } catch (NumberFormatException | InputMismatchException err) {
                        System.out.println("\n*******************ERROR*********************" 
                                            + "\n<-------------SOLO NUMEROS, 0 o 1-------------> \n");
                        loop = true;
                        key = new Scanner(System.in);
                    }
                } while (loop);

                vertices.get(i).setIndiceEnMatriz(i);
                System.out.println();
                matrizAdyacencia[i][j] = relacion;
            }
        }

        grafo.matrizAdyacenciaToListaAdyacencia(matrizAdyacencia, vertices);

        // IMPRIME MATRIZ DE ADYACENCIA
        System.out.println("\nMATRIZ DE ADYACENCIA");
        System.out.println("********************");
        for (int k = 0; k < vertices.size(); k++) {
            System.out.print("  " + vertices.get(k).getValor() + "    ");
        }
        System.out.println("\n-----------------");
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.out.print(vertices.get(i).getValor() + "|");
            for (int j = 0; j < matrizAdyacencia[0].length; j++) {
                System.out.print(matrizAdyacencia[i][j] + "\t");
            }
            System.out.println();
        }

        // System.out.println("VERTICE["+grafo.getListaAdyacencia().get(0).get(0).getValor()+"]
        // ADYACENTE ["+"]: ");
        System.out.println("\nLISTA DE ADYACENCIA");
        System.out.println("********************"); 
        for (int i = 0; i < grafo.getListaAdyacencia().size(); i++){ 
            System.out.print(grafo.getListaAdyacencia().get(i).getValor() + "|");
            for (int j = 0; j < grafo.getListaAdyacencia().get(i).getAdyacentes().size(); j++) {
                System.out.print(grafo.getListaAdyacencia().get(i).getAdyacentes().get(j).getValor() + "\t");
            } 
            System.out.println(); 
        }
         
    }
}