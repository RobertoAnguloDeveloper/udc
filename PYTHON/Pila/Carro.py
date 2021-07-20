class Carro :
    marca = ""
    modelo = ""
    color = ""
    placa = ""
    
    def __init__(self, marca, modelo, color, placa) :
        self.marca = marca
        self.modelo = modelo
        self.color = color
        self.placa = placa

    def getMarca(self):
        return self.marca
    
    def getModelo(self):
        return self.modelo
    
    def getColor(self):
        return self.color
    
    def getPlaca(self):
        return self.placa

    def toString(self):
        return "\nMarca: " + self.marca + "\nModelo: " + self.modelo + "\nColor: " + self.color + "\nPlaca: " + self.placa
