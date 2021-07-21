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

    def ordenar(self):
        for i in range(1, self.size+1) :
            for j in range(1, self.size+1) :
                if self.pila[j].getPlaca() > self.pila[i].getPlaca() :
                    aux = self.pila[i]
                    self.pila[i] = self.pila[j]
                    self.pila[j] = aux

    def desordenar(self):
        for i in range(1, self.size+1) :
            for j in range(1, self.size+1) :
                if self.pila[j].getPlaca() < self.pila[i].getPlaca() :
                    aux = self.pila[i]
                    self.pila[i] = self.pila[j]
                    self.pila[j] = aux

    def eliminar(self, placa):
        resultado = 0
        for i in range(1, self.size+1) :
            if self.pila[i].getPlaca() == placa :
                self.pila.pop(i)
                self.size -= 1
                resultado = 1
                break
            else :
                resultado = -1
        return resultado

    def insertar(self, pos, carro):
        self.pila.insert(pos, carro)
        self.size += 1
        return 0

    def recorrerInicioFin(self):
        for i in range(1, self.size+1) :
            print(i, self.pila[i].toString())
    
    def recorrerFinInicio(self):
        for i in reversed(range(1, self.size+1)) :
            print(i, self.pila[i].toString())

    def imprimir(self):
        for i in range(1, self.size+1) :
            print(i, self.pila[i].toString())
        