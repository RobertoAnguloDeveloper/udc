from Cola import Cola
from Estudiante import Estudiante

cola = Cola()

ctrl = True
while ctrl:
    opc = 0
    print("******MENU ESTUDIANTE*******")
    print("1. Agregar")
    print("2. Buscar")
    print("3. Ordenar")
    print("4. Desordenar")
    print("5. Eliminar")
    print("6. Insertar")
    print("7. Recorrer IMPRIMIR de INICIO A FIN")
    print("8. Recorrer IMPRIMIR de FIN A INICIO")
    print("9. Imprimir colección")
    print("10. Salir")
    print("******MENU ESTUDIANTE*******")
    
    try:
        opc = int(input("Ingrese una opcion: "))
    except ValueError:
        print("******ERROR*******")
        print("Opcion invalida")
        print("******ERROR*******")
        input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")

    if opc == 1:
        print("**********AGREGAR**********")
        nombres = input("Ingrese los nombres del Estudiante: ")
        apellidos = input("Ingrese los apellidos del Estudiante: ")
        tipoIdentificacion = input("Ingrese el tipo de identificacion del Estudiante: ")
        numeroIdentificacion = int(input("Ingrese el numero de identificacion del Estudiante: "))
        email = input("Ingrese el correo electronico del Estudiante: ")
        telefono = input("Ingrese el telefono del Estudiante: ")
        direccion = input("Ingrese el direccion del Estudiante: ")
        fechaNacimiento = input("Ingrese la fecha de nacimiento del Estudiante: ")
        fechaIngreso = input("Ingrese la fecha de ingreso del Estudiante: ")
        fechaEgreso = input("Ingrese la fecha de egreso del Estudiante: ")
        estado = input("Ingrese el estado del Estudiante: ")
        semestre = int(input("Ingrese el semestre del Estudiante: "))
        carrera = input("Ingrese la carrera del Estudiante: ")

        nuevo = Estudiante(nombres, apellidos, tipoIdentificacion, numeroIdentificacion, email, telefono, direccion, fechaNacimiento, fechaIngreso, fechaEgreso, estado, semestre, carrera)
        cola.agregar(nuevo)
        print("ESTUDIANTE AGREGADO A LA COLA")
        input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
        print("**********AGREGAR**********")

    elif opc == 2:
        print("**********BUSCAR**********")
        numeroIdentificacion = int(input("Ingrese el numero de identificacion del Estudiante a buscar: "))
        busqueda = cola.buscar(numeroIdentificacion)

        if numeroIdentificacion == None:
            print("NO HA INGRESADO NINGUNA CEDULA")
        
        else:
            print("El Estudiante de numero de identificación "+str(numeroIdentificacion)+" "+busqueda.getNombres()+" "+busqueda.getApellidos()+" está en la cola")
            input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
            print("**********BUSCAR**********")
        
    elif opc == 3:
        print("**********ORDENAR**********")
        cola.ordenar()
        print("COLA ORDENADA POR NUMERO DE IDENTIFICACION DE MENOR A MAYOR")
        input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
        print("**********ORDENAR**********")

    elif opc == 4:
        print("**********DESORDENAR**********")
        cola.desordenar()
        print("COLA DESORDENADA")
        input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
        print("**********DESORDENAR**********")

    elif opc == 5:
        print("**********ELIMINAR**********")
        numeroIdentificacion = input("Ingrese el numero de identificacion del Estudiante a eliminar: ")
        if(numeroIdentificacion == None):
            print("NO HA INGRESADO NINGUN NUMERO DE IDENTIFICACION")
        else:
            eliminado = cola.eliminar(numeroIdentificacion)
            if eliminado == -1:
                print("NO EXISTE NINGUN ESTUDIANTE CON ESE NUMERO DE IDENTIFICACION")
            else:
                print("EL ESTUDIANTE DE IDENTIFICACION NUMERO "+str(numeroIdentificacion)+" HA SIDO ELIMINADO")
                input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
                print("**********ELIMINAR**********")

    elif opc == 6:
        print("**********INSERTAR**********")
        nombres = input("Ingrese los nombres del Estudiante: ")
        apellidos = input("Ingrese los apellidos del Estudiante: ")
        tipoIdentificacion = input("Ingrese el tipo de identificacion del Estudiante: ")
        numeroIdentificacion = int(input("Ingrese el numero de identificacion del Estudiante: "))
        email = input("Ingrese el correo electronico del Estudiante: ")
        telefono = input("Ingrese el telefono del Estudiante: ")
        direccion = input("Ingrese el direccion del Estudiante: ")
        fechaNacimiento = input("Ingrese la fecha de nacimiento del Estudiante: ")
        fechaIngreso = input("Ingrese la fecha de ingreso del Estudiante: ")
        fechaEgreso = input("Ingrese la fecha de egreso del Estudiante: ")
        estado = input("Ingrese el estado del Estudiante: ")
        semestre = int(input("Ingrese el semestre del Estudiante: "))
        carrera = input("Ingrese la carrera del Estudiante: ")
        pos = int(input("Ingrese la posición donde desea insertar el Estudiante: "))

        nuevo = Estudiante(nombres, apellidos, tipoIdentificacion, numeroIdentificacion, email, telefono, direccion, fechaNacimiento, fechaIngreso, fechaEgreso, estado, semestre, carrera)
        
        if(pos >= 0 and pos <= cola.size):
            cola.insertar(pos, nuevo)
            print("ESTUDIANTE INSERTADO EN LA POSICION ",pos)
            input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
            print("**********INSERTAR**********")
        else:
            print("******ERROR*******")
            print("Posición invalida")
            print("******ERROR*******")
            input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
            print("**********INSERTAR**********")
    
    elif opc == 7:
        print("**********RECORRER DE INICIO A FIN**********")
        cola.recorrerInicioFin()
        input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
        print("**********RECORRER DE INICIO A FIN**********")

    elif opc == 8:
        print("**********RECORRER DE FIN A INICIO**********")
        cola.recorrerFinInicio()
        input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
        print("**********RECORRER DE FIN A INICIO**********")

    elif opc == 9:
        print("**********IMPRIMIR**********")
        cola.imprimir()
        print("**********IMPRIMIR**********")
        input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
        print("**********IMPRIMIR**********")

    elif opc == 10:
        ctrl = False