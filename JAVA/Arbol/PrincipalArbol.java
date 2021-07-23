package JAVA.Arbol;

import java.util.Optional;

public class PrincipalArbol {
    public static void main(String[] args) {
        Nodo arbol = new Nodo();

        arbol.agregar(10);
        arbol.agregar(2);
        arbol.agregar(5);
        arbol.agregar(1);
        arbol.agregar(3);
        arbol.agregar(4);
        arbol.agregar(16);
        arbol.agregar(8);
        arbol.agregar(7);
        arbol.agregar(6);

        System.out.println("-------------------");
        System.out.println("BUSCANDO EL VALOR 16: ");
        System.out.println("-------------------");
        Optional<Nodo> resultado = arbol.buscar(16);
        if (resultado.isPresent()) {
            System.out.println("El valor 16 esta en el arbol");
        } else {
            System.out.println("El valor 16 no esta en el arbol");
        }
        
        arbol.ordenar();
        System.out.println("-------------------");
        System.out.println("Arbol ordenado");
        System.out.println("-------------------");
        arbol.inOrden();

        arbol.eliminar(16);
        System.out.println("---------------");
        System.out.println("Arbol sin 16");
        System.out.println("---------------");
        arbol.inOrden();

        arbol.desordenar();
        System.out.println("-------------------");
        System.out.println("Arbol desordenado");
        System.out.println("-------------------");
        arbol.inOrden();

        arbol.insertar(2, 36);
        System.out.println("-------------------------------");
        System.out.println("Insertado 36 en la posición 2");
        System.out.println("-------------------------------");
        arbol.inOrden();

        System.out.println("-------------------------------");
        System.out.println("Recorrido de inicio a fin");
        System.out.println("-------------------------------");
        arbol.inOrden();

        arbol.ordenar();
        System.out.println("-------------------------------");
        System.out.println("Recorrido de fin a inicio");
        System.out.println("-------------------------------");
        arbol.inOrden();
    }
}
