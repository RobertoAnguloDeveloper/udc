package JAVA.Arboles;

import java.util.ArrayList;
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

        Optional<Nodo> resultado = arbol.buscar(16);
        if (resultado.isPresent()) {
            System.out.println("El valor 16 esta en el arbol");
        } else {
            System.out.println("El valor 16 no esta en el arbol");
        }
        
        //Implement ordenar()
        arbol.ordenar();
        System.out.println("Arbol ordenado");
        System.out.println("-------------------");
        arbol.inOrden();

        //arbol.desordenar();
        System.out.println("Arbol desordenado");
        System.out.println("-------------------");
        arbol.inOrden();

        //Implement eliminar()
        arbol.eliminar(16);
        System.out.println("Arbol sin 16");
        System.out.println("-------------------");
        arbol.inOrden();

        //Implement insertar()
        arbol.insertar(16);
        System.out.println("Arbol con 16");
        System.out.println("-------------------");
        arbol.inOrden();

        

    }
}
