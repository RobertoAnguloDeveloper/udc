package JAVA.Arboles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ArbolBinario {
    private TreeSet<Integer> arbol;
    private ArbolBinario nodoIzq;
    private ArbolBinario nodoDer;
    private int valor;
    private boolean esHoja;
    private boolean esNodo;
    private boolean esRaiz;
    private boolean esNodoIzq;
    private boolean esNodoDer;

    public ArbolBinario() {
        esRaiz = true;
        esNodo = true;
        esHoja = true;
        esNodoIzq = false;
        esNodoDer = false;
        arbol = new TreeSet<Integer>();
    }

    public void agregar(int elemento) {
        if (esRaiz) {
            esNodo = false;
            esHoja = false;
            esNodoIzq = true;
            esNodoDer = true;
            valor = elemento;
            arbol.add(elemento);
        } else {
            if (elemento < valor) {
                if (nodoIzq == null) {
                    nodoIzq = new ArbolBinario();
                }
                nodoIzq.agregar(elemento);
            } else {
                if (nodoDer == null) {
                    nodoDer = new ArbolBinario();
                }
                nodoDer.agregar(elemento);
            }
        }
    }

    public boolean buscar(int elemento) {
        if (esRaiz) {
            return arbol.contains(elemento);
        } else {
            if (elemento < valor) {
                if (esNodoIzq) {
                    return nodoIzq.buscar(elemento);
                } else {
                    return false;
                }
            } else {
                if (esNodoDer) {
                    return nodoDer.buscar(elemento);
                } else {
                    return false;
                }
            }
        }
    }

    //Build a method that go through the tree and print all the elements
    public void test() {
        System.out.println(arbol.toString());
    }

    public void ordenarInverso() {
        if (!esHoja) {
            if (esNodoIzq) {
                nodoIzq.ordenarInverso();
            }
            if (esNodoDer) {
                nodoDer.ordenarInverso();
            }
            ArrayList<Integer> lista = new ArrayList<Integer>();
            for (Integer i : arbol) {
                lista.add(i);
            }
            Collections.sort(lista, Collections.reverseOrder());
            arbol.clear();
            for (Integer i : lista) {
                arbol.add(i);
            }
        }
    }

    public void eliminar(int elemento) {
        if (esRaiz) {
            if (arbol.contains(elemento)) {
                arbol.remove(elemento);
            }
        } else {
            if (elemento < valor) {
                if (esNodoIzq) {
                    nodoIzq.eliminar(elemento);
                }
            } else {
                if (esNodoDer) {
                    nodoDer.eliminar(elemento);
                }
            }
        }
    }

    //Build a method to insert a value into the tree with a position given
    /*public void insertar(int elemento, int posicion) {
        if (esRaiz) {
            if (arbol.contains(elemento)) {
                arbol.remove(elemento);
            }
            arbol.add(posicion, elemento);
        } else {
            if (elemento < valor) {
                if (esNodoIzq) {
                    nodoIzq.insertar(elemento, posicion);
                }
            } else {
                if (esNodoDer) {
                    nodoDer.insertar(elemento, posicion);
                }
            }
        }
    }*/
    
    //Build a method to convert the tree into a list
    public ArrayList<Integer> convertirArbolBinarioEnLista() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        if (!esHoja) {
            if (esNodoIzq) {
                lista.addAll(nodoIzq.convertirArbolBinarioEnLista());
            }
            if (esNodoDer) {
                lista.addAll(nodoDer.convertirArbolBinarioEnLista());
            }
        }
        lista.add(valor);
        return lista;
    }

    public void recorrerInicioFin() {
        if (!esHoja) {
            System.out.print(valor + " ");
            if (esNodoIzq) {
                nodoIzq.recorrerInicioFin();
            }
            if (esNodoDer) {
                nodoDer.recorrerInicioFin();
            }
        }
    }

    public void recorridoFinInicio() {
        if (!esHoja) {
            if (esNodoIzq) {
                nodoIzq.recorridoFinInicio();
            }
            if (esNodoDer) {
                nodoDer.recorridoFinInicio();
            }
            System.out.print(valor + " ");
        }
    }

    public ArbolBinario getRaiz() {
        return this;
    }

    public ArbolBinario getHijoIzq() {
        return nodoIzq;
    }

    public ArbolBinario getHijoDer() {
        return nodoDer;
    }

    public int getValor() {
        return valor;
    }

    public boolean esHoja() {
        return esHoja;
    }

    public boolean esNodo() {
        return esNodo;
    }

    public boolean esRaiz() {
        return esRaiz;
    }

    public boolean esNodoIzq() {
        return esNodoIzq;
    }

    public boolean esNodoDer() {
        return esNodoDer;
    }

    public int getSize() {
        return arbol.size();
    }

    public ArrayList<Integer> getElementos() {
        return new ArrayList<Integer>(arbol);
    }

    public int getAltura() {
        if (esRaiz) {
            return 0;
        } else {
            return 1 + Math.max(nodoIzq.getAltura(), nodoDer.getAltura());
        }
    }

    public int getProfundidad() {
        if (esRaiz) {
            return 0;
        } else {
            return 1 + Math.max(nodoIzq.getProfundidad(), nodoDer.getProfundidad());
        }
    }

    public int getNumNodos() {
        if (esRaiz) {
            return 1;
        } else {
            return nodoIzq.getNumNodos() + nodoDer.getNumNodos();
        }
    }

    public int getNumNodosHoja() {
        if (esRaiz) {
            return 1;
        } else {
            return nodoIzq.getNumNodosHoja() + nodoDer.getNumNodosHoja();
        }
    }
    
    
}
