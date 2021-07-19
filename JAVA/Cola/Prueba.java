package JAVA.Cola;

import java.util.LinkedList;
import java.util.Queue;

public class Prueba {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        cola.add(5);

        for (Integer integer : cola) {
            System.out.println(integer);
        }
        
        System.out.println("--*-*-*");
        for (Integer integer : cola) {
            System.out.println(integer);
        }
    }
}
