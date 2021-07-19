package JAVA;

import java.util.Iterator;
import java.util.Stack;

import JAVA.Pilas.Carro;

public class Principal {
    public static void main(String[] args) {
        //INSTANCIANDO CARROS
        Carro carro1 = new Carro("Mazda", "RX4", "Rojo", "ABB 375");
        Carro carro2 = new Carro("Mazda", "3", "Verde", "ABC 745");
        Carro carro3 = new Carro("Mazda", "2", "Azul", "ADZ 274");
        Carro carro4 = new Carro("Renault", "Logan", "Negro", "XBY 995");
        Carro carro5 = new Carro("KIA", "Sportage", "Blanco", "ZBQ 885");
        
        //APILANDO LOS CARROS (AGREGAR)
        Stack<Carro> carros = new Stack<>();
        carros.push(carro1);
        carros.push(carro2);
        carros.push(carro3);
        carros.push(carro4);
        carros.push(carro5);

        //IMPRIMIENDO LA PILA
        int i = 0;
        while(!carros.isEmpty()) {
            System.out.println("Carro "+(++i)+" = "+carros.pop().toString());
        }
    }
}
