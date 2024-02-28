
package tema7.ejercicios.cola;

import java.util.NoSuchElementException;

/**
 *
 * @author Ruper
 */
public class ColaConListaMAIN {
    public static void main(String[] args) {
        ColaConLista cola = new ColaConLista();
        
        // Encolamos algunos elementos
        System.out.println("Encolando elementos:");
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        
        // Mostramos la cola
        System.out.println("Cola después de encolar 10, 20, 30:");
        cola.mostrar();
        
        // Desencolamos un elemento y mostramos la cola de nuevo
        System.out.println("Desencolando un elemento: " + cola.desencolar());
        System.out.println("Cola después de desencolar:");
        cola.mostrar();
        
        // Encolamos otro elemento y mostramos la cola
        System.out.println("Encolando el elemento 40:");
        cola.encolar(40);
        System.out.println("Cola después de encolar 40:");
        cola.mostrar();
        
        // Desencolamos todos los elementos
        System.out.println("Desencolando todos los elementos:");
        while (true) {
            try {
                System.out.println("Desencolado: " + cola.desencolar());
            } catch (NoSuchElementException e) {
                System.out.println("La cola está vacía. No se puede desencolar más elementos.");
                break;
            }
        }
    }
}
