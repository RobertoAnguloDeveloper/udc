package Ej5;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hacke
 */
public class Ej5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        Empleado [] arreglo = new Empleado[10];
        
        int cod;
        String nombre;
        double salario, venta;
        
        //TIRA ERROR// public Empleado(int codigoVendedor, String nombre, double salarioBasico, double valorVenta, double comision)
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Ingresa el codigo");
            cod = in.nextInt();
            System.out.println("Ingresa el nombre");
            nombre = in.next();
            System.out.println("Ingresa el Salario basico");
            salario = in.nextDouble();
            System.out.println("Ingrese valor de la venta");
            venta = in.nextDouble();
            
            arreglo[i] = new Empleado(cod,nombre, salario, venta);
            arreglo[i].comision();
        }
        
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i].imprimir();
        }
    }
}
