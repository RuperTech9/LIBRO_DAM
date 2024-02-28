
package tema7.ejercicios.pila;

import java.util.Arrays;

/**
 *
 * @author Ruper
 */
public class Pila {
    private Integer[] elementos;
    private int tamano;

    public Pila() {
        elementos = new Integer[0];
        tamano = 0;
    }

    public void apilar(Integer elemento) {
        elementos = Arrays.copyOf(elementos, tamano + 1);
        elementos[tamano] = elemento;
        tamano++;
    }

    public Integer desapilar() {
        if (tamano == 0) {
            throw new IllegalStateException("No se puede desapilar de una pila vacía.");
        }
        Integer elemento = elementos[tamano - 1];
        elementos = Arrays.copyOf(elementos, tamano - 1);
        tamano--;
        return elemento;
    }

    public void mostrar() {
        System.out.println("Pila: " + Arrays.toString(elementos));
    }
}