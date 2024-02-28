
package tema7.ejercicios.conjunto;

/**
 *
 * @author Ruper
 */
public class Conjunto {
    private Lista elementos;

    public Conjunto() {
        elementos = new Lista();
    }

    public int numeroElementos() {
        return elementos.numeroElementos();
    }

    public boolean insertar(Integer nuevo) {
        if (elementos.buscar(nuevo) == -1) {
            elementos.insertarFinal(nuevo);
            return true;
        }
        return false;
    }

    public boolean insertar(Conjunto otroConjunto) {
        boolean conjuntoModificado = false;
        for (int i = 0; i < otroConjunto.elementos.numeroElementos(); i++) {
            Integer elementoAInsertar = otroConjunto.elementos.get(i);
            if (elementoAInsertar != null && insertar(elementoAInsertar)) {
                conjuntoModificado = true;
            }
        }
        return conjuntoModificado;
    }

    public boolean eliminarElemento(Integer elemento) {
        int indice = elementos.buscar(elemento);
        if (indice != -1) {
            elementos.eliminar(indice);
            return true;
        }
        return false;
    }

    public boolean eliminarConjunto(Conjunto otroConjunto) {
        boolean conjuntoModificado = false;
        for (int i = 0; i < otroConjunto.elementos.numeroElementos(); i++) {
            Integer elementoAEliminar = otroConjunto.elementos.get(i);
            if (elementoAEliminar != null && eliminarElemento(elementoAEliminar)) {
                conjuntoModificado = true;
            }
        }
        return conjuntoModificado;
    }

    public boolean pertenece(Integer elemento) {
        return elementos.buscar(elemento) != -1;
    }

    public void muestra() {
        elementos.mostrar();
    }
    
    // NUEVO --------------------------------------------------------------
    // Método estático para determinar si un conjunto está incluido en otro
    public static boolean incluido(Conjunto c1, Conjunto c2) {
        for (int i = 0; i < c1.elementos.numeroElementos(); i++) {
            if (!c2.pertenece(c1.elementos.get(i))) {
                return false;
            }
        }
        return true;
    }

    // Método estático para unir dos conjuntos
    public static Conjunto union(Conjunto c1, Conjunto c2) {
        Conjunto union = new Conjunto();
        for (int i = 0; i < c1.elementos.numeroElementos(); i++) {
            union.insertar(c1.elementos.get(i));
        }
        for (int i = 0; i < c2.elementos.numeroElementos(); i++) {
            union.insertar(c2.elementos.get(i));
        }
        return union;
    }

    // Método estático para obtener la intersección de dos conjuntos
    public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
        Conjunto interseccion = new Conjunto();
        for (int i = 0; i < c1.elementos.numeroElementos(); i++) {
            Integer elemento = c1.elementos.get(i);
            if (c2.pertenece(elemento)) {
                interseccion.insertar(elemento);
            }
        }
        return interseccion;
    }

    // Método estático para obtener la diferencia de dos conjuntos
    public static Conjunto diferencia(Conjunto c1, Conjunto c2) {
        Conjunto diferencia = new Conjunto();
        for (int i = 0; i < c1.elementos.numeroElementos(); i++) {
            Integer elemento = c1.elementos.get(i);
            if (!c2.pertenece(elemento)) {
                diferencia.insertar(elemento);
            }
        }
        return diferencia;
    }
}
