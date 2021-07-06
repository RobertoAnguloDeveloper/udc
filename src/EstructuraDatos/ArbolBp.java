package EstructuraDatos;

import java.util.LinkedList;


public class ArbolBp {

    int grado;
    LinkedList<Integer> valores;
    ArbolBp pariente;
    LinkedList<ArbolBp> hijos;

    private ArbolBp() {
        this.valores = new LinkedList<Integer>();
        this.hijos = new LinkedList<ArbolBp>();
    }

    public ArbolBp(int grado) {
        this();
        if(grado < 3) {
            throw new RuntimeException("EL GRADO DEL ARBOL DEBE SER SUPERIOR A 2");
        }
        this.grado = grado;
    }

    public ArbolBp(ArbolBp pariente) {
        this(pariente.grado);
        this.pariente = pariente;
    }

    public ArbolBp insertar(int e) {
        if(estaVacio()) {
            valores.add(e);
            hijos.add(new ArbolBp(this));
            hijos.add(new ArbolBp(this));
            return this;
        }
        ArbolBp temp = getRaiz().buscar(e);
        
        insertarNodo(temp.pariente, e, new ArbolBp(temp.grado));
        return getRaiz();
    }

    private void insertarNodo(ArbolBp nodo, int e, ArbolBp eNodo) {
        int indiceValor = 0;
        while(indiceValor < nodo.valores.size() && nodo.valores.get(indiceValor) < e) {
            indiceValor++;
        }
        nodo.valores.add(indiceValor, e);
        eNodo.pariente = nodo;
        nodo.hijos.add(indiceValor+1, eNodo);
        if(nodo.valores.size() > grado-1) {
            int indiceArriba = grado/2;
            int arriba = nodo.valores.get(indiceArriba);
            ArbolBp nodoRaiz = new ArbolBp(grado);
            nodoRaiz.valores = new LinkedList(nodo.valores.subList(indiceArriba+1, grado));
            nodoRaiz.hijos = new LinkedList(nodo.hijos.subList(indiceArriba+1, grado+1));

            for(ArbolBp hijosRaiz : nodoRaiz.hijos) {
                hijosRaiz.pariente = nodoRaiz;
            }
            nodo.valores = new LinkedList(nodo.valores.subList(0, indiceArriba));
            nodo.hijos = new LinkedList(nodo.hijos.subList(0, indiceArriba+1));
            
            if(nodo.pariente == null) {
                nodo.pariente = new ArbolBp(grado);
                nodo.pariente.valores.add(arriba);
                nodo.pariente.hijos.add(nodo);
                nodo.pariente.hijos.add(nodoRaiz);
                nodoRaiz.pariente = nodo.pariente;
                return;
            }
            
            insertarNodo(nodo.pariente, arriba, nodoRaiz);
        }
    }

    public ArbolBp eliminar(int e) {
        if(estaVacio()) {
            return this;
        }
        ArbolBp temp = getRaiz().buscar(e);
        if(temp.estaVacio()) {
            throw new RuntimeException("LA CLAVE NO EXISTE" + e);
        }
        int indiceValor = 0;
        while(indiceValor < temp.valores.size() && temp.valores.get(indiceValor) < e) {
            indiceValor++;
        }
        
        if(!temp.hijos.get(0).estaVacio()) {
            ArbolBp raizMinima = temp.hijos.get(indiceValor);
            while(!raizMinima.hijos.get(0).estaVacio()) {
                raizMinima = raizMinima.hijos.get(0);
            }
            temp.valores.set(indiceValor, raizMinima.valores.get(0));
            return eliminar(raizMinima, indiceValor, 0);
        }
        return eliminar(temp, indiceValor, 0);
    }

