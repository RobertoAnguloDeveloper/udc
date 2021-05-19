/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej5;

/**
 *
 * @author hacke
 */
public class Empleado {
    private int codigoVendedor;
    private String nombre;
    private double salarioBasico;
    private double valorVenta;
    private double comision;

    public Empleado(int codigoVendedor, String nombre, double salarioBasico, double valorVenta) {
        this.codigoVendedor = codigoVendedor;
        this.nombre = nombre;
        this.salarioBasico = salarioBasico;
        this.valorVenta = valorVenta;
    }
    
    public double comision(){
        if(valorVenta >= 250 && valorVenta <= 300){
            comision = valorVenta*0.20;
        }else if(valorVenta >= 300 && valorVenta <= 450){
            comision = valorVenta*0.25;
        }else if(valorVenta > 450){
            comision = salarioBasico*0.30;
        }
        return comision;
    }
    
    public void imprimir(){
        System.out.println("CODIGO DEL VENDEDOR: "+codigoVendedor
                +"\nNOMBRE DEL VENDEDOR: "+nombre
                +"\nCOMISION DEL VENDEDOR: "+comision);
    }

    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public double getValorVenta() {
        return valorVenta;
    }
}
