using System;
using System.Collections.Generic;

namespace Pila
{
    public class Pila
    {
        private Stack<Carro> pila;
        private int size;
        private List<Carro> listaPila;

        public Pila()
        {
            pila = new Stack<Carro>();
            listaPila = new List<Carro>();
            size = 0;
        }

        public void agregar(Carro objeto)
        {
            pila.Push(objeto);
            listaPila.Add(objeto);
            Console.WriteLine("Carro de " + objeto.getPlaca() + " ha sido AGREGADO");
            size++;
        }

        public int buscarPorPlaca(string placa)
        {
            pilaToList();
            for (int i = 0; i < listaPila.Count; i++)
            {
                if (listaPila[i].getPlaca().Equals(placa.ToUpper()))
                {
                    listToPila();
                    return i;
                }
            }
            listToPila();
            return -1;
        }

        public void pilaToList()
        {
            size = pila.Count;
            listaPila.Clear();
            while (size != 0)
            {
                listaPila.Add(pila.Pop());
                size--;
            }

            for (int i = 0; i < listaPila.Count; i++)
            {
                pila.Push(listaPila[i]);
            }
        }

        public void listToPila()
        {
            pila.Clear();
            for (int i = 0; i < listaPila.Count; i++)
            {
                pila.Push(listaPila[i]);
            }
        }

        public void ordenar()
        {
            pilaToList();
            List<Carro> aux = new List<Carro>();
            int i = 0;
            int j = 0;
            while (i < size)
            {
                for (j = 0; j < size; j++)
                {
                    if (listaPila[i].getPlaca().CompareTo(listaPila[j].getPlaca()) < 0)
                    {
                        aux[i] = listaPila[i];
                        listaPila[i] = listaPila[j];
                        listaPila[j] = aux[i];
                    }
                }
                i++;
            }
            Console.WriteLine("COLECCION DE CARROS ORDENADA");
            listToPila();
        }

        public void desordenar()
        {
            pilaToList();
            List<Carro> listaPilaInv = new List<Carro>();
            for (int i = 0; i < size; i++)
            {
                listaPilaInv[i] = listaPila[size - 1 - i];
            }

            for (int i = 0; i < size; i++)
            {
                listaPila[i] = listaPilaInv[i];
            }
            Console.WriteLine("COLECCION DE CARROS DESORDENADA");
            listToPila();
        }

        public void eliminar(string placa)
        {
            pilaToList();
            int ctrl = 0;
            for (int i = 0; i < listaPila.Count; i++)
            {
                if (listaPila[i].getPlaca().Equals(placa))
                {
                    listaPila.RemoveAt(i);
                    size--;
                    Console.WriteLine("Carro de " + placa + " ha sido eliminado");
                    ctrl = 0;
                    break;
                }
                else
                {
                    ctrl++;
                }
            }

            if (ctrl > 0)
            {
                Console.WriteLine("Placa no encontrada");
            }
            listToPila();
        }

        public void insertar(int pos, Carro objeto)
        {
            pilaToList();
            if (pos >= 0 && pos <= size)
            {
                listaPila.Insert(pos, objeto);
                if (pos == 0)
                {
                    Console.WriteLine("Carro de " + objeto.getPlaca() + " ha sido INSERTADO en la CABEZA de la colección");
                }
                Console.WriteLine("Carro de " + objeto.getPlaca() + " ha sido INSERTADO en la POSICION [" + pos + "] de la colección");
                size++;
            }
            else
            {
                Console.WriteLine("Posicion no valida");
            }
            listToPila();
        }

        public void recorrerInicioFin()
        {
            pilaToList();
            for (int i = 0; i < listaPila.Count; i++)
            {
                Console.WriteLine(listaPila[i].getPlaca());
            }
            listToPila();
        }

        public void recorrerFinInicio()
        {
            pilaToList();
            for (int i = listaPila.Count - 1; i >= 0; i--)
            {
                Console.WriteLine(listaPila[i].getPlaca());
            }
        }

        public void imprimir()
        {
            for (int i = 0; i < listaPila.Count; i++)
            {
                Console.WriteLine(listaPila[i].mostrar());
            }
        }

        public void imprimir(int indice)
        {
            pilaToList();
            if (indice >= 0 && indice < size)
            {
                Console.WriteLine(listaPila[indice].getPlaca());
            }
        }
    }
}