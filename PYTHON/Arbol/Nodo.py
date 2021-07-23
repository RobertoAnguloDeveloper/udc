
class Nodo:
    valor = None
    izquierda = None
    derecha = None
    
    def __init__(self, valor=None, izquierda=None, derecha=None):
        self.valor = valor
        self.izquierda = izquierda
        self.derecha = derecha
    
    def agregar(self, valor):
        if self.valor == None:
            self.valor = valor
        else:
            if self.valor < valor:
                if self.derecha == None:
                    self.derecha = Nodo(valor)
                else:
                    self.derecha.agregar(valor)
            else:
                if self.izquierda == None:
                    self.izquierda = Nodo(valor)
                else:
                    self.izquierda.agregar(valor)
    
    def buscar(self, valor):
        if self.valor == valor:
            return True
        elif self.valor < valor:
            if self.derecha == None:
                return False
            else:
                return self.derecha.buscar(valor)
        else:
            if self.izquierda == None:
                return False
            else:
                return self.izquierda.buscar(valor)
    
    def ordenar(self):
        if self.izquierda != None:
            self.izquierda.ordenar()
        print(self.valor)
        if self.derecha != None:
            self.derecha.ordenar()
        
    def desordenar(self):
        if self.izquierda != None:
            self.izquierda.desordenar()
        print(self.valor)
        if self.derecha != None:
            self.derecha.desordenar()
        
    def eliminar(self, valor):
        if self.valor == valor:
            if self.izquierda == None and self.derecha == None:
                self.valor = None
            elif self.izquierda == None:
                self.valor = self.derecha.valor
                self.derecha = self.derecha.derecha
            elif self.derecha == None:
                self.valor = self.izquierda.valor
                self.izquierda = self.izquierda.izquierda
            else:
                aux = self.izquierda
                while aux.derecha != None:
                    aux = aux.derecha
                self.valor = aux.valor
                aux.derecha = None
        elif valor < self.valor:
            if self.izquierda == None:
                return False
            else:
                self.izquierda.eliminar(valor)
        else:
            if self.derecha == None:
                return False
            else:
                self.derecha.eliminar(valor)
    
    def insertar(self, posicion, valor):
        if self.izquierda == None:
            self.agregar(valor)
        else:
            self.izquierda.insertar(posicion, valor)
        return self.izquierda
    
    def recorridoInicioFin(self):
        if self.izquierda != None:
            self.izquierda.recorridoFinInicio()
        print(self.valor)
        if self.derecha != None:
            self.derecha.recorridoFinInicio()
        
    def recorridoFinInicio(self):
        if self.derecha != None:
            self.derecha.recorridoInicioFin()
        print(self.valor)
        if self.izquierda != None:
            self.izquierda.recorridoInicioFin()
    
    def imprimir(self):
        if self.izquierda != None:
            self.izquierda.imprimir()
        print(self.valor)
        if self.derecha != None:
            self.derecha.imprimir()