/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EP2U1;

/**
 *
 * @author hacke
 */
public class Vendedor {
    private String id;
    private String formaPago;
    private double compra;
    private double comision;
    private int porcentajeComision;

    public Vendedor(String id, String formaPago, double compra) {
        this.id = id;
        this.formaPago = formaPago;
        this.compra = compra;
        
        comision = compra*0.07;
        porcentajeComision = 7;
        switch(formaPago){
            case "efectivo":
                comision += compra*0.15;
                porcentajeComision += 15;
                break;
            
            case "cheque":
                comision += compra*0.10;
                porcentajeComision += 10;
                break;
                
            case "tarjeta":
                comision += compra*0.05;
                porcentajeComision += 5;
                break;
        }
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(int porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        this.compra = compra;
    }
    
    
}
