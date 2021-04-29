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
public class Gasolinera {
    private int claseServicio;
    private String jornada;
    private double valorServicio;

    public Gasolinera(int claseServicio, String jornada, double valorServicio) {
        this.claseServicio = claseServicio;
        this.jornada = jornada;
        this.valorServicio = valorServicio;
    }

    public int getClaseServicio() {
        return claseServicio;
    }

    public void setClaseServicio(int claseServicio) {
        this.claseServicio = claseServicio;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public double getValorServicio() {
        return valorServicio;
    }

    public void setValorServicio(double valorServicio) {
        this.valorServicio = valorServicio;
    }
    
    
}
