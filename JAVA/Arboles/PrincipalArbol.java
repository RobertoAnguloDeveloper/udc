package JAVA.Arboles;

public class PrincipalArbol {
    //Implement the main method using the class ArbolBinario as an int Binary tree
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.agregar(0, 1);
        arbol.agregar(1, 2);
        arbol.agregar(2, 10);
        arbol.agregar(3, 5);
        arbol.agregar(4, 3);
        arbol.agregar(5, 4);
        arbol.agregar(6, 60);

        //Use recorridoInicioFin to print the tree
        arbol.imprimir();
        arbol.ordenar();
        arbol.imprimir();
        arbol.desordenar();
        arbol.imprimir();
        System.out.println("Search: " + arbol.buscar(10));
        arbol.eliminar(10);
        System.out.println("Search: " + arbol.buscar(2));

    }
     
}
