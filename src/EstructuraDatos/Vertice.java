package EstructuraDatos;

import java.util.LinkedList;
import java.util.List;

public class Vertice {
    private Object valor;
    private int grado;
    private List<Vertice> adyacentes;
    private boolean aislado;
    private boolean visitado;

    public Vertice(Object valor){
        this.valor = valor;
        adyacentes = new LinkedList<Vertice>();
        visitado = false;
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

    public void setVisitado(boolean visitado){
        this.visitado = visitado;
    }

    public boolean getVisitado(){
        return visitado;
    }
}
