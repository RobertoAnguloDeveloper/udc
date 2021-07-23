class Lista:
    def __init__(self):
        self.paises = []

    def agregar(self,pais):
        self.paises.append(pais)

    def buscar(self,pais):
        for i in self.paises:
            if pais:
                return True
        return False

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