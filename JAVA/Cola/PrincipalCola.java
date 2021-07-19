package JAVA.Cola;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalCola {
    public static void main(String[] args) {
        Cola cola = new Cola();
        Scanner key = new Scanner(System.in);

        int op = 0;
        do {
            System.out.println("******MENU ESTUDIANTE*******");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Ordenar");
            System.out.println("4. Desordenar");
            System.out.println("5. Eliminar");
            System.out.println("6. Insertar");
            System.out.println("7. Recorrer coleccion de INICIO A FIN");
            System.out.println("8. Recorrer coleccion de FIN A INICIO");
            System.out.println("9. Imprimir colección");
            System.out.println("10. Salir");
            System.out.println("******MENU ESTUDIANTE*******");

            try {
                System.out.print(">");
                op = key.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opcion invalida");
                key = new Scanner(System.in);
            }

            key = new Scanner(System.in);
            switch (op) {
                case 1:
                    System.out.println("**********AGREGAR**********");
                    System.out.print("Ingrese los nombres del Estudiante: ");
                    String nombres = key.nextLine();

                    System.out.print("Ingrese los apellidos del Estudiante: ");
                    String apellidos = key.nextLine();

                    System.out.print("Ingrese el tipo de identificacion del Estudiante: ");
                    String tipoIdentificacion = key.next();

                    System.out.print("Ingrese el numero de identificacion del Estudiante: ");
                    int numeroIdentificacion = key.nextInt();

                    System.out.print("Ingrese el correo electrónico del Estudiante: ");
                    String correoElectronico = key.next();

                    System.out.print("Ingrese el teléfono del Estudiante: ");
                    String telefono = key.next();

                    System.out.print("Ingrese la dirección del Estudiante: ");
                    String direccion = key.next();
                    key = new Scanner(System.in);

                    System.out.print("Ingrese la fecha de nacimiento del Estudiante: ");
                    String fechaNacimiento = key.next();

                    System.out.print("Ingrese la fecha de ingreso del Estudiante: ");
                    String fechaIngreso = key.next();

                    System.out.print("Ingrese la fecha de egreso del Estudiante: ");
                    String fechaEgreso = key.next();

                    char opcion;
                    boolean activo = false;
                    do {
                        System.out.print("El Estudiante está opcion? S/N: ");
                        opcion = key.next().charAt(0);
                        opcion = Character.toUpperCase(opcion);

                        if (opcion == 'S') {
                            activo = true;
                        } else if (opcion == 'N') {
                            activo = false;
                        } else if (opcion != 'S' && opcion != 'N') {
                            System.out.println("Opcion invalida");
                            key = new Scanner(System.in);
                        }
                    } while (opcion != 'S' && opcion != 'N');

                    System.out.println("Ingrese el semestre que cursa el Estudiante: ");
                    int semestre = key.nextInt();

                    System.out.println("Ingrese la carrera que cursa el Estudiante: ");
                    String carrera = key.next();

                    Estudiante nuevo = new Estudiante(nombres, apellidos, tipoIdentificacion, numeroIdentificacion,
                            correoElectronico, telefono, direccion, fechaNacimiento, fechaIngreso, fechaEgreso, activo,
                            semestre, carrera);
                    Estudiante nuevoIn = new Estudiante(nombres, apellidos, numeroIdentificacion);
                    cola.agregar(nuevoIn);
                    System.out.println("**********AGREGAR**********");
                    break;

                case 2:
                    System.out.println("**********BUSCAR**********");
                    System.out.print("Ingrese la numero de Identificacion del Estudiante: ");
                    int busqueda = key.nextInt();

                    Estudiante respuesta = cola.buscar(busqueda);
                    
                    if(respuesta != null){
                        System.out.println("El estudiante "+respuesta.getNombres()+" "
                        + respuesta.getApellidos()+" con el numero de identificacion "+respuesta.getNumeroIdentificacion()+" esta en la cola");
                    }else{
                        System.out.println("El estudiante no se encuentra en la cola");
                    }

                    System.out.println("**********BUSCAR**********");
                    break;

                case 3:
                    System.out.println("**********ORDENAR**********");
                    cola.ordenar();
                    System.out.println("COLA ORDENADA POR NUMERO DE IDENTIFICACION");
                    System.out.println("**********ORDENAR**********");
                    break;

                case 4:
                    System.out.println("**********DESORDENAR**********");
                    cola.desordenar();
                    System.out.println("COLA DESORDENADA POR NUMERO DE IDENTIFICACION");
                    System.out.println("**********DESORDENAR**********");
                    break;

                case 5:
                    System.out.println("**********ELIMINAR**********");
                    System.out.print("Ingrese la numero de identificacion del Estudiante a eliminar: ");
                    int eliminar = key.nextInt();
                    cola.eliminar(eliminar);
                    System.out.println("**********ELIMINAR**********");
                    break;

                case 6:
                    System.out.println("**********INSERTAR**********");
                    System.out.print("Ingrese el nombres del Estudiante: ");
                    String nombreIn = key.next();
                    System.out.print("Ingrese el apellidos del Estudiante: ");
                    String modeloIn = key.next();
                    System.out.print("Ingrese el tipoIdentificacion del Estudiante: ");
                    String colorIn = key.next();
                    System.out.print("Ingrese la numeroIdentificacion = del Estudiante: ");
                    String placaIn = key.next();
                    Estudiante nuevoIn = new Estudiante(nombreIn, modeloIn, colorIn, placaIn.toUpperCase());
                    System.out.print("Ingrese la posición donde desea insertar el Estudiante: ");
                    int pos = key.nextInt();
                    cola.insertar(pos, nuevoIn);
                    System.out.println("**********INSERTAR**********");
                    break;

                case 7:
                    System.out.println("**********RECORRER DE INICIO A FIN**********");
                    cola.recorrerInicioFin();
                    System.out.println("**********RECORRER DE INICIO A FIN**********");
                    break;

                case 8:
                    System.out.println("**********RECORRER DE FIN A INICIO**********");
                    cola.recorrerFinInicio();
                    System.out.println("**********RECORRER DE FIN A INICIO**********");
                    break;
                    */

                case 9:
                    System.out.println("**********IMPRIMIR**********");
                    cola.imprimir();
                    System.out.println("**********IMPRIMIR**********");
                    break;
                default:
                    break;
            }
        } while (op != 10);
    }
}
