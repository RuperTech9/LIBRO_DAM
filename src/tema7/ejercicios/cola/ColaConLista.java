
package tema7.ejercicios.cola;

import java.util.NoSuchElementException;

/**
 *
 * @author Ruper
 */

public class ColaConLista {
    private Lista elementos;

    public ColaConLista() {
        elementos = new Lista();
    }

    // Método para encolar un elemento en la cola
    public void encolar(Integer elemento) {
        elementos.insertarFinal(elemento);
    }

    // Método para desencolar un elemento de la cola
    public Integer desencolar() {
        if (elementos.numeroElementos() == 0) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return elementos.eliminar(0); // Eliminamos siempre el primer elemento (el más antiguo en la cola)
    }
    
    // Método para mostrar el contenido de la cola
    public void mostrar() {
        elementos.mostrar();
    }
}
