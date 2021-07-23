using System;

namespace Mapa
{
    class Program
    {
        static void Main(string[] args)
        {
            Mapa mapa = new Mapa();

        mapa.agregar("Java", "Lenguaje de programación especializado en Programación Orientada a Objetos");
        mapa.agregar("JavaScript", "Lenguaje de programación orientado a objetos y orientado a páginas Web");
        mapa.agregar("PHP", "Lenguaje de programación orientado a objetos y de comunicación con el servidor");
        mapa.agregar("C#", "Lenguaje de programación orientado a objetos, evolución de C++");
        mapa.agregar("C++", "Lenguaje de programación orientado a objetos");
        mapa.agregar("C", "Lenguaje de programación orientado a objetos");
        mapa.agregar("Python", "Lenguaje de programación orientado a objetos");
        mapa.agregar("Ruby", "Lenguaje de programación orientado a objetos");
        mapa.imprimir();

        Console.WriteLine("\nPRESIONE ENTER/INTRO PARA CONTINUAR\n");
        Console.ReadKey();
        Console.WriteLine("************************************************");
        Console.WriteLine("*Buscar una palabra en el mapa*");
        Console.WriteLine("----Palabra a buscar = 'Java'----");
        Console.WriteLine("************************************************");
        String buscar = new String("Java");
        String busqueda = mapa.buscar(buscar);
        if(busqueda != null){
            Console.WriteLine("La palabra " + buscar + " se encuentra en el mapa");
            Console.WriteLine(buscar+": "+busqueda);
        }else{
            Console.WriteLine("La palabra " + buscar + " no se encuentra en el mapa");
        }
        Console.WriteLine("\nPRESIONE ENTER/INTRO PARA CONTINUAR\n");
        Console.ReadKey();

        Console.WriteLine("************************************************");
        Console.WriteLine("*ORDENANDO EL MAPA EN ORDEN ALFABETICO*");
        Console.WriteLine("************************************************");
        mapa.ordenar();
        mapa.imprimir();
        Console.WriteLine("\nPRESIONE ENTER/INTRO PARA CONTINUAR\n");
        Console.ReadKey();

        Console.WriteLine("************************************************");
        Console.WriteLine("*DESORDENANDO EL MAPA*");
        Console.WriteLine("************************************************");
        mapa.desordenar();
        mapa.imprimir();
        Console.WriteLine("\nPRESIONE ENTER/INTRO PARA CONTINUAR\n");
        Console.ReadKey();
        
        Console.WriteLine("************************************************");
        Console.WriteLine("*ELIMINAR UNA PALABRA DEL MAPA*");
        Console.WriteLine("----Palabra a eliminar = 'PHP'----");
        Console.WriteLine("************************************************");
        String eliminar = new String("PHP");
        mapa.eliminar(eliminar);
        mapa.imprimir();
        Console.WriteLine("\nPRESIONE ENTER/INTRO PARA CONTINUAR\n");
        Console.ReadKey();
        
        Console.WriteLine("************************************************");
        Console.WriteLine("*INSERTANDO PALABRAS Y SIGNIFICADO EN EL MAPA*");
        Console.WriteLine("----Palabra a insertar = 'GO'----");
        Console.WriteLine("----Significado de la palabra = 'Lenguaje auspiciado por Google'----");
        Console.WriteLine("************************************************");
        String insertar = new String("GO");
        String significado = new String("Lenguaje auspiciado por Google");
        mapa.insertar(insertar, significado);
        mapa.imprimir();
        Console.WriteLine("\nPRESIONE ENTER/INTRO PARA CONTINUAR\n");
        Console.ReadKey();

        Console.WriteLine("************************************************");
        Console.WriteLine("*RECORRIDO DE INICIO A FIN*");
        Console.WriteLine("************************************************");
        mapa.recorridoInicioFin();
        Console.WriteLine("************************************************");
        Console.WriteLine("\nPRESIONE ENTER/INTRO PARA CONTINUAR\n");
        Console.ReadKey();

        Console.WriteLine("************************************************");
        Console.WriteLine("*RECORRIDO DE FIN A INICIO*");
        Console.WriteLine("************************************************");
        mapa.recorridoFinInicio();
        Console.WriteLine("************************************************");
        Console.WriteLine("\nMUCHAS GRACIAS\n");
        Console.WriteLine("\nPRESIONE ENTER/INTRO PARA CONTINUAR\n");
        Console.ReadKey();
        }
    }
}
