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
    
    public double comision(){
        if(valorVenta > 250 && valorVenta < 300){
            comision = valorVenta*0.20;
        }else if(valorVenta > 300 && valorVenta < 450){
            comision = valorVenta*0.25;
        }else if(valorVenta > 450){
            comision = salarioBasico*0.30;
        }
        return comision;
    }

    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }
    
    
}
