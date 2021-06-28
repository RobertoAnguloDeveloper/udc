import EstructuraDatos.ArbolBinario;
import EstructuraDatos.Nodo;

public class Pruebas {
    public static void main(String[] args) throws Exception {
        Nodo nodo1 = new Nodo('K');
        Nodo nodo2 = new Nodo('B');
        Nodo nodo3 = new Nodo('W');
        Nodo nodo4 = new Nodo('A');
        Nodo nodo5 = new Nodo('F');
        Nodo nodo6 = new Nodo('M');
        Nodo nodo7 = new Nodo('Z');
        Nodo nodo8 = new Nodo('D');
        Nodo nodo9 = new Nodo('L');
        Nodo nodo10 = new Nodo('O');
        Nodo nodo11 = new Nodo('P');
        ArbolBinario arbol = new ArbolBinario();

        arbol.agregarNodo(nodo1, null);
        arbol.agregarNodo(nodo2, nodo1);
        arbol.agregarNodo(nodo3, nodo1);
        arbol.agregarNodo(nodo4, nodo2);
        arbol.agregarNodo(nodo5, nodo2);
        arbol.agregarNodo(nodo6, nodo3);
        arbol.agregarNodo(nodo7, nodo3);
        arbol.agregarNodo(nodo8, nodo5);
        arbol.agregarNodo(nodo9, nodo6);
        arbol.agregarNodo(nodo10, nodo6);
        arbol.agregarNodo(nodo11, nodo10);

        //System.out.println("PADRE DE B = "+nodo2.getPadre().getDato());
        arbol.preOrden(nodo1);
    }
}
