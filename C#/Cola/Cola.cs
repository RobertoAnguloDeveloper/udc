using System;
using System.Collections.Generic;

namespace Cola
{
    public class Cola
    {
        private Queue<Estudiante> cola;
        private List<Estudiante> listaCola;
        private int size;

        public Cola()
        {
            this.cola = new Queue<Estudiante>();
            this.listaCola = new List<Estudiante>();
            this.size = 0;
        }

        public void agregar(Estudiante e)
        {
            this.cola.Enqueue(e);
            this.size++;
        }

        public Estudiante buscar(int id)
        {
            colaToList();
            for (int i = 0; i < listaCola.Count; i++)
            {
                if (listaCola[i].NumeroIdentificacion == id)
                {
                    return listaCola[i];
                }
            }
            return null;
        }

        public void ordenar()
        {
            if (cola != null)
            {
                colaToList();
                Estudiante [] arrayCola = listaCola.ToArray();
                Array.Sort(arrayCola, (Estudiante x, Estudiante y) => x.NumeroIdentificacion.CompareTo(y.NumeroIdentificacion));
                arrayToCola(arrayCola);
            }
        }

        public void desordenar()
        {
            if (cola != null)
            {
                colaToList();
                Estudiante [] arrayCola = listaCola.ToArray();
                Array.Sort(arrayCola, (Estudiante e1, Estudiante e2)=>e2.NumeroIdentificacion - e1.NumeroIdentificacion);
                arrayToCola(arrayCola);
            }
        }

        public Boolean eliminar(int id)
        {
            colaToList();
            for (int i = 0; i < listaCola.Count; i++)
            {
                if (listaCola[i].NumeroIdentificacion == id)
                {
                    listaCola.RemoveAt(i);
                    size--;
                    listToCola();
                    return true;
                }
            }
            return false;
        }

        public void colaToList()
        {
            listaCola.Clear();
            foreach (Estudiante estudiante in cola)
            {
                listaCola.Add(estudiante);
            }
        }

        public void listToCola(){
            cola.Clear();
            foreach (Estudiante estudiante in listaCola)
            {
                cola.Enqueue(estudiante);
            }
        }

        public void arrayToCola(Estudiante [] array)
        {
            cola.Clear();
            for (int i = 0; i < array.Length; i++)
            {
                cola.Enqueue(array[i]);
            }
        }

        public void insertar(int pos, Estudiante e)
        {
            if (pos >= 0 && pos <= cola.Count)
            {
                colaToList();
                listaCola.Insert(pos, e);
                listToCola();
            }
        }

        public void recorrerInicioFin()
        {
            if (cola != null)
            {
                foreach (Estudiante estudiante in cola)
                {
                    Console.WriteLine(estudiante.ToString());
                    Console.WriteLine("********************************");
                }
            }
            else
            {
                Console.WriteLine("La cola esta vacia");
            }
        }

        public void recorrerFinInicio()
        {
            if (cola != null)
            {
                colaToList();
                for (int i = listaCola.Count - 1; i >= 0; i--)
                {
                    Console.WriteLine(listaCola[i].ToString());
                    Console.WriteLine("********************************");
                }
            }
            else
            {
                Console.WriteLine("La cola esta vacia");
            }
        }

        public void imprimir()
        {
            foreach (Estudiante estudiante in cola)
            {
                Console.WriteLine(estudiante.ToString());
                Console.WriteLine("********************************");
            }
        }

        public int getSize()
        {
            return size;
        }
    }
}