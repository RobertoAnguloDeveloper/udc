package JAVA.Pila;

public class Carro {
    private String marca;
    private String modelo;
    private String color;
    private String placa;

    public Carro(String marca, String modelo, String color, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String toString() {
        return "*****************"+"\nMarca: " + marca + "\nModelo: " 
        + modelo + "\nColor: " + color + "\nPlaca: " 
        + placa+"\n*****************";
    }
}
