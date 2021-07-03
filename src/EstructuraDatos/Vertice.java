package EstructuraDatos;

import java.util.LinkedList;
import java.util.List;

public class Vertice {
    private Object valor;
    private int grado;
    private int indiceEnMatriz;
    private List<Vertice> adyacentes;
    private boolean aislado;

    public Vertice(Object valor){
        this.valor = valor;
        adyacentes = new LinkedList<Vertice>();
    }

    public void setValor(Object valor){
        this.valor = valor;
    }

    public Object getValor(){
        return valor;
    }

    public void setGrado(int grado){
        this.grado = grado;
    }

    public int getGrado(){
        return grado;
    }

    public void setIndiceEnMatriz(int indiceEnMatriz){
        this.indiceEnMatriz = indiceEnMatriz;
    }

    public int getIndiceEnMatriz(){
        return indiceEnMatriz;
    }

    public void setAyacentes(List<Vertice> adyacentes){
        this.adyacentes = adyacentes;
    }

    public void addAyacente(Vertice vertice){
        adyacentes.add(vertice);
        grado++;
    }

    public List<Vertice> getAdyacentes(){
        return adyacentes;
    }

    public void setAislado(boolean aislado){
        this.aislado = aislado;
    }

    public boolean getAislado(){
        return aislado;
    }
}