    private ArbolBp eliminar(ArbolBp nodoEliminar, int indiceValor, int indiceHijo) {
        nodoEliminar.valores.remove(indiceValor);
        nodoEliminar.hijos.remove(indiceHijo);
        if(nodoEliminar.hijos.size() >= Math.ceil(grado/2.0)) {
            return nodoEliminar.getRaiz();
        }
        if(nodoEliminar.esRaiz()) {
            if(nodoEliminar.hijos.size() > 1) {
                return nodoEliminar;
            }else {
                ArbolBp nuevaRaiz = nodoEliminar.hijos.get(0);
                nuevaRaiz.pariente = null;
                return nuevaRaiz;
            }
        }
        int indiceParienteHijo = 0;
        while(indiceParienteHijo < nodoEliminar.pariente.hijos.size() && nodoEliminar.pariente.hijos.get(indiceParienteHijo) != nodoEliminar) {
            indiceParienteHijo++;
        }
        if(indiceParienteHijo > 0 && nodoEliminar.pariente.hijos.get(indiceParienteHijo-1).valores.size() >= Math.ceil(grado/2.0)) {
            
            int claveAbajo = nodoEliminar.pariente.valores.get(indiceParienteHijo-1);
            ArbolBp hermanoIzquierdo = nodoEliminar.pariente.hijos.get(indiceParienteHijo-1);
            int claveArriba = hermanoIzquierdo.valores.remove(hermanoIzquierdo.valores.size()-1);
            ArbolBp mezclarHijo = hermanoIzquierdo.hijos.remove(hermanoIzquierdo.hijos.size()-1);
            nodoEliminar.valores.add(0, claveAbajo);
            nodoEliminar.hijos.add(0, mezclarHijo);
            nodoEliminar.pariente.valores.set(indiceParienteHijo-1, claveArriba);
            return nodoEliminar.getRaiz();
        }else if(indiceParienteHijo < nodoEliminar.pariente.hijos.size()-1 &&
                nodoEliminar.pariente.hijos.get(indiceParienteHijo+1).valores.size() >= Math.ceil(grado/2.0)) {
            
            int claveAbajo = nodoEliminar.pariente.valores.get(indiceParienteHijo);
            ArbolBp hermanoDerecho = nodoEliminar.pariente.hijos.get(indiceParienteHijo+1);
            int claveArriba = hermanoDerecho.valores.remove(0);
            ArbolBp mezclarHijo = hermanoDerecho.hijos.remove(0);
            nodoEliminar.valores.add(claveAbajo);
            nodoEliminar.hijos.add(mezclarHijo);
            nodoEliminar.pariente.valores.set(indiceParienteHijo, claveArriba);
            return nodoEliminar.getRaiz();
        }else {
            int indiceParienteValor;
            if(indiceParienteHijo > 0) {
                
                ArbolBp hermanoIzquierdo = nodoEliminar.pariente.hijos.get(indiceParienteHijo-1);
                
                indiceParienteValor = indiceParienteHijo - 1;
                int claveAbajo = nodoEliminar.pariente.valores.get(indiceParienteValor);
                hermanoIzquierdo.valores.add(claveAbajo);
                
                hermanoIzquierdo.valores.addAll(nodoEliminar.valores);
                nodoEliminar.hijos.forEach(c -> c.pariente=hermanoIzquierdo);
                hermanoIzquierdo.hijos.addAll(nodoEliminar.hijos);
            }else {
                
                ArbolBp hermanoDerecho = nodoEliminar.pariente.hijos.get(indiceParienteHijo+1);
                
                indiceParienteValor = indiceParienteHijo;
                int claveAbajo = nodoEliminar.pariente.valores.get(indiceParienteValor);
                hermanoDerecho.valores.add(0, claveAbajo);
                
                hermanoDerecho.valores.addAll(0, nodoEliminar.valores);
                nodoEliminar.hijos.forEach(c -> c.pariente=hermanoDerecho);
                hermanoDerecho.hijos.addAll(0, nodoEliminar.hijos);
            }
            
            return eliminar(nodoEliminar.pariente, indiceParienteValor, indiceParienteHijo);
        }
    }

    public ArbolBp buscar(int nodo) {
        if(estaVacio()) {
            return this;
        }
        int indiceValor = 0;
        while(indiceValor < valores.size() && valores.get(indiceValor) <= nodo) {
            if(valores.get(indiceValor) == nodo) {
                return this;
            }
            indiceValor++;
        }
        return hijos.get(indiceValor).buscar(nodo);
    }


    public ArbolBp getRaiz() {
        ArbolBp temp = this;
        while(!temp.esRaiz()) {
            temp = temp.pariente;
        }
        return temp;
    }

    public boolean estaVacio() {
        if(valores == null || valores.size() == 0) {
            return true;
        }
        return false;
    }

    public boolean esRaiz() {
        return pariente == null;
    }

    public void limpiar() {
        valores.clear();
        hijos.clear();
    }

    public void imprimir() {
        imprimirNodo(this, 0);
    }

    private void imprimirNodo(ArbolBp nodo, int profundidad) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 1; i < profundidad; i++) {
            stringBuilder.append("|    ");
        }
        if(profundidad > 0) {
            stringBuilder.append("|----");
        }
        stringBuilder.append(nodo.valores);
        System.out.println(stringBuilder.toString());
        for(ArbolBp hijo : nodo.hijos) {
            imprimirNodo(hijo, profundidad+1);
        }
    }
}
