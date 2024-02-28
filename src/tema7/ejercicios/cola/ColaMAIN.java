
package tema7.ejercicios.cola;

import java.util.NoSuchElementException;

/**
 *
 * @author Ruper
 */
public class ColaMAIN {
    public static void main(String[] args) {
        Cola cola = new Cola();
        
        // Encolamos varios elementos en la cola
        System.out.println("Encolando elementos:");
        for (int i = 1; i <= 5; i++) {
            cola.encolar(i);
            System.out.println("Encolado: " + i);
        }
        
        // Mostramos el estado actual de la cola
        System.out.println("\nEstado actual:");
        cola.mostrar(); // Debe mostrar "1 2 3 4 5"

        // Desencolamos algunos elementos
        System.out.println("\nDesencolando elementos:");
        for (int i = 1; i <= 3; i++) {
            int desencolado = cola.desencolar();
            System.out.println("Desencolado: " + desencolado);
        }

        // Mostramos el estado de la cola después de desencolar
        System.out.println("\nEstado actual:");
        cola.mostrar(); // Debe mostrar "4 5"

        // Encolamos más elementos para ver si la cola aumenta su capacidad
        System.out.println("\nEncolando más elementos:");
        for (int i = 6; i <= 10; i++) {
            cola.encolar(i);
            System.out.println("Encolado: " + i);
        }

        // Mostramos el estado final de la cola
        System.out.println("\nEstado actual:");
        cola.mostrar(); // Debe mostrar "4 5 6 7 8 9 10"

        // Intentamos desencolar hasta que la cola esté vacía
        System.out.println("\nDesencolando hasta vaciar la cola:");
        try {
            while (true) {
                int desencolado = cola.desencolar();
                System.out.println("Desencolado: " + desencolado);
            }
        } catch (NoSuchElementException e) {
            System.out.println("\nLa cola está vacía. No se puede desencolar más elementos.");
        }
    }
}