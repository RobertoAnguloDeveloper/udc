using System;
using System.Collections.Generic;

namespace Lista
{
    public class Lista
    {
        private List<string> lista;
        public Lista()
        {
            this.lista = new List<string>();
        }

        public void agregar(string pais)
        {
            lista.Add(pais);
        }

        public string buscar(string pais)
        {
            return lista.Find(x => x == pais);
        }

        public void ordenar()
        {
            lista.Sort();
        }

        public void desordenar()
        {
            lista.Reverse();
        }

        public void eliminar(string pais)
        {
            lista.Remove(pais);
        }

        public void insertar(int pos, string pais)
        {
            lista.Insert(pos, pais);
        }

        public void recorridoInicioFin()
        {
            foreach (string item in lista)
            {
                Console.WriteLine(item);
            }
        }

        public void recorridoFinInicio()
        {
            List<string> aux = lista;
            aux.Reverse();
            foreach (string item in aux)
            {
                Console.WriteLine(item);
            }
        }

        public void imprimir()
        {
            foreach (string item in lista)
            {
                Console.WriteLine(item);
            }
        }
    }
}