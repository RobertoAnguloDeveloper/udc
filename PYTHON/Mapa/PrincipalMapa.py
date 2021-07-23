from Mapa import Mapa

mapa = Mapa()
mapa.agregar("Java", "Lenguaje de programación especializado en Programación Orientada a Objetos")
mapa.agregar("Python", "Lenguaje de programación de alto nivel")
mapa.agregar("PHP", "Lenguaje de programación orientado a objetos y de comunicación con el servidor")
mapa.agregar("C++", "Lenguaje de programación de alto nivel")
mapa.agregar("C#", "Lenguaje de programación orientado a objetos, evolución de C++")
mapa.agregar("JavaScript", "Lenguaje de programación orientado a objetos y orientado a páginas Web")
mapa.agregar("Ruby", "Lenguaje de programación orientado a objetos")
mapa.agregar("C", "Lenguaje de programación orientado a objetos")
mapa.imprimir()
input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA CONTINUAR...")

print("************************************************")
print("*Buscar una palabra en el mapa*")
print("----Palabra a buscar = 'Java'----")
print("************************************************")
buscar = "Java"
busqueda = mapa.buscar("Java")
if busqueda != None:
    print("La palabra "+buscar+" se encuentra en el mapa")
    print(buscar+": "+busqueda)
else:
    print("La palabra "+buscar+" no se encuentra en el mapa")
input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA CONTINUAR...")

print("************************************************")
print("*ORDENANDO EL MAPA EN ORDEN ALFABETICO*")
print("************************************************")
mapa.ordenar()
mapa.imprimir()
input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA CONTINUAR...")

print("************************************************")
print("*DESORDENANDO EL MAPA*")
print("************************************************")
mapa.desordenar()
mapa.imprimir()
input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA CONTINUAR...")

print("************************************************")
print("*ELIMINAR UNA PALABRA DEL MAPA*")
print("----Palabra a eliminar = 'PHP'----")
print("************************************************")
eliminar = "PHP"
mapa.eliminar(eliminar)
mapa.imprimir()
input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA CONTINUAR...")

print("************************************************")
print("*INSERTANDO PALABRAS Y SIGNIFICADO EN EL MAPA*")
print("----Palabra a insertar = 'GO'----")
print("----Significado de la palabra = 'Lenguaje auspiciado por Google'----")
print("************************************************")
insertar = "GO"
significado = "Lenguaje auspiciado por Google"
mapa.insertar(insertar, significado)
mapa.imprimir()
input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA CONTINUAR...")

print("************************************************")
print("*RECORRIDO DE INICIO A FIN*")
print("************************************************")
mapa.recorridoInicioFin()
print("************************************************")
input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA CONTINUAR...")

print("************************************************")
print("*RECORRIDO DE FIN A INICIO*")
print("************************************************")
mapa.recorridoFinInicio()
print("************************************************")
input("PRESIONE UNA TECLA PARA ENTER/INTRO PARA CONTINUAR...")