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

            Console.WriteLine("********************************");
            Console.WriteLine("Buscando 'Brazil': ");
            Console.WriteLine("********************************");
            if(lista.buscar("Brazil") != null){
                Console.WriteLine("Encontrado");
            }else{
                Console.WriteLine("No encontrado");
            }

            Console.WriteLine("********************************");
            Console.WriteLine("Buscando 'Brasil': ");
            Console.WriteLine("********************************");
            if(lista.buscar("Brasil") != null){
                Console.WriteLine("Encontrado");
            }else{
                Console.WriteLine("No encontrado");
            }

            Console.WriteLine("********************************");
            Console.WriteLine("Lista original: ");
            Console.WriteLine("********************************");
            lista.imprimir();

            Console.WriteLine("********************************");
            Console.WriteLine("\nLista ordenada: ");
            Console.WriteLine("********************************");
            lista.ordenar();
            lista.imprimir();

            Console.WriteLine("********************************");
            Console.WriteLine("\nLista desordenada: ");
            Console.WriteLine("********************************");
            lista.desordenar();
            lista.imprimir();

            Console.WriteLine("********************************");
            Console.WriteLine("\nPais eliminado 'Chile'");
            lista.eliminar("Chile");
            Console.WriteLine("********************************");
            lista.imprimir();

            Console.WriteLine("********************************");
            Console.WriteLine("\nPais insertado 'Venezuela'");
            lista.insertar(1, "Venezuela");
            Console.WriteLine("********************************");
            lista.imprimir();
            lista.ordenar();

            Console.WriteLine("********************************");
            Console.WriteLine("\nLista recorrido inicio-fin: ");
            Console.WriteLine("********************************");
            lista.recorridoInicioFin();

            Console.WriteLine("********************************");
            Console.WriteLine("\nLista recorrido fin-inicio: ");
            Console.WriteLine("********************************");
            lista.recorridoFinInicio();
        }
    }
}
