package JAVA.Lista;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class Lista{
        private LinkedList<String> lista;
        
        public Lista(){
            lista = new LinkedList<String>();
        }

        public void agregar(String pais){
            lista.add(pais);
        }

        public String buscar(String pais){
            Iterator<String> it = lista.iterator();
            while(it.hasNext()){
                String obj = it.next();
                if(obj.equals(pais)){
                    return obj;
                }
            }
            return null;
        }

        public void ordenar(){
            Collections.sort(lista);
        }

        public void desordenar(){
            Collections.sort(lista, Collections.reverseOrder());
        }

        public void eliminar(String pais){
            lista.remove(pais);
        }

        public void insertar(int pos, String pais){
            lista.add(pos, pais);
        }

        public void recorridoInicioFin(){
            Iterator<String> it = lista.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }

        public void recorridoFinInicio(){
            desordenar();
            Iterator<String> it = lista.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
            ordenar();
        }

        public void imprimir(){
            Iterator<String> it = lista.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }