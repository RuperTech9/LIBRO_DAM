
package tema7.ejercicios.cola;

/**
 *
 * @author Ruper
 */
import java.util.NoSuchElementException;

public class Cola {
    private Integer[] tabla;
    private int primero;
    private int ultimo;
    private int tamano;

    public Cola() {
        tabla = new Integer[10]; // Tamaño tabla
        primero = 0;
        ultimo = -1;
        tamano = 0;
    }

    // Método para encolar un elemento en la cola
    public void encolar(Integer elemento) {
        // Asegurarse de que hay espacio en la tabla o redimensionarla
        if (tamano == tabla.length) {
            aumentarCapacidad();
        }
        ultimo = (ultimo + 1) % tabla.length;
        tabla[ultimo] = elemento;
        tamano++;
    }

    // Método para desencolar un elemento de la cola
    public Integer desencolar() {
        if (tamano == 0) {
            throw new NoSuchElementException("La cola está vacía");
        }
        Integer elemento = tabla[primero];
        primero = (primero + 1) % tabla.length;
        tamano--;
        return elemento;
    }

    // Método auxiliar para aumentar la capacidad del array cuando se llena
    private void aumentarCapacidad() {
        Integer[] nuevaTabla = new Integer[tabla.length * 2];
        for (int i = 0; i < tamano; i++) {
            nuevaTabla[i] = tabla[(primero + i) % tabla.length];
        }
        tabla = nuevaTabla;
        primero = 0;
        ultimo = tamano - 1;
    }
    
    // Método para mostrar el contenido de la cola
    public void mostrar() {
        for (int i = 0; i < tamano; i++) {
            System.out.print(tabla[(primero + i) % tabla.length] + " ");
        }
        System.out.println();
    }
}
