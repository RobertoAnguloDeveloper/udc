package EstructuraDatos;

public class NodoB {
    private int grado;
    private int numeroClaves;
    private int numeroHijos;
    private String tipo;
    private Nodo [] pagina;
    private NodoB [] hijos;

    public NodoB(int grado){
        //RECUERDE QUE EL GRADO DEBE SER SUPERIOR A DOS
        this.grado = grado;
        this.numeroClaves = grado - 1;
        this.numeroHijos = grado;
        pagina = new Nodo[numeroClaves];
        hijos = new NodoB[numeroHijos];
    }
    
    public void setGrado(int grado){
        this.grado = grado;
    }

    public int getGrado(){
        return this.grado;
    }

    public void setNumeroClaves(int numeroClaves){
        this.numeroClaves = numeroClaves;
    }

    public int getNumeroClaves(){
        return this.numeroClaves;
    }

    public void setNumeroHijos(int numeroHijos){
        this.numeroHijos = numeroHijos;
    }

    public int getNumeroHijos(){
        return this.numeroHijos;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setPagina(Nodo [] pagina){
        this.pagina = pagina;
    }

    public Nodo [] getPagina(){
        return this.pagina;
    }

    public void setHijos(NodoB [] hijos){
        this.hijos = hijos;
    }

    public NodoB [] getHijos(){
        return this.hijos;
    }
}
