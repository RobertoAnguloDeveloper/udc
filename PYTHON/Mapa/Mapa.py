class Mapa :
    mapa = {}

    def agregar(self, palabra, significado):
        self.mapa[palabra] = significado
    
    def buscar(self, palabra):
        return self.mapa[palabra]
    
    def ordenar(self):
        return sorted(self.mapa)
    
    def desordenar(self):
        return sorted(self.mapa, reverse=True)

    def eliminar(self, palabra):
        del self.mapa[palabra]

    def insertar(self, palabra, significado):
        self.mapa[palabra] = significado

    def recorridoInicioFin(self):
        for key in self.mapa:
            print(key+': '+self.mapa[key])
    

    def recorridoFinInicio(self):
        mapaInvertido = self.mapa
        sorted(mapaInvertido, reverse=True)
        for key in mapaInvertido:
            print(key+': '+mapaInvertido[key])

    def imprimir(self):
        print("******************************************************")
        print("*******DICCIONARIO DE LENGUAJES DE PROGRAMACIÓN*******")
        print("******************************************************")
        for key in self.mapa:
            print(key+': '+self.mapa[key])
