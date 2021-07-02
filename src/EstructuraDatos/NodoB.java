package EstructuraDatos;

public class NodoB {
    private int grado;
    private int nNodos;
    private int [] valores;
    private int [] claves;
    private int numeroClaves;
    private NodoB [] hijos;
    private int numeroHijos;
    private boolean hoja;

    public NodoB(int grado){
        this.grado = grado;
        this.nNodos = 0;
        numeroClaves = 2*grado - 1;
        numeroHijos = 2*grado;
        claves = new int[numeroClaves];
        valores = new int[numeroClaves];
        hijos = new NodoB[numeroHijos];
    }

    public boolean estaLLeno(){
        return nNodos >= (2 * grado -1);
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
