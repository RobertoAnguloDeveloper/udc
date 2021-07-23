#Implement all the methods from the Lista class
from Lista import Lista

lista = Lista()

lista.agregar("Argentina")
lista.agregar("Bolivia")
lista.agregar("Ecuador")
lista.agregar("Paraguay")
lista.agregar("Chile")
lista.agregar("México")
lista.agregar("Espana")

print("********************")
print("Buscando 'Brazil':")
print("********************")
if lista.buscar("Brazil"):
    print("El pais esta en la lista")
else:
    print("El pais NO esta en la lista")

print("********************")
print("Buscando 'Brasil':")
print("********************")
if lista.buscar("Brasil"):
    print("El pais esta en la lista")
else:
    print("El pais NO esta en la lista")

print("********************")
print("Lista original: ")
print("********************")
lista.imprimir()

print("********************")
print("Lista ordenada: ")
print("********************")
lista.ordenar()
lista.imprimir()

print("********************")
print("Lista desordenada: ")
lista.desordenar()
print("********************")
lista.imprimir()

print("********************")
print("Pais eliminado 'Chile'")
lista.eliminar("Chile")
print("********************")
lista.imprimir()

print("********************")
print("Pais insertado 'Perú' en la posicion 2")
lista.insertar(2,"Perú")
print("********************")
lista.imprimir()

print("*******************************")
print("Lista recorrido inicio a fin: ")
print("*******************************")
lista.recorridoInicioFin()

print("*******************************")
print("Lista recorrido fin a inicio: ")
print("*******************************")
lista.recorridoFinInicio()