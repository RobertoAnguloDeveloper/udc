using System;

namespace Lista
{
    class Program
    {
        static void Main(string[] args)
        {
            Lista lista = new Lista();
            lista.agregar("Argentina");
            lista.agregar("Peru");
            lista.agregar("Brasil");
            lista.agregar("Chile");
            lista.agregar("Uruguay");
            lista.agregar("Colombia");

            Console.WriteLine("Lista original: ");
            lista.imprimir();
            Console.WriteLine("\nLista ordenada: ");
            lista.ordenar();
            lista.imprimir();
            Console.WriteLine("\nLista desordenada: ");
            lista.desordenar();
            lista.imprimir();
            Console.WriteLine("\nPais eliminado 'Chile'");
            lista.eliminar("Chile");
            lista.imprimir();
            Console.WriteLine("\nPais insertado 'Venezuela'");
            lista.insertar(1, "Venezuela");
            lista.imprimir();
            lista.ordenar();
            Console.WriteLine("\nLista recorrido inicio-fin: ");
            lista.recorridoInicioFin();
            Console.WriteLine("\nLista recorrido fin-inicio: ");
            lista.recorridoFinInicio();
        }
    }
}
