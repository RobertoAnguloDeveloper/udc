package JAVA.Mapa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    Map<String, String> mapa;

    public Mapa() {
        mapa = new HashMap<String, String>();
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
        
        Map<String, String> aux = mapa;

        for (int i = 0; i < palabras.length; i++) {
            String significado = mapa.get(palabras[i]);
            mapa.replace(palabras[i], significado);
            //System.out.println(palabras[i]+" "+mapa.get(palabras[i]));
        }
        
        System.out.println(mapa);
    }

    public void desordenar() {
        String[] palabras = mapa.keySet().toArray(new String[mapa.keySet().size()]);
        Arrays.sort(palabras, (s1, s2) -> s2.compareTo(s1));
        Map<String, String> aux = new HashMap<String, String>();
        aux = mapa;

        for (int i = 0; i < palabras.length; i++) {
            mapa.replace(palabras[i], aux.get(palabras[i]));
        }
        
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
        for (Map.Entry<String, String> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
