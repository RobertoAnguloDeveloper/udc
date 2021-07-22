#Build a class Lista with the methods:
#agregar(self,pais)
#buscar(self,pais)
#ordenar(self)
#desordenar(self)
#eliminar(self,pais)
#insertar(self,posicion,pais)
#recorridoInicioFin(self)
#recorridoFinInicio(self)
#imprimir(self)

class Lista:
    def __init__(self):
        self.paises = []

    def agregar(self,pais):
        self.paises.append(pais)

    def buscar(self,pais):
        return self.paises.index(pais)

    def ordenar(self):
        self.paises.sort()

    def desordenar(self):
        self.paises.sort(reverse=True)

    def eliminar(self,pais):
        self.paises.remove(pais)

    def insertar(self,posicion,pais):
        self.paises.insert(posicion,pais)

    def recorridoInicioFin(self):
        print(self.paises)

    def recorridoFinInicio(self):
        print(self.paises[::-1])

    def imprimir(self):
        print(self.paises)
