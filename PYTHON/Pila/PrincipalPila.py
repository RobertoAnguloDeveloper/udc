from Pila import Pila
from Carro import Carro

pila = Pila()

ctrl = True
while ctrl:
    opc = 0
    print("******MENU CARRO*******")
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
    print("******MENU CARRO*******")
    
    try:
        opc = int(input("Ingrese una opcion: "))
    except ValueError:
        print("******ERROR*******")
        print("Opcion invalida")
        print("******ERROR*******")
        input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")

    if opc == 1:
        print("**********AGREGAR**********")
        marca = input("Ingrese el marca del carro: ")
        modelo = input("Ingrese el modelo del carro: ")
        color = input("Ingrese el color del carro: ")
        placa = input("Ingrese la placa del carro: ")
        
        nuevo = Carro(marca, modelo, color, placa.upper())
        pila.agregar(nuevo)
        print("CARRO AGREGADO A LA PILA")
        input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
        print("**********AGREGAR**********")

    elif opc == 2:
        print("**********BUSCAR**********")
        placa = input("Ingrese la placa del carro a buscar: ")
        busqueda = pila.buscar(placa)

        if busqueda == None:
            print("NO HA INGRESADO NINGUNA PLACA")
        
        else:
            print("El Carro de placa "+busqueda.getPlaca()+" "+busqueda.getMarca()+" "+busqueda.getModelo()+" "+busqueda.getColor())
            input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
            print("**********BUSCAR**********")
        
    elif opc == 3:
        print("**********ORDENAR**********")
        pila.ordenar()
        print("PILA ORDENADA POR PLACA DE MENOR A MAYOR")
        input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
        print("**********ORDENAR**********")

    elif opc == 4:
        print("**********DESORDENAR**********")
        pila.desordenar()
        print("PILA DESORDENADA")
        input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
        print("**********DESORDENAR**********")

    elif opc == 5:
        print("**********ELIMINAR**********")
        placa = input("Ingrese la placa del carro a eliminar: ")
        if(placa == None):
            print("NO HA INGRESADO NINGUNA PLACA")
        else:
            eliminado = pila.eliminar(placa)
            if eliminado == -1:
                print("NO EXISTE EL CARRO CON ESA PLACA")
            else:
                print("EL CARRO DE PLACA "+placa+" HA SIDO ELIMINADO")
                input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
                print("**********ELIMINAR**********")

    elif opc == 6:
        print("**********INSERTAR**********")
        marca = input("Ingrese la marca del carro: ")
        modelo = input("Ingrese el modelo del carro: ")
        color = input("Ingrese el color del carro: ")
        placa = input("Ingrese la placa del carro: ")
        pos = int(input("Ingrese la posición donde desea insertar el carro: "))

        nuevo = Carro(marca, modelo, color, placa.upper())
        
        if(pos >= 0 and pos <= pila.size):
            pila.insertar(pos, nuevo)
            print("CARRO INSERTADO EN LA POSICION ",pos)
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
        pila.recorrerInicioFin()
        input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
        print("**********RECORRER DE INICIO A FIN**********")

    elif opc == 8:
        print("**********RECORRER DE FIN A INICIO**********")
        pila.recorrerFinInicio()
        input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
        print("**********RECORRER DE FIN A INICIO**********")

    elif opc == 9:
        print("**********IMPRIMIR**********")
        pila.imprimir()
        print("**********IMPRIMIR**********")
        input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA IR AL MENU...")
        print("**********IMPRIMIR**********")

    elif opc == 10:
        ctrl = False