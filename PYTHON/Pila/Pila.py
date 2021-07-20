from Carro import Carro

class Pila:
    pila = [Carro]
    size = 0

    def agregar(self, carro):
        self.pila.append(carro)
        self.size += 1
    
    def imprimir(self):
        for i in range(1, self.size+1) :
            print(i, self.pila[i].toString())
        