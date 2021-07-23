package JAVA.Mapa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapa {
    private Map<String, String> mapa;
    private TreeMap<String, String> mapaOrdenado, mapaDesordenado;

    public Mapa() {
        mapa = new HashMap<String, String>();
        mapaOrdenado = new TreeMap<String, String>();
        mapaDesordenado = new TreeMap<String, String>();
    }

    public void agregar(String palabra, String significado) {
        mapa.put(palabra, significado);
    }

    public String buscar(String palabra) {
        return mapa.get(palabra);
    }

    public void ordenar() {
        String[] palabras = mapa.keySet().toArray(new String[mapa.keySet().size()]);

        Arrays.sort(palabras, (s1, s2) -> s1.compareTo(s2));
        
        for (int i = 0; i < palabras.length; i++) {
            mapaOrdenado.put(palabras[i], mapa.get(palabras[i]));
        }
        mapa = mapaOrdenado;
    }

    public void desordenar() {
        String[] palabras = mapa.keySet().toArray(new String[mapa.keySet().size()]);

        Arrays.sort(palabras, (s1, s2) -> s2.compareTo(s1));
        
        for (int i = 0; i < palabras.length; i++) {
            mapaDesordenado.put(palabras[i], mapa.get(palabras[i]));
        }
        mapa = mapaDesordenado;        
    }

    public void eliminar(String palabra) {
        mapa.remove(palabra);
    }

    public void insertar(String palabra, String significado) {
        mapa.put(palabra, significado);
    }

    public void recorridoInicioFin() {
        for (Map.Entry<String, String> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }

    public void recorridoFinInicio() {
        String[] keys = new String[mapa.size()];
        keys = mapa.keySet().toArray(keys);
        for (int i = keys.length - 1; i >= 0; i--) {
            System.out.println(keys[i] + ": " + mapa.get(keys[i]));
        }
    }

    public void imprimir() {
        System.out.println("******************************************************");
        System.out.println("*******DICCIONARIO DE LENGUAJES DE PROGRAMACIÓN*******");
        System.out.println("******************************************************");
        for (Map.Entry<String, String> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
