package JAVA.Lista;

public class PrincipalLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.agregar("Argentina");
        lista.agregar("Peru");
        lista.agregar("Brasil");
        lista.agregar("Chile");
        lista.agregar("Uruguay");
        lista.agregar("Colombia");

        System.out.println("Lista original: ");
        lista.imprimir();
        System.out.println("\nLista ordenada: ");
        lista.ordenar();
        lista.imprimir();
        System.out.println("\nLista desordenada: ");
        lista.desordenar();
        lista.imprimir();
        System.out.println("\nPais eliminado 'Chile'");
        lista.eliminar("Chile");
        lista.imprimir();
        System.out.println("\nPais insertado 'Venezuela'");
        lista.insertar(1, "Venezuela");
        lista.imprimir();
        lista.ordenar();
        System.out.println("\nLista recorrido inicio-fin: ");
        lista.recorridoInicioFin();
        System.out.println("\nLista recorrido fin-inicio: ");
        lista.recorridoFinInicio();
    }
}