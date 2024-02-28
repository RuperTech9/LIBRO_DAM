
package tema7.ejercicios.pila;

/**
 *
 * @author Ruper
 */
public class PilaConLista {
    private Lista elementos;

    public PilaConLista() {
        elementos = new Lista();
    }

    public void apilar(Integer elemento) {
        elementos.insertarFinal(elemento);
    }

    public Integer desapilar() {
        if (elementos.numeroElementos() == 0) {
            throw new IllegalStateException("No se puede desapilar de una pila vacía.");
        }
        return elementos.eliminar(elementos.numeroElementos() - 1);
    }

    public void mostrar() {
        elementos.mostrar();
    }

    // Método main para probar la clase Pila con una Lista
    public static void main(String[] args) {
        PilaConLista pila = new PilaConLista();
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        pila.mostrar(); // Debe mostrar "Lista: [1, 2, 3]"

        System.out.println("Elemento desapilado: " + pila.desapilar()); // Debe mostrar "Elemento desapilado: 3"
        pila.mostrar(); // Debe mostrar "Lista: [1, 2]"
    }
}
