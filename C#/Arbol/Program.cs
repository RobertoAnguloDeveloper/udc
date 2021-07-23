using System;

namespace Arbol
{
    class Program
    {
        static void Main(string[] args)
        {
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

            Console.WriteLine("-------------------");
            Console.WriteLine("BUSCANDO EL VALOR 16: ");
            Console.WriteLine("-------------------");
            int resultado = arbol.buscar(16);
            if (resultado != 0)
            {
                Console.WriteLine("El valor 16 esta en el arbol");
            }
            else
            {
                Console.WriteLine("El valor 16 no esta en el arbol");
            }

            arbol.ordenar();
            Console.WriteLine("-------------------");
            Console.WriteLine("Arbol ordenado");
            Console.WriteLine("-------------------");
            arbol.inOrden();

            arbol.eliminar(16);
            Console.WriteLine("---------------");
            Console.WriteLine("Arbol sin 16");
            Console.WriteLine("---------------");
            arbol.inOrden();

            arbol.desordenar();
            Console.WriteLine("-------------------");
            Console.WriteLine("Arbol desordenado");
            Console.WriteLine("-------------------");
            arbol.inOrden();

            arbol.insertar(2, 36);
            Console.WriteLine("-------------------------------");
            Console.WriteLine("Insertado 36 en la posición 2");
            Console.WriteLine("-------------------------------");
            arbol.inOrden();

            Console.WriteLine("-------------------------------");
            Console.WriteLine("Recorrido de inicio a fin");
            Console.WriteLine("-------------------------------");
            arbol.inOrden();

            arbol.ordenar();
            Console.WriteLine("-------------------------------");
            Console.WriteLine("Recorrido de fin a inicio");
            Console.WriteLine("-------------------------------");
            arbol.inOrden();
        }
    }
}
