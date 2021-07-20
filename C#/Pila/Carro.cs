//Build the class Carro with the following properties:
//- string marca;
//- string modelo;
//- string color;
//- string placa;

class Carro {
    string marca;
    string modelo;
    string color;
    string placa;

    public Carro(string marca, string modelo, string color, string placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
    }

    public string getMarca() {
        return this.marca;
    }

    public string getModelo() {
        return this.modelo;
    }

    public string getColor() {
        return this.color;
    }

    public string getPlaca() {
        return this.placa;
    }

    public void setMarca(string marca) {
        this.marca = marca;
    }

    public void setModelo(string modelo) {
        this.modelo = modelo;
    }

    public void setColor(string color) {
        this.color = color;
    }

    public void setPlaca(string placa) {
        this.placa = placa;
    }

    public override string ToString() {
        return "*****************"+"\nMarca: " + marca + "\nModelo: " 
        + modelo + "\nColor: " + color + "\nPlaca: " 
        + placa+"\n*****************";
    }
}
