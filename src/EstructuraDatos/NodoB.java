package EstructuraDatos;

public class NodoB {
    private int grado;
    private int [] claves;
    private int numeroClaves;
    private NodoB [] hijos;
    private int numeroHijos;

    public NodoB() {
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getGrado() {
        return this.grado;
    }

    public void setClaves(int[] claves){
        this.claves = claves;
    }

    public int[] getClaves() {
        return this.claves;
    }

    public void setNumeroClaves(int numeroClaves){
        this.numeroClaves = numeroClaves;
    }

    public int getNumeroClaves() {
        return this.numeroClaves;
    }

    public void setHijos(NodoB [] hijos){
        this.hijos = hijos;
    }

    public NodoB [] getHijos() {
        return this.hijos;
    }

    public void setNumeroHijos(int numeroHijos){
        this.numeroHijos = numeroHijos;
    }

    public int getNumeroHijos() {
        return this.numeroHijos;
    }
}
