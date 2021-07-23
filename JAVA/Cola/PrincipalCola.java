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
                System.out.println("****************************");
                System.out.println("\tOpcion invalida");
                System.out.println("****************************");
                key = new Scanner(System.in);
            }

            key = new Scanner(System.in);
            switch (op) {
                case 1:
                    key = new Scanner(System.in);
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

                    key = new Scanner(System.in);
                    System.out.print("Ingrese la dirección del Estudiante: ");
                    String direccion = key.nextLine();

                    System.out.print("Ingrese la fecha de nacimiento del Estudiante: ");
                    String fechaNacimiento = key.next();

                    System.out.print("Ingrese la fecha de ingreso del Estudiante: ");
                    String fechaIngreso = key.next();

                    System.out.print("Ingrese la fecha de egreso del Estudiante: ");
                    String fechaEgreso = key.next();

                    key = new Scanner(System.in);
                    System.out.print("Ingrese el estado del Estudiante: ");
                    String estado = key.nextLine();

                    System.out.print("Ingrese el semestre que cursa el Estudiante: ");
                    int semestre = key.nextInt();

                    key = new Scanner(System.in);
                    System.out.print("Ingrese la carrera que cursa el Estudiante: ");
                    String carrera = key.nextLine();

                    Estudiante nuevo = new Estudiante(nombres, apellidos, tipoIdentificacion, numeroIdentificacion,
                            correoElectronico, telefono, direccion, fechaNacimiento, fechaIngreso, fechaEgreso, estado,
                            semestre, carrera);
                    cola.agregar(nuevo);
                    key = new Scanner(System.in);
                    System.out.println("\nESTUDIANTE AGREGADO EXITOSAMENTE");
                    System.out.println("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                    key.nextLine();
                    System.out.println("**********AGREGAR**********\n");
                    break;

                case 2:
                    System.out.println("**********BUSCAR**********");
                    System.out.print("Ingrese el numero de Identificacion del Estudiante: ");
                    int busqueda = key.nextInt();

                    Estudiante respuesta = cola.buscar(busqueda);
                    
                    if(respuesta != null){
                        System.out.println("El estudiante "+respuesta.getNombres()+" "
                        + respuesta.getApellidos()+" con el numero de identificacion "+respuesta.getNumeroIdentificacion()+" esta en la cola");
                    }else{
                        System.out.println("El estudiante no se encuentra en la cola");
                    }

                    System.out.println("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                    key.nextLine();
                    System.out.println("**********BUSCAR**********");
                    break;

                case 3:
                    System.out.println("**********ORDENAR**********");
                    cola.ordenar();
                    System.out.println("COLA ORDENADA POR NUMERO DE IDENTIFICACION");
                    System.out.println("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                    key.nextLine();
                    System.out.println("**********ORDENAR**********");
                    break;

                case 4:
                    System.out.println("**********DESORDENAR**********");
                    cola.desordenar();
                    System.out.println("COLA DESORDENADA POR NUMERO DE IDENTIFICACION");
                    System.out.print("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                    key.nextLine();
                    System.out.println("**********DESORDENAR**********");
                    break;

                case 5:
                    System.out.println("**********ELIMINAR**********");
                    System.out.print("Ingrese el numero de identificacion del Estudiante a eliminar: ");
                    int eliminar = key.nextInt();
                    
                    if(cola.eliminar(eliminar)){
                        System.out.println("El estudiante con el numero de identificacion "+eliminar+" ha sido eliminado");
                    }else {
                        System.out.println("El estudiante con el numero de identificacion "+eliminar+" no se encuentra en la cola");
                    }
                    
                    System.out.println("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                    key.nextLine();
                    System.out.println("**********ELIMINAR**********");
                    break;

                case 6:
                    key = new Scanner(System.in);
                    System.out.println("**********INSERTAR**********");
                    System.out.print("Ingrese los nombres del Estudiante: ");
                    String nombresIn = key.nextLine();

                    System.out.print("Ingrese los apellidos del Estudiante: ");
                    String apellidosIn = key.nextLine();

                    System.out.print("Ingrese el tipo de identificacion del Estudiante: ");
                    String tipoIdentificacionIn = key.next();

                    System.out.print("Ingrese el numero de identificacion del Estudiante: ");
                    int numeroIdentificacionIn = key.nextInt();

                    System.out.print("Ingrese el correo electrónico del Estudiante: ");
                    String correoElectronicoIn = key.next();

                    System.out.print("Ingrese el teléfono del Estudiante: ");
                    String telefonoIn = key.next();

                    key = new Scanner(System.in);
                    System.out.print("Ingrese la dirección del Estudiante: ");
                    String direccionIn = key.nextLine();

                    System.out.print("Ingrese la fecha de nacimiento del Estudiante: ");
                    String fechaNacimientoIn = key.next();

                    System.out.print("Ingrese la fecha de ingreso del Estudiante: ");
                    String fechaIngresoIn = key.next();

                    System.out.print("Ingrese la fecha de egreso del Estudiante: ");
                    String fechaEgresoIn = key.next();

                    key = new Scanner(System.in);
                    System.out.print("Ingrese el estado del Estudiante: ");
                    String estadoIn = key.nextLine();

                    System.out.print("Ingrese el semestre que cursa el Estudiante: ");
                    int semestreIn = key.nextInt();

                    key = new Scanner(System.in);
                    System.out.print("Ingrese la carrera que cursa el Estudiante: ");
                    String carreraIn = key.nextLine();

                    Estudiante nuevoIn = new Estudiante(nombresIn, apellidosIn, tipoIdentificacionIn, numeroIdentificacionIn,
                            correoElectronicoIn, telefonoIn, direccionIn, fechaNacimientoIn, fechaIngresoIn, fechaEgresoIn, estadoIn,
                            semestreIn, carreraIn);

                    int pos = 0;
                    do{
                        key = new Scanner(System.in);
                        System.out.print("Ingrese la posición donde desea insertar el Estudiante: ");
                        pos = key.nextInt();
                        
                        if(pos > cola.getSize()){
                            System.out.println("La posición ingresada es mayor a la cantidad de estudiantes en la cola");
                        }
                    }while(pos < 0 || pos > cola.getSize());
                    
                    cola.insertar(pos, nuevoIn);
                    
                    key = new Scanner(System.in);
                    System.out.println("ESTUDIANTE INSERTADO EN LA POSICION ["+pos+"]");
                    System.out.print("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                    key.nextLine();
                    System.out.println("**********INSERTAR**********");
                    break;

                case 7:
                    System.out.println("**********RECORRER DE INICIO A FIN**********");
                    cola.recorrerInicioFin();
                    
                    key = new Scanner(System.in);
                    System.out.print("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                    key.nextLine();
                    System.out.println("**********RECORRER DE INICIO A FIN**********");
                    break;

                case 8:
                    System.out.println("**********RECORRER DE FIN A INICIO**********");
                    cola.recorrerFinInicio();

                    key = new Scanner(System.in);
                    System.out.print("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                    key.nextLine();
                    System.out.println("**********RECORRER DE FIN A INICIO**********");
                    break;

                case 9:
                    System.out.println("**********IMPRIMIR**********");
                    cola.imprimir();
                    key = new Scanner(System.in);
                    System.out.println("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...");
                    key.nextLine();
                    System.out.println("**********IMPRIMIR**********\n");
                    break;
                default:
                    break;
            }
        } while (op != 10);
    }
}
