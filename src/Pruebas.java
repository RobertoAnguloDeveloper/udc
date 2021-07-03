import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

import EstructuraDatos.ArbolBinario;
import EstructuraDatos.Nodo;

public class Pruebas {
    public static void main(String[] args) throws Exception {
        /*System.out.println(20 << 2); //20 * 2 = 40 luego 40 * 2 = 80
        System.out.println(20 >> 2); //20 / 2 = 10 luego 10 / 2 = 5*/

        boolean ctrl = false;
        int relacion = 0;
        Scanner key = new Scanner(System.in);
        do {
            try{
                relacion = Integer.valueOf(JOptionPane.showInputDialog(null, "INGRESE DATO", "PRUEBA"
                , JOptionPane.INFORMATION_MESSAGE));
                ctrl = false;
            }catch (NumberFormatException err){
                System.out.println("SOLO NUMERO 0 o 1");
                ctrl = true;
            }
        }while(ctrl);
        
        /*Nodo nodo1 = new Nodo('K');
        Nodo nodo2 = new Nodo('B');
        Nodo nodo3 = new Nodo('W');
        Nodo nodo4 = new Nodo('A');
        Nodo nodo5 = new Nodo('F');
        Nodo nodo6 = new Nodo('M');
        Nodo nodo7 = new Nodo('Z');
        Nodo nodo8 = new Nodo('D');
        Nodo nodo9 = new Nodo('L');
        Nodo nodo10 = new Nodo('O');
        Nodo nodo11 = new Nodo('P');
        ArbolBinario arbol = new ArbolBinario();

        arbol.agregarNodo(nodo1, null);
        arbol.agregarNodo(nodo2, nodo1);
        arbol.agregarNodo(nodo3, nodo1);
        arbol.agregarNodo(nodo4, nodo2);
        arbol.agregarNodo(nodo5, nodo2);
        arbol.agregarNodo(nodo6, nodo3);
        arbol.agregarNodo(nodo7, nodo3);
        arbol.agregarNodo(nodo8, nodo5);
        arbol.agregarNodo(nodo9, nodo6);
        arbol.agregarNodo(nodo10, nodo6);
        arbol.agregarNodo(nodo11, nodo10);*/

        //System.out.println("PADRE DE B = "+nodo2.getPadre().getDato());
        /*arbol.preOrden(nodo1);
        arbol.imprimir(nodo1);
        System.out.println(nodo10.getDato()+" = "+nodo10.getTipo());
        System.out.println("HOJAS = "+arbol.getContadorHojas());
        System.out.println("NODO = "+arbol.getRaiz().getDerecho().getDerecho().getDato());
        System.out.println("NIVEL = "+arbol.getRaiz().getDerecho().getDerecho().getNivel());
        System.out.println("TIPO = "+arbol.getRaiz().getDerecho().getDerecho().getTipo());
        System.out.println("CANTIDAD DE NODOS = "+arbol.getContadorNodos());*/

        /*System.out.println(arbol.getRaiz().getDato()+" <---Nivel 0");
        System.out.println(arbol.getRaiz().getIzquierdo().getDato()+" - "+arbol.getRaiz().getDerecho().getDato()+" <---Nivel 1");
        System.out.println(arbol.getRaiz().getIzquierdo().getIzquierdo().getDato()+" - "
                            +arbol.getRaiz().getIzquierdo().getDerecho().getDato()+" - "
                            +arbol.getRaiz().getDerecho().getIzquierdo().getDato()+" - "
                            +arbol.getRaiz().getDerecho().getDerecho().getDato()+" <---Nivel 2");
        System.out.println(arbol.getRaiz().getIzquierdo().getDerecho().getIzquierdo().getDato()+" - "
                            +arbol.getRaiz().getDerecho().getIzquierdo().getIzquierdo().getDato()+" - "
                            +arbol.getRaiz().getDerecho().getIzquierdo().getDerecho().getDato()+" <---Nivel 3");
        System.out.println(arbol.getRaiz().getDerecho().getIzquierdo().getDerecho().getIzquierdo().getDato()+" <---Nivel 4");*/

        /*ArrayList<ArrayList<Integer>> prueba = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> numeros2 = new ArrayList<Integer>();

        numeros.add(10);
        numeros.add(4);
        numeros.add(6);
        numeros.add(7);

        prueba.add(numeros);

        numeros.add(3);
        numeros.add(8);
        numeros.add(9);
        numeros.add(17);

        prueba.add(numeros2);

        System.out.println("FILAS = "+prueba.size());
        System.out.println("COLUMNAS = "+prueba.get(0).size());*/
    }
}
