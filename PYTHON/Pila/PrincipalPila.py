from Pila import Pila

pila = Pila()
opc = 0
ctrl = True
while ctrl:
    print("******MENU CARRO*******")
    print("1. Agregar")
    print("2. Buscar")
    print("3. Ordenar")
    print("4. Desordenar")
    print("5. Eliminar")
    print("6. Insertar")
    print("7. Recorrer coleccion de INICIO A FIN")
    print("8. Recorrer coleccion de FIN A INICIO")
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
        
        #nuevo = Carro()
        """pila.agregar(nuevo)
        print("**********AGREGAR**********")"""

    elif opc == 10:
        ctrl = False