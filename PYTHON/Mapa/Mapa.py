import collections

class Mapa :
    mapa = {}
    mapaOrdenado = {}
    size = 0

    def agregar(self, palabra, significado):
        self.mapa[palabra] = significado
        self.size = len(self.mapa)
    
    def buscar(self, palabra):
        return self.mapa[palabra]
    
    def ordenar(self):
        self.mapa = collections.OrderedDict(sorted(self.mapa.items()))
    
    def desordenar(self):
        self.mapa = collections.OrderedDict(sorted(self.mapa.items(), reverse=True))

    def eliminar(self, palabra):
        del self.mapa[palabra]

    def insertar(self, palabra, significado):
        self.mapa[palabra] = significado

    def recorridoInicioFin(self):
        for key in self.mapa:
            print(key+': '+self.mapa[key])
    
    def recorridoFinInicio(self):
        mapaInvertido = collections.OrderedDict(sorted(self.mapa.items()))
        for key in mapaInvertido:
            print(key+': '+mapaInvertido[key])

    def imprimir(self):
        print("****************************************************************************************************************")
        print("*******DICCIONARIO DE LENGUAJES DE PROGRAMACIÓN*******")
        print("****************************************************************************************************************")
        for key in self.mapa:
            print(key+': '+self.mapa[key])
