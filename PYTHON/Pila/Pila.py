from Carro import Carro

class Pila:
    pila = [Carro]
    size = 0

    def agregar(self, carro):
        self.pila.append(carro)
        self.size += 1
    
    def buscar(self, placa):
        for i in range(1, self.size+1) :
            if self.pila[i].getPlaca() == placa :
                return self.pila[i]

    def imprimir(self):
        for i in range(1, self.size+1) :
            print(i, self.pila[i].toString())
        