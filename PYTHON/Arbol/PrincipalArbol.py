from Nodo import Nodo

arbol = Nodo()

arbol.agregar(10)
arbol.agregar(2)
arbol.agregar(5)
arbol.agregar(1)
arbol.agregar(3)
arbol.agregar(4)
arbol.agregar(16)
arbol.agregar(8)
arbol.agregar(7)
arbol.agregar(6)

print("********************")
print("BUSCANDO EL VALOR 16")
print("********************")
resultado = arbol.buscar(16)
if resultado == True:
    print("El valor 16 SI esta en el arbol")
else:
    print("El valor 16 NO esta en el arbol")

print("********************")
print("Arbol ordenado")
print("********************")
arbol.ordenar()

print("********************")
print("Arbol desordenado")
print("********************")
arbol.desordenar()

print("********************")
print("Arbol sin 16")
print("********************")
arbol.eliminar(16)
arbol.imprimir()

#Desde aqui
print("********************")
print("Insertando 36 en la posición 2")
print("********************")
arbol.insertar(2, 36)
arbol.imprimir()

print("********************")
print("Recorrido de inicio a fin")
print("********************")
arbol.recorridoInicioFin()

print("********************")
print("Recorrido de fin a inicio")
print("********************")
arbol.recorridoFinInicio()
