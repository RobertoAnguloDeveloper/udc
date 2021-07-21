using System;
using System.Collections.Generic;

namespace Pila
{
    public class Pila
    {
        private Stack<Carro> pila;
        private int size;
        private Carro[] arrayPila;
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
            Console.WriteLine("Carro de " + objeto.getPlaca() + " ha sido AGREGADO");
            size++;
        }

        public int buscarPorPlaca(string placa)
        {
            for (int i = 0; i < size; i++)
            {
                if (pila.Pop().getPlaca().Equals(placa.ToUpper()))
                {
                    return i;
                }
            }
            return -1;
        }

        public void pilaToList()
        {
            for (int i = 0; i < size; i++)
            {
                listaPila.Add(pila.Pop());
            }
        }

        public void listToPila()
        {
            for (int i = 0; i < listaPila.Count; i++)
            {
                pila.Push(listaPila[i]);
            }
        }

        public void pilaToArray()
        {
            arrayPila = new Carro[size];
            for (int i = 0; i < size; i++)
            {
                arrayPila[i] = pila.Pop();
            }
        }

        public void arrayToPila()
        {
            pila.Clear();
            size = 0;
            for (int i = 0; i < arrayPila.Length; i++)
            {
                pila.Push(arrayPila[i]);
                size++;
            }
        }

        public void ordenar()
        {
            pilaToArray();
            Carro[] aux = new Carro[size];
            int i = 0;
            int j = 0;
            while (i < size)
            {
                for (j = 0; j < size; j++)
                {
                    if (arrayPila[i].getPlaca().CompareTo(arrayPila[j].getPlaca()) < 0)
                    {
                        aux[i] = arrayPila[i];
                        arrayPila[i] = arrayPila[j];
                        arrayPila[j] = aux[i];
                    }
                }
                i++;
            }
            Console.WriteLine("COLECCION DE CARROS ORDENADA");
            arrayToPila();
        }

        public void desordenar()
        {
            pilaToArray();
            Carro[] arrayPilaInv = new Carro[size];
            for (int i = 0; i < size; i++)
            {
                arrayPilaInv[i] = arrayPila[size - 1 - i];
            }

            for (int i = 0; i < size; i++)
            {
                arrayPila[i] = arrayPilaInv[i];
            }
            Console.WriteLine("COLECCION DE CARROS DESORDENADA");
            arrayToPila();
        }

        public void eliminar(string placa)
        {
            pilaToList();
            int ctrl = 0;
            for (int i = 0; i < size; i++)
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
            if (pos >= 0 && pos < size)
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
            for (int i = 0; i < size; i++)
            {
                Console.WriteLine(listaPila[i].getPlaca());
            }
        }

        public void recorrerFinInicio()
        {
            pilaToList();
            for (int i = size - 1; i >= 0; i--)
            {
                Console.WriteLine(listaPila[i].getPlaca());
            }
        }

        public void imprimir()
        {
            pilaToList();
            for (int i = 0; i < size; i++)
            {
                Console.WriteLine(listaPila[i].getPlaca());
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