using System;

namespace Pila
{
    class Program
    {
        static void Main(string[] args)
        {
            Pila pila = new Pila();

            int op = 0;
            do
            {
                Console.WriteLine("******MENU CARRO*******");
                Console.WriteLine("1. Agregar");
                Console.WriteLine("2. Buscar");
                Console.WriteLine("3. Ordenar");
                Console.WriteLine("4. Desordenar");
                Console.WriteLine("5. Eliminar");
                Console.WriteLine("6. Insertar");
                Console.WriteLine("7. Recorrer coleccion de INICIO A FIN");
                Console.WriteLine("8. Recorrer coleccion de FIN A INICIO");
                Console.WriteLine("9. Imprimir colección");
                Console.WriteLine("10. Salir");
                Console.WriteLine("******MENU CARRO*******");

                try
                {
                    Console.Write(">");
                    op = Convert.ToInt32(Console.ReadLine());
                }
                catch (FormatException)
                {
                    Console.WriteLine("Opcion invalida");
                    op = 0;
                }

                switch (op)
                {
                    case 1:
                        Console.WriteLine("**********AGREGAR**********");
                        Console.Write("Ingrese el marca del carro: ");
                        string marca = Console.ReadLine();;
                        Console.Write("Ingrese el modelo del carro: ");
                        string modelo = Console.ReadLine();;
                        Console.Write("Ingrese el color del carro: ");
                        string color = Console.ReadLine();;
                        Console.Write("Ingrese la placa del carro: ");
                        string placa = Console.ReadLine();;
                        Carro nuevo = new Carro(marca, modelo, color, placa.ToUpper());
                        pila.agregar(nuevo);
                        Console.WriteLine("**********AGREGAR**********");
                        break;

                    case 2:
                        Console.WriteLine("**********BUSCAR**********");
                        Console.Write("Ingrese la placa del carro: ");
                        string busqueda = Console.ReadLine();;
                        int indice = pila.buscarPorPlaca(busqueda);
                        if (indice != -1)
                        {
                            Console.WriteLine("El carro se encuentra en la posición [" + indice + "]");
                            pila.imprimir(indice);
                        }
                        else
                        {
                            Console.WriteLine("El carro no se encuentra en la colección");
                        }
                        Console.WriteLine("**********BUSCAR**********");
                        break;

                    case 3:
                        Console.WriteLine("**********ORDENAR**********");
                        pila.ordenar();
                        Console.WriteLine("PILA ORDENADA POR PLACA");
                        Console.WriteLine("**********ORDENAR**********");
                        break;

                    case 4:
                        Console.WriteLine("**********DESORDENAR**********");
                        pila.desordenar();
                        Console.WriteLine("PILA DESORDENADA POR PLACA");
                        Console.WriteLine("**********DESORDENAR**********");
                        break;

                    case 5:
                        Console.WriteLine("**********ELIMINAR**********");
                        Console.Write("Ingrese la placa del carro: ");
                        string eliminar = Console.ReadLine();
                        pila.eliminar(eliminar.ToUpper());
                        Console.WriteLine("**********ELIMINAR**********");
                        break;

                    case 6:
                        Console.WriteLine("**********INSERTAR**********");
                        Console.Write("Ingrese el marca del carro: ");
                        string marcaIn = Console.ReadLine();
                        Console.Write("Ingrese el modelo del carro: ");
                        string modeloIn = Console.ReadLine();
                        Console.Write("Ingrese el color del carro: ");
                        string colorIn = Console.ReadLine();
                        Console.Write("Ingrese la placa del carro: ");
                        string placaIn = Console.ReadLine();
                        Carro nuevoIn = new Carro(marcaIn, modeloIn, colorIn, placaIn.ToUpper());
                        Console.Write("Ingrese la posición donde desea insertar el Carro: ");
                        int pos = Convert.ToInt32(Console.ReadLine());
                        pila.insertar(pos, nuevoIn);
                        Console.WriteLine("**********INSERTAR**********");
                        break;

                    case 7:
                        Console.WriteLine("**********RECORRER DE INICIO A FIN**********");
                        pila.recorrerInicioFin();
                        Console.WriteLine("**********RECORRER DE INICIO A FIN**********");
                        break;

                    case 8:
                        Console.WriteLine("**********RECORRER DE FIN A INICIO**********");
                        pila.recorrerFinInicio();
                        Console.WriteLine("**********RECORRER DE FIN A INICIO**********");
                        break;

                    case 9:
                        Console.WriteLine("**********IMPRIMIR**********");
                        pila.imprimir();
                        Console.WriteLine("**********IMPRIMIR**********");
                        break;
                    default:
                        break;
                }
            } while (op != 10);
        }
    }
}
