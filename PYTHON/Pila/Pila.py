class Pila:
    def __init__(self):
        self.pila = []
        self.size = 0
        self.arrayPila = []

    def agregar(self, carro):
        self.pila.append(carro)
        self.size += 1
        self.arrayPila.append(carro)
    
    