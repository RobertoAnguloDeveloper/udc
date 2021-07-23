using System;
using System.Collections.Generic;

namespace Mapa
{
    public class Mapa
    {
        //Instance a Map property
        private Dictionary<string, string> mapa;

        public Mapa()
        {
            mapa = new Dictionary<string, string>();
        }

        public void agregar(string palabra, string significado)
        {
            mapa.Add(palabra, significado);
        }

        public string buscar(string palabra)
        {
            return mapa[palabra];
        }

        public void ordenar()
        {
            var valores = new List<string>(mapa.Keys);
            valores.Sort();
            var newMapa = new Dictionary<string, string>();
            foreach (var valor in valores)
            {
                newMapa.Add(valor, mapa[valor]);
            }
            mapa = newMapa;
        }

        public void desordenar()
        {
            var valores = new List<string>(mapa.Keys);
            valores.Reverse();
            var newMapa = new Dictionary<string, string>();
            foreach (var valor in valores)
            {
                newMapa.Add(valor, mapa[valor]);
            }
            mapa = newMapa;
        }

        public void eliminar(string palabra)
        {
            mapa.Remove(palabra);
        }

        public void insertar(string palabra, string significado)
        {
            mapa.Add(palabra, significado);
        }

        public void recorridoInicioFin()
        {
            foreach (var palabra in mapa)
            {
                Console.WriteLine(palabra.Key+": "+palabra.Value);
            }
        }

        public void recorridoFinInicio()
        {
            //Prints the Dictionary in reverse order
            Dictionary<string, string> aux = new Dictionary<string, string>(mapa);
            aux = mapa;
            var valores = new List<string>(aux.Keys);
            valores.Reverse();
            
            foreach (var valor in valores)
            {
                Console.WriteLine(valor+": "+aux[valor]);
            }

        }

        public void imprimir()
        {
            Console.WriteLine();
            Console.WriteLine("******************************************************");
            Console.WriteLine("*******DICCIONARIO DE LENGUAJES DE PROGRAMACIÓN*******");
            Console.WriteLine("******************************************************");
            foreach (var palabra in mapa)
            {
                Console.WriteLine(palabra.Key+": "+palabra.Value);
            }
            Console.WriteLine("******************************************************");
            Console.WriteLine("*******DICCIONARIO DE LENGUAJES DE PROGRAMACIÓN*******");
            Console.WriteLine("******************************************************");
            Console.WriteLine();
        }
    }
}