package Ej6;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ej6{
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        List<String> vertices = new LinkedList<String>();

        System.out.print("Digite el número de vértices del grafo: ");
        int cantidadVertices = key.nextInt();

        for (int i = 0; i < cantidadVertices; i++) {
            System.out.print("Ingrese el valor del vertice ["+(i+1)+"]: ");
            vertices.add(key.next());
        }
        
        int [][] matrizAdyacencia = new int[cantidadVertices][cantidadVertices];

        
        System.out.println("\nESTABLEZCA LA RELACION ENTRE LOS VERTICES");
        System.out.println("*****************************************");
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia[0].length; j++) {
                System.out.print("\t"+vertices.get(i)+" y "+vertices.get(j)+"\n[1 para SI/ 0 para NO]: ");
                int relacion = key.nextInt();
                System.out.println();
                matrizAdyacencia[i][j] = relacion;
            }
        }

        //IMPRIME MATRIZ DE ADYACENCIA
        System.out.println("\nMATRIZ DE ADYACENCIA");
        System.out.println("********************");
        for (int k = 0;  k < vertices.size(); k++) {
            System.out.print("  "+vertices.get(k)+"    ");
        }
        System.out.println("\n-----------------");
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.out.print(vertices.get(i)+"|");
            for (int j = 0; j < matrizAdyacencia[0].length; j++) {
                System.out.print(matrizAdyacencia[i][j]+"\t");
            }
            System.out.println();
        }
    }
}