using System;

namespace Cola
{
    class Program
    {
        static void Main(string[] args)
        {
            Cola cola = new Cola();

            int op = 0;
            do
            {
                Console.WriteLine("******MENU ESTUDIANTE*******");
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
                Console.WriteLine("******MENU ESTUDIANTE*******");

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
                        Console.Write("Ingrese los nombres del Estudiante: ");
                        String nombres = Console.ReadLine();

                        Console.Write("Ingrese los apellidos del Estudiante: ");
                        String apellidos = Console.ReadLine();

                        Console.Write("Ingrese el tipo de identificacion del Estudiante: ");
                        String tipoIdentificacion = Console.ReadLine();

                        Console.Write("Ingrese el numero de identificacion del Estudiante: ");
                        int numeroIdentificacion = Convert.ToInt32(Console.ReadLine());

                        Console.Write("Ingrese el correo electrónico del Estudiante: ");
                        String correoElectronico = Console.ReadLine();

                        Console.Write("Ingrese el teléfono del Estudiante: ");
                        String telefono = Console.ReadLine();

                        Console.Write("Ingrese la dirección del Estudiante: ");
                        String direccion = Console.ReadLine();

                        Console.Write("Ingrese la fecha de nacimiento del Estudiante: ");
                        String fechaNacimiento = Console.ReadLine();

                        Console.Write("Ingrese la fecha de ingreso del Estudiante: ");
                        String fechaIngreso = Console.ReadLine();

                        Console.Write("Ingrese la fecha de egreso del Estudiante: ");
                        String fechaEgreso = Console.ReadLine();

                        Console.Write("Ingrese el estado del Estudiante: ");
                        String estado = Console.ReadLine();

                        Console.Write("Ingrese el semestre que cursa el Estudiante: ");
                        int semestre = Convert.ToInt32(Console.ReadLine());

                        Console.Write("Ingrese la carrera que cursa el Estudiante: ");
                        String carrera = Console.ReadLine();

                        Estudiante nuevo = new Estudiante(nombres, apellidos, tipoIdentificacion, numeroIdentificacion,
                                correoElectronico, telefono, direccion, fechaNacimiento, fechaIngreso, fechaEgreso, estado,
                                semestre, carrera);
                        cola.agregar(nuevo);
                        Console.WriteLine("\nESTUDIANTE AGREGADO EXITOSAMENTE");
                        Console.WriteLine("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                        Console.ReadLine();
                        Console.WriteLine("**********AGREGAR**********\n");
                        break;

                    case 2:
                        Console.WriteLine("**********BUSCAR**********");
                        Console.Write("Ingrese la numero de Identificacion del Estudiante: ");
                        int busqueda = Convert.ToInt32(Console.ReadLine());

                        Estudiante respuesta = cola.buscar(busqueda);

                        if (respuesta != null)
                        {
                            Console.WriteLine("El estudiante " + respuesta.Nombres + " "
                            + respuesta.Apellidos + " con el numero de identificacion " + respuesta.NumeroIdentificacion + " esta en la cola");
                        }
                        else
                        {
                            Console.WriteLine("El estudiante no se encuentra en la cola");
                        }

                        Console.WriteLine("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                        Console.ReadLine();
                        Console.WriteLine("**********BUSCAR**********");
                        break;

                    case 3:
                        Console.WriteLine("**********ORDENAR**********");
                        cola.ordenar();
                        Console.WriteLine("COLA ORDENADA POR NUMERO DE IDENTIFICACION");
                        Console.WriteLine("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                        Console.ReadLine();
                        Console.WriteLine("**********ORDENAR**********");
                        break;

                    case 4:
                        Console.WriteLine("**********DESORDENAR**********");
                        cola.desordenar();
                        Console.WriteLine("COLA DESORDENADA POR NUMERO DE IDENTIFICACION");
                        Console.Write("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                        Console.ReadLine();
                        Console.WriteLine("**********DESORDENAR**********");
                        break;

                    case 5:
                        Console.WriteLine("**********ELIMINAR**********");
                        Console.Write("Ingrese la numero de identificacion del Estudiante a eliminar: ");
                        int eliminar = Convert.ToInt32(Console.ReadLine());

                        if (cola.eliminar(eliminar))
                        {
                            Console.WriteLine("El estudiante con el numero de identificacion " + eliminar + " ha sido eliminado");
                        }
                        else
                        {
                            Console.WriteLine("El estudiante con el numero de identificacion " + eliminar + " no se encuentra en la cola");
                        }

                        Console.WriteLine("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                        Console.ReadLine();
                        Console.WriteLine("**********ELIMINAR**********");
                        break;

                    case 6:
                        Console.WriteLine("**********INSERTAR**********");
                        Console.Write("Ingrese los nombres del Estudiante: ");
                        String nombresIn = Console.ReadLine();

                        Console.Write("Ingrese los apellidos del Estudiante: ");
                        String apellidosIn = Console.ReadLine();

                        Console.Write("Ingrese el tipo de identificacion del Estudiante: ");
                        String tipoIdentificacionIn = Console.ReadLine();

                        Console.Write("Ingrese el numero de identificacion del Estudiante: ");
                        int numeroIdentificacionIn = Convert.ToInt32(Console.ReadLine());

                        Console.Write("Ingrese el correo electrónico del Estudiante: ");
                        String correoElectronicoIn = Console.ReadLine();

                        Console.Write("Ingrese el teléfono del Estudiante: ");
                        String telefonoIn = Console.ReadLine();

                        Console.Write("Ingrese la dirección del Estudiante: ");
                        String direccionIn = Console.ReadLine();

                        Console.Write("Ingrese la fecha de nacimiento del Estudiante: ");
                        String fechaNacimientoIn = Console.ReadLine();

                        Console.Write("Ingrese la fecha de ingreso del Estudiante: ");
                        String fechaIngresoIn = Console.ReadLine();

                        Console.Write("Ingrese la fecha de egreso del Estudiante: ");
                        String fechaEgresoIn = Console.ReadLine();

                        Console.Write("Ingrese el estado del Estudiante: ");
                        String estadoIn = Console.ReadLine();

                        Console.Write("Ingrese el semestre que cursa el Estudiante: ");
                        int semestreIn = Convert.ToInt32(Console.ReadLine());

                        Console.Write("Ingrese la carrera que cursa el Estudiante: ");
                        String carreraIn = Console.ReadLine();

                        Estudiante nuevoIn = new Estudiante(nombresIn, apellidosIn, tipoIdentificacionIn, numeroIdentificacionIn,
                                correoElectronicoIn, telefonoIn, direccionIn, fechaNacimientoIn, fechaIngresoIn, fechaEgresoIn, estadoIn,
                                semestreIn, carreraIn);

                        int pos = 0;
                        do
                        {
                            Console.Write("Ingrese la posición donde desea insertar el Estudiante: ");
                            pos = Convert.ToInt32(Console.ReadLine());

                            if (pos > cola.getSize())
                            {
                                Console.WriteLine("La posición ingresada es mayor a la cantidad de estudiantes en la cola");
                            }
                        } while (pos < 0 || pos > cola.getSize());

                        cola.insertar(pos, nuevoIn);

                        Console.WriteLine("ESTUDIANTE INSERTADO EN LA POSICION [" + pos + "]");
                        Console.Write("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                        Console.ReadLine();
                        Console.WriteLine("**********INSERTAR**********");
                        break;

                    case 7:
                        Console.WriteLine("**********RECORRER DE INICIO A FIN**********");
                        cola.recorrerInicioFin();

                        Console.Write("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                        Console.ReadLine();
                        Console.WriteLine("**********RECORRER DE INICIO A FIN**********");
                        break;

                    case 8:
                        Console.WriteLine("**********RECORRER DE FIN A INICIO**********");
                        cola.recorrerFinInicio();

                        Console.Write("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                        Console.ReadLine();
                        Console.WriteLine("**********RECORRER DE FIN A INICIO**********");
                        break;

                    case 9:
                        Console.WriteLine("**********IMPRIMIR**********");
                        cola.imprimir();
                        Console.WriteLine("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                        Console.ReadLine();
                        Console.WriteLine("**********IMPRIMIR**********\n");
                        break;
                    default:
                        break;
                }
            } while (op != 10);
        }
    }
}
