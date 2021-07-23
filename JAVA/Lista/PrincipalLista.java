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

        System.out.println("********************");
        System.out.println("Buscando 'Brazil':");
        System.out.println("********************");
        if (lista.buscar("Brazil") != null) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }

        System.out.println("********************");
        System.out.println("Buscando 'Brasil':");
        System.out.println("********************");
        if (lista.buscar("Brasil") != null) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }

        System.out.println("********************");
        System.out.println("Lista original: ");
        System.out.println("********************");
        lista.imprimir();

        System.out.println("********************");
        System.out.println("\nLista ordenada: ");
        System.out.println("********************");
        lista.ordenar();
        lista.imprimir();

        System.out.println("********************");
        System.out.println("\nLista desordenada: ");
        System.out.println("********************");
        lista.desordenar();
        lista.imprimir();

        System.out.println("*************************");
        System.out.println("\nPais eliminado 'Chile'");
        lista.eliminar("Chile");
        System.out.println("*************************");
        lista.imprimir();
        

        System.out.println("******************************");
        System.out.println("\nPais insertado 'Venezuela'");
        lista.insertar(1, "Venezuela");
        System.out.println("******************************");
        lista.imprimir();
        lista.ordenar();

        System.out.println("******************************");
        System.out.println("\nLista recorrido inicio-fin: ");
        lista.recorridoInicioFin();
        System.out.println("******************************");

        System.out.println("******************************");
        System.out.println("\nLista recorrido fin-inicio: ");
        lista.recorridoFinInicio();
        System.out.println("******************************");
    }
}