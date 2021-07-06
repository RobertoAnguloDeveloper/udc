package EstructuraDatos;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class NodoBplus {
    public boolean esHoja;
    public boolean esRaiz;
    public NodoBplus pariente;
    public List<NodoBplus> hijos;
    public List<Entry<Integer,Object>> entradas;
    public NodoBplus anterior;
    public NodoBplus siguiente;

    public NodoBplus(boolean esHoja){
        this.esHoja = esHoja;
        entradas = new ArrayList<Entry<Integer, Object>>();
        if(!esHoja){
            hijos = new ArrayList<NodoBplus>();
        }
    }

    public NodoBplus(boolean esHoja,boolean esRaiz){
        this(esHoja);
        this.esRaiz = esRaiz;
    }

    public void setEntradas(List<Entry<Integer,Object>> entradas){
        this.entradas = entradas;
    }
    public List<Entry<Integer,Object>> getEntradas(){
        return entradas;
    }

    public Object buscar(Integer clave){
        if(esHoja){
            for(Entry<Integer,Object> entrada : entradas){
                if(entrada.getKey().compareTo(clave) == 0){
                    return entrada.getValue();
                }
            }
            return null;
        }
        else{
            if(clave.compareTo(entradas.get(0).getKey()) <= 0 ){
                return hijos.get(0).buscar(clave);
            }
            else if(clave.compareTo(entradas.get(entradas.size()-1).getKey()) >= 0){
                return  hijos.get(hijos.size()-1).buscar(clave);
            }
            else{
                for(int i = 0; i < entradas.size(); i++){
                    if(clave.compareTo(entradas.get(i).getKey()) >= 0 && clave.compareTo(entradas.get(i+1).getKey()) < 0){
                        return hijos.get(i).buscar(clave);
                    }
                }
            }
        }
        return null;
    }

    public boolean insertarActualizar(Integer clave,Object valor, ArbolBplus arbol){
        Entry<Integer,Object> objetoInsertar = new SimpleEntry<Integer, Object>(clave, valor);
        if(esHoja){
            if(entradas.size() == 0){
                entradas.add(objetoInsertar);
                   return true;
            }
            if(entradas.size() < arbol.getOrden()){
                insertarClave(objetoInsertar);
                if(this.pariente != null){
                    pariente.actualizarNodo(arbol);
                }
            }
            else{
                insertarClave(objetoInsertar);
                if(entradas.size() == arbol.getOrden()){
                    return true;
                }
                NodoBplus izquierdo = new NodoBplus(true);
                NodoBplus derecho = new NodoBplus(true);
                if(anterior != null){
                    anterior.siguiente = izquierdo;
                    izquierdo.anterior = anterior;
                }
                if(siguiente != null){
                    siguiente.anterior = derecho;
                    derecho.siguiente = siguiente;
                }
                if(anterior == null){
                    izquierdo.anterior = null;
                    arbol.cabeza = izquierdo;
                }
                izquierdo.siguiente = derecho;
                derecho.anterior = izquierdo;
                anterior = null;
                siguiente = null;

                int izquierdoSize = (arbol.getOrden() + 1) / 2 + (arbol.getOrden() + 1) % 2;
                int derechoSize = (arbol.getOrden()+ 1) / 2;
                for(int i = 0; i < izquierdoSize; i++){
                    izquierdo.entradas.add(entradas.get(i));
                }
                for(int i = 0; i < derechoSize; i++){
                    derecho.entradas.add(entradas.get(izquierdoSize + i));
                }

                if(pariente != null){
                    int indice = pariente.hijos.indexOf(this);
                    pariente.hijos.remove(this);
                    izquierdo.pariente = pariente;
                    derecho.pariente = pariente;
                    pariente.hijos.add(indice,izquierdo);
                    pariente.hijos.add(indice+1,derecho);
                    setEntradas(null);
                    hijos = null;
                    pariente.actualizarInsertar(arbol);
                    pariente = null;
                }
                else{
                    esRaiz = false;
                    NodoBplus raiz = new NodoBplus(false,true);
                    arbol.raiz = raiz;
                    izquierdo.pariente = raiz;
                    derecho.pariente = raiz;
                    raiz.hijos.add(izquierdo);
                    raiz.hijos.add(derecho);
                    setEntradas(null);
                    hijos = null;

                    raiz.actualizarInsertar(arbol);
                }
            }
        }
        else{
            if (clave.compareTo(entradas.get(0).getKey()) <= 0) {
                hijos.get(0).insertarActualizar(clave, valor, arbol);
            }
            else if (clave.compareTo(entradas.get(entradas.size()-1).getKey()) >= 0) {
                hijos.get(hijos.size()-1).insertarActualizar(clave, valor, arbol);
            }else {
                for (int i = 0; i < entradas.size(); i++) {
                    if (entradas.get(i).getKey().compareTo(clave) <= 0 && entradas.get(i+1).getKey().compareTo(clave) > 0) {
                        hijos.get(i).insertarActualizar(clave, valor, arbol);
                        break;
                    }
                }
            }
        }

        return false;
    }

    public void eliminar(Integer clave, ArbolBplus arbol){
        if(esHoja){
            int condicion = 0;
            for(Entry<Integer, Object> entrada : entradas){
                if(entrada.getKey().compareTo(clave)== 0){
                    condicion = 1;
                    break;
                }
            }
            if(condicion == 0){
                return;
            }

            if(esHoja && esRaiz){
                eliminar(clave);
            }
            else{
                if(entradas.size() > arbol.getOrden()/2 && entradas.size() > 2){
                     eliminar(clave);
                }
                else{
                    if(anterior != null && anterior.entradas.size() > arbol.getOrden()/2
                            && anterior.entradas.size() > 2
                            && anterior.pariente == pariente){
                        Entry<Integer, Object> entrada = anterior.getEntradas().get(anterior.getEntradas().size()-1);
                        anterior.getEntradas().remove(anterior.getEntradas().size()-1);
                        entradas.add(0, entrada);
                        eliminar(clave);
                    }
                    else if(siguiente != null && siguiente.entradas.size() > arbol.getOrden()/2
                            && siguiente.entradas.size() > 2
                            && siguiente.pariente == pariente){
                        Entry<Integer, Object> entrada = siguiente.getEntradas().get(0);
                        siguiente.getEntradas().remove(0);
                        entradas.add(entrada);
                        eliminar(clave);
                    }
                    else{
                        if (anterior != null
                                && (anterior.getEntradas().size() <= arbol.getOrden() / 2 || anterior.getEntradas().size() <= 2)
                                && anterior.pariente == pariente) {
                            for (int i = anterior.getEntradas().size()-1; i >= 0; i--){
                                entradas.add(0,anterior.getEntradas().get(i));
                            }
                            eliminar(clave);
                            anterior.setEntradas(null);
                            anterior.pariente = null;
                            pariente.hijos.remove(anterior);

                            if(anterior.anterior != null){
                                anterior.anterior.siguiente = this;
                                NodoBplus temp = anterior;
                                this.anterior = anterior.anterior;
                                temp.anterior = null;
                                temp.siguiente = null;
                            }
                            else{
                                arbol.cabeza = this;
                                anterior.siguiente = null;
                                anterior = null;
                            }
                        }
                        else if(siguiente != null
                                && (siguiente.getEntradas().size() <= arbol.getOrden() / 2 || siguiente.getEntradas().size() <= 2)
                                && siguiente.pariente == pariente){
                            for (int i = 0; i < siguiente.getEntradas().size(); i++){
                                entradas.add(siguiente.getEntradas().get(i));
                            }
                            eliminar(clave);
                            siguiente.setEntradas(null);
                            siguiente.pariente = null;
                            pariente.hijos.remove(siguiente);

                            if(siguiente.siguiente != null){
                                siguiente.siguiente.anterior = this;
                                NodoBplus temp = siguiente;
                                this.siguiente = siguiente.siguiente;
                                temp.anterior = null;
                                temp.siguiente = null;
                            }
                            else{
                                siguiente.anterior = null;
                                siguiente = null;
                            }
                        }
                    }
                }
                pariente.actualizarEliminado(arbol);
            }
        }
        else{
            if (clave.compareTo(entradas.get(0).getKey()) <= 0) {
                hijos.get(0).eliminar(clave, arbol);
            }else if (clave.compareTo(entradas.get(entradas.size()-1).getKey()) >= 0) {
                hijos.get(hijos.size()-1).eliminar(clave, arbol);
            }else {
                for (int i = 0; i < entradas.size(); i++) {
                    if (entradas.get(i).getKey().compareTo(clave) <= 0 && entradas.get(i+1).getKey().compareTo(clave) > 0) {
                        hijos.get(i).eliminar(clave, arbol);
                        break;
                    }
                }
            }
        }
    }

    public void actualizarEliminado(ArbolBplus arbol){
        actualizarNodo(arbol);
        if(hijos.size() < arbol.getOrden()/2 || hijos.size() < 2){
            if(esRaiz){
                if(hijos.size() >= 2){
                    return;
                }
                else{
                    NodoBplus raiz = hijos.get(0);
                    arbol.raiz = raiz;
                    raiz.esRaiz = true;
                    raiz.pariente = null;
                    setEntradas(null);
                    hijos = null;
                }
            }
            else{
                int indiceAcutual = pariente.hijos.indexOf(this);
                int indiceAnterior = indiceAcutual - 1;
                int indiceSiguiente = indiceAcutual + 1;
                NodoBplus nodoAnterior = null, nodoSiguiente = null;
                if(indiceAnterior >= 0){
                    nodoAnterior = pariente.hijos.get(indiceAnterior);
                }
                if(indiceSiguiente < pariente.hijos.size()){
                    nodoSiguiente = pariente.hijos.get(indiceSiguiente);
                }

                if(nodoAnterior != null && nodoAnterior.hijos.size() > arbol.getOrden()/2 && nodoAnterior.hijos.size() > 2){
                    int indice = nodoAnterior.hijos.size()-1;
                    NodoBplus temp = nodoAnterior.hijos.get(indice);
                    nodoAnterior.hijos.remove(indice);
                    temp.pariente = this;
                    this.hijos.add(0,temp);
                    nodoAnterior.actualizarNodo(arbol);
                    this.actualizarNodo(arbol);
                    pariente.actualizarEliminado(arbol);
                }
                else if(nodoSiguiente != null && nodoSiguiente.hijos.size() > arbol.getOrden()/2 && nodoSiguiente.hijos.size() > 2){
                    NodoBplus temp = nodoSiguiente.hijos.get(0);
                    nodoSiguiente.hijos.remove(0);
                    temp.pariente = this;
                    this.hijos.add(temp);
                    nodoSiguiente.actualizarNodo(arbol);
                    this.actualizarNodo(arbol);
                    pariente.actualizarEliminado(arbol);
                }
                else{
                    if(nodoAnterior != null && (nodoAnterior.hijos.size() <= arbol.getOrden()/2 || nodoAnterior.hijos.size() <= 2)){
                        for(int i = nodoAnterior.hijos.size()-1; i >= 0; i--){
                            NodoBplus node = nodoAnterior.hijos.get(i);
                            this.hijos.add(0, node);
                            node.pariente = this;
                        }
                        nodoAnterior.pariente = null;
                        nodoAnterior.hijos = null;
                        nodoAnterior.setEntradas(null);
                        pariente.hijos.remove(nodoAnterior);
                        this.actualizarNodo(arbol);
                        pariente.actualizarEliminado(arbol);
                    }
                    else if(nodoSiguiente != null && (nodoSiguiente.hijos.size() <= arbol.getOrden()/2 || nodoSiguiente.hijos.size() <= 2)){
                        for(int i =0; i < nodoSiguiente.hijos.size(); i++){
                            NodoBplus node = nodoSiguiente.hijos.get(i);
                            this.hijos.add(node);
                            node.pariente = this;
                        }
                        nodoSiguiente.pariente = null;
                        nodoSiguiente.hijos = null;
                        nodoSiguiente.setEntradas(null);
                        pariente.hijos.remove(nodoSiguiente);
                        this.actualizarNodo(arbol);
                        pariente.actualizarEliminado(arbol);
                    }
                }
            }
        }
    }

    public void eliminar(Integer clave){
        int indice = -1;
        for(int i = 0; i < entradas.size(); i++){
            if(entradas.get(i).getKey().compareTo(clave) == 0){
                indice = i;
                break;
            }
        }
        if(indice != -1){
            entradas.remove(indice);
        }
    }

    public void actualizarInsertar(ArbolBplus arbol){

        actualizarNodo(arbol);

        if (hijos.size() > arbol.getOrden()) {
            NodoBplus izquierdo = new NodoBplus(false);
            NodoBplus derecho = new NodoBplus(false);
            int izquierdoSize = (arbol.getOrden() + 1) / 2 + (arbol.getOrden() + 1) % 2;
            int derechoSize = (arbol.getOrden() + 1) / 2;
            
            for (int i = 0; i < izquierdoSize; i++){
                izquierdo.hijos.add(hijos.get(i));
                izquierdo.getEntradas().add(new SimpleEntry(hijos.get(i).getEntradas().get(0).getKey(), null));
                hijos.get(i).pariente = izquierdo;
            }
            for (int i = 0; i < derechoSize; i++){
                derecho.hijos.add(hijos.get(izquierdoSize + i));
                derecho.getEntradas().add(new SimpleEntry(hijos.get(izquierdoSize + i).getEntradas().get(0).getKey(), null));
                hijos.get(izquierdoSize + i).pariente = derecho;
            }

            if (pariente != null) {
                int indice = pariente.hijos.indexOf(this);
                pariente.hijos.remove(this);
                izquierdo.pariente = pariente;
                derecho.pariente = pariente;
                pariente.hijos.add(indice,izquierdo);
                pariente.hijos.add(indice + 1, derecho);
                setEntradas(null);
                hijos = null;

                pariente.actualizarInsertar(arbol);
                pariente = null;
            }else {
                esRaiz = false;
                NodoBplus pariente = new NodoBplus(false, true);
                arbol.raiz = pariente;
                izquierdo.pariente = pariente;
                derecho.pariente = pariente;
                pariente.hijos.add(izquierdo);
                pariente.hijos.add(derecho);
                setEntradas(null);
                hijos = null;

                pariente.actualizarInsertar(arbol);
            }
        }
    }

    public void actualizarNodo(ArbolBplus arbol){
        if(entradas.size() == hijos.size()){
            for(int i = 0;i < entradas.size();i++){
                Integer clave = hijos.get(i).entradas.get(0).getKey();
                if(entradas.get(i).getKey().compareTo(clave) != 0){
                    entradas.remove(i);
                    entradas.add(i,new SimpleEntry(clave, null));
                    if(!esRaiz){
                        pariente.actualizarNodo(arbol);
                    }
                }
            }
        }
        else if(esRaiz && hijos.size() >= 2 ||
                hijos.size() >= arbol.getOrden()/2 && hijos.size() <= arbol.getOrden() && hijos.size() >= 2){
            entradas.clear();
            for(int i=0; i < hijos.size(); i++){
                Integer clave = hijos.get(i).getEntradas().get(0).getKey();
                entradas.add(new SimpleEntry(clave, null));
                if(!esRaiz){
                    pariente.actualizarNodo(arbol);
                }
            }
        }
    }

    public boolean insertarClave(Entry<Integer,Object> objetoInsertar){
        if(entradas.get(0).getKey().compareTo(objetoInsertar.getKey()) > 0){
            entradas.add(0,objetoInsertar);
            return true;
        }
        else if(entradas.get(entradas.size()-1).getKey().compareTo(objetoInsertar.getKey()) < 0){
            entradas.add(entradas.size(),objetoInsertar);
            return true;
        }
        else{
            int i = 0;
            for(Entry<Integer,Object> entrada : entradas){
                if(entrada.getKey().compareTo(objetoInsertar.getKey()) == 0){
                    entradas.get(i).setValue(objetoInsertar.getValue());
                    return true;
                }
                else if(entrada.getKey().compareTo(objetoInsertar.getKey()) > 0){
                    entradas.add(i,objetoInsertar);
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public void encontrar(ArbolBplus arbol){
        NodoBplus node = arbol.cabeza;
        System.out.print("clave list : ");
        while (node != null){
            for(Entry<Integer, Object> entrada : node.entradas){
                System.out.print(entrada.getValue() + " ");
            }
            node = node.siguiente;
        }
        System.out.println();
    }
}
