package EstructuraDatos;

public class NodoB {
    private int grado;
    private int valor;
    private int numeroClaves;
    private String tipo;
    private NodoB padre;
    private NodoB izquierdo;
    private NodoB derecho;
    private NodoB [] pagina;

    public NodoB(int grado){
        //RECUERDE QUE EL GRADO DEBE SER SUPERIOR A DOS
        this.grado = grado;
        this.numeroClaves = grado - 1;
        pagina = new NodoB[numeroClaves];
    }
    
    public void setGrado(int grado){
        this.grado = grado;
    }

    public int getGrado(){
        return this.grado;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }

    public void setNumeroClaves(int numeroClaves){
        this.numeroClaves = numeroClaves;
    }

    public int getNumeroClaves(){
        return this.numeroClaves;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setPadre(NodoB padre){
        this.padre = padre;
    }

    public NodoB getPadre(){
        return this.padre;
    }

    public void setIzquierdo(NodoB izquierdo){
        this.izquierdo = izquierdo;
    }

    public NodoB getIzquierdo(){
        return this.izquierdo;
    }

    public void setDerecho(NodoB derecho){
        this.derecho = derecho;
    }

    public NodoB getDerecho(){
        return this.derecho;
    }

    public void setPagina(NodoB [] pagina){
        this.pagina = pagina;
    }

    public NodoB [] getPagina(){
        return this.pagina;
    }

}
