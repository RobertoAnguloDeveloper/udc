package JAVA.Arboles;

import java.util.ArrayList;
import java.util.TreeMap;

public class PrincipalArbol2 {
    //Implement the main method using the class ArbolBinario as an int Binary tree
    public static void main(String[] args) {
        TreeMap<Integer, Integer> mapa = new TreeMap<>();
        mapa.put(0, 1);
        mapa.put(1, 2);
        mapa.put(10, 10);
        mapa.put(3, 4);
        mapa.put(7, 52);
        mapa.put(5, 6);
        mapa.put(6, 7);

        System.out.println(mapa.headMap(7));
        ;
        System.out.println("**********");
        mapa.descendingMap().forEach((k, v) -> System.out.println(k + " " + v));
        
    }
     
}
