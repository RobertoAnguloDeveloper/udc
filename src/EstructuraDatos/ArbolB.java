package EstructuraDatos;

public class ArbolB {
    private int grado;
    private Nodo [] paginaRaiz;

    public ArbolB(int grado) {
        this.grado = grado;
        paginaRaiz = new Nodo[grado-1];
    }

    public void insertar(Nodo nodo) {
        if(paginaRaiz[0] == null){
            paginaRaiz[0] = nodo;
        }
    }

    public Nodo [] getPaginaRaiz() {
        return paginaRaiz;
    }
}
