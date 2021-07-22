from Estudiante import Estudiante

class Cola :
    cola = [Estudiante]
    size = 0
    def __init__(self):
        self.cola = [Estudiante]
        self.size = 0

    def agregar(self, elemento):
        self.cola.append(elemento)
        self.size += 1
        
    def buscar(self, numeroIdentificacion) :
        for i in range(1, self.size+1) :
            if self.cola[i].getNumeroIdentificacion() == numeroIdentificacion:
                return self.cola[i]

    def ordenar(self):
        for i in range(1, self.size+1) :
            for j in range(i, self.size+1) :
                if self.cola[i].getNumeroIdentificacion() > self.cola[j].getNumeroIdentificacion() :
                    aux = self.cola[i]
                    self.cola[i] = self.cola[j]
                    self.cola[j] = aux
        
    def desordenar(self) :
        for i in range(1, self.size+1) :
            for j in range(i, self.size+1) :
                if self.cola[i].getNumeroIdentificacion() < self.cola[j].getNumeroIdentificacion() :
                    aux = self.cola[i]
                    self.cola[i] = self.cola[j]
                    self.cola[j] = aux
    
    #EDITAR METODO DANADO AQUI
    def eliminar(self, numeroIdentificacion) :
        estudiante = self.buscar(numeroIdentificacion)
        if estudiante != None :
            self.cola.pop()
            self.size = len(self.cola)
        else :
            return "No existe el elemento"

    def insertar(self, pos, e) :
        self.cola.insert(pos, e)
        self.size = len(self.cola)
    
    def recorrerInicioFin(self) :
        for i in range(1, self.size+1) :
            print(self.cola[i].toString())
    
    def recorrerFinInicio(self) :
        for i in reversed(range(1, self.size+1)) :
            print(i, self.cola[i].toString())

        
    def imprimir(self) :
        for i in range(1, self.size+1) :
            print(self.cola[i].toString())
            print("********************************")