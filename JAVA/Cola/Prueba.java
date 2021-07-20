package JAVA.Cola;

import java.util.Arrays;
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

        Integer[] x = new Integer[5];
        cola.toArray(x);

        int pos = 3;
        Integer [] nuevo = new Integer[x.length+1];
        Integer [] nuevoLeft = Arrays.copyOfRange(x, 0, pos);
        Integer [] nuevoRight = Arrays.copyOfRange(x, pos, x.length);

        for (int i = 0; i < nuevoLeft.length; i++) {
            nuevo[i] = nuevoLeft[i];
        }

        nuevo[pos] = 77;

        for (int i = pos+1, j = 0; i < nuevo.length; i++, j++) {
            nuevo[i] = nuevoRight[j];
        }

        for (Integer integer : nuevo) {
            System.out.println(integer);
        }
        //System.out.println(nuevo[5]);

        
    }
}
