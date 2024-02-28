
package tema8.ejercicios.lista;

import java.util.NoSuchElementException;

/**
 *
 * @author Ruper
 */
public class ColaMAIN {
    public static void main(String[] args) {
        Cola cola = new Cola();
        
        // Encolar elementos en la cola
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);
        
        // Mostrar la cola
        System.out.println("Cola actual:");
        System.out.println(cola); // Usando toString
        
        // Desencolar elementos y mostrar la cola después de cada desencolada
        System.out.println("Desencolando elementos:");
        while (cola.numeroElementos() > 0) {
            Integer elemento = cola.desencolar();
            System.out.println("Elemento desencolado: " + elemento);
            System.out.println(cola);
        }
        
        // Intentar desencolar de una cola vacía para probar la excepción
        try {
            cola.desencolar();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
