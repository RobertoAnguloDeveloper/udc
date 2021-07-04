package EstructuraDatos;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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
        numeroVertices++;
        numeroAristas++;
    }

    public List<Vertice> matrizAdyacenciaToListaAdyacencia(int [][] matrizAdyacencia, List<Vertice> vertices){
        numeroVertices = 0;
        numeroVertices = matrizAdyacencia.length;
        this.matrizAdyacencia = matrizAdyacencia;

        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia[0].length; j++) {
                if(matrizAdyacencia[i][j] == 1) {
                    vertices.get(i).addAyacente(vertices.get(j));
                    numeroAristas++;
                }
            }
        }

        listaAdyacencia = vertices;
        return listaAdyacencia;
    }

    public int[][] listaAdyacenciaToMatrizAdyacencia(List<Vertice> vertices){
        this.listaAdyacencia = vertices;
        numeroVertices = 0;
        numeroVertices = listaAdyacencia.size();
        matrizAdyacencia = new int[vertices.size()][vertices.size()];
        Object[] indicesVectices = new Object[vertices.size()];

        for (int i = 0; i < indicesVectices.length; i++) {
            indicesVectices[i] = vertices.get(i).getValor();
        }
        
        //INICIALIZANDO MATRIZ EN 0
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia[0].length; j++) {
                matrizAdyacencia[i][j] = 0;
            }
        }

        for (int i = 0; i < listaAdyacencia.size(); i++) {
            Vertice temp = listaAdyacencia.get(i);
            for (int j = 0; j < listaAdyacencia.get(i).getAdyacentes().size(); j++) {
                if(existeArista(temp.getValor(), listaAdyacencia.get(i).getAdyacentes().get(j).getValor())){
                    for(int k = 0; k < indicesVectices.length; k++){
                        if(temp.getValor().equals(indicesVectices[k])){
                            for(int l = 0; l < indicesVectices.length; l++){
                                if(listaAdyacencia.get(i).getAdyacentes().get(j).getValor().equals(indicesVectices[l])){
                                    matrizAdyacencia[k][l] = 1;
                                    numeroAristas++;
                                }
                            }
                        }
                    }
                }
            }
        }
            
        return matrizAdyacencia;
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

    public boolean esConexo(){
        int [] contador = new int[matrizAdyacencia.length];
        int sumatoria = 0;
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia.length; j++) {
                if(i != j){
                    sumatoria += matrizAdyacencia[i][j];
                }
            }
            contador[i] = sumatoria;
            sumatoria = 0;
        }

        for (int i = 0; i < contador.length; i++) {
            sumatoria += contador[i];
        }

        return sumatoria >= matrizAdyacencia.length;
    }

    public int esEuleriano(){
        if(numeroAristas % 2 == 0 && esConexo()){
            return 1;
        }else{
            return 0;
        }
    }

    public int esHamiltoniano(){
        int contador = 0;
        for (int i = 0; i < listaAdyacencia.size(); i++) {
            if(listaAdyacencia.get(i).getGrado() >= numeroVertices/2){
                contador++;
            }
        }

        if(contador == numeroVertices){
            return 1;
        }else{
            return 0;
        }
    }

    public List<Vertice> recorridoEnProfundidad(){
        List<Vertice> recorrido = new LinkedList<Vertice>();
        Stack<Vertice> stack = new Stack<Vertice>();

        if(listaAdyacencia != null){
            stack.push(listaAdyacencia.get(0));
            while(stack.size() > 0){
                Vertice temp = stack.pop();
                recorrido.add(temp);
                if(temp.getVisitado() == false){
                    temp.setVisitado(true);
                    for (int i = 0; i < temp.getAdyacentes().size(); i++) {
                        stack.push(temp.getAdyacentes().get(i));
                    }
                }
            }
        }

        return recorrido;
    }

    public void imprimirMatrizDeAdyacencia(){
        numeroVertices = matrizAdyacencia.length;
        // IMPRIME MATRIZ DE ADYACENCIA
        System.out.println("\nMATRIZ DE ADYACENCIA");
        System.out.println("********************");
        for (int k = 0; k < listaAdyacencia.size(); k++) {
            System.out.print("  " + listaAdyacencia.get(k).getValor() + "    ");
        }
        
        System.out.println();
        for (int i = 0; i < numeroVertices; i++) {
            System.out.print("-------");
        }
        System.out.println();

        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.out.print(listaAdyacencia.get(i).getValor() + "|");
            for (int j = 0; j < matrizAdyacencia[0].length; j++) {
                System.out.print(matrizAdyacencia[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void imprimirListaDeAdyacencia() {
        System.out.println("\nLISTA DE ADYACENCIA");
        System.out.println("********************"); 
        for (int i = 0; i < listaAdyacencia.size(); i++){ 
            System.out.print(listaAdyacencia.get(i).getValor() + "|");
            for (int j = 0; j < listaAdyacencia.get(i).getAdyacentes().size(); j++) {
                System.out.print(listaAdyacencia.get(i).getAdyacentes().get(j).getValor() + "\t");
            } 
            System.out.println();
        }
    }

    public void imprimirGrafo() {
        for (int i = 0; i < listaAdyacencia.size(); i++) {
            System.out.println("\nVERTICE");
            System.out.println(listaAdyacencia.get(i).getValor());
            System.out.println("ADYACENTES");
            for (int j = 0; j < listaAdyacencia.get(i).getAdyacentes().size(); j++) {
                System.out.print(listaAdyacencia.get(i).getAdyacentes().get(j).getValor()+" \t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void setListaAdyacencia(List<Vertice> listaAdyacencia) {
        this.listaAdyacencia = listaAdyacencia;
    }

    public List<Vertice> getListaAdyacencia() {
        return listaAdyacencia;
    }
}
