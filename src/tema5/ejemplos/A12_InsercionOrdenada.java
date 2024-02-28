
package tema5.ejemplos;

import java.util.Arrays;

/**
 *
 * @author Ruper
 */
public class A12_InsercionOrdenada {
    public static int[] insertarOrdenado(int[] arrayOriginal, int nuevoElemento) {
        // Buscar el lugar donde debe ir el nuevo elemento
        int indiceInsercion = Arrays.binarySearch(arrayOriginal, nuevoElemento);
        
        // Si el elemento ya existe, binarySearch devuelve el índice (>= 0)
        // Si no existe, devuelve "(-(punto de inserción) - 1)"
        if (indiceInsercion < 0) {
            indiceInsercion = -indiceInsercion - 1;
        }

        // Crear una nueva tabla con un elemento extra
        int[] copia = new int[arrayOriginal.length + 1];

        // Copiar elementos hasta el punto de inserción
        System.arraycopy(arrayOriginal, 0, copia, 0, indiceInsercion);

        // Insertar el nuevo elemento
        copia[indiceInsercion] = nuevoElemento;

        // Copiar el resto de elementos después del punto de inserción
        System.arraycopy(arrayOriginal, indiceInsercion, copia, indiceInsercion + 1, arrayOriginal.length - indiceInsercion);

        return copia;
    }

    // Función main para probar el método de inserción ordenada
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 6, 7, 8}; // Array original ordenado
        int nuevo = 5; // Nuevo elemento a insertar
        
        // Ordenamos el array antes de insertar el nuevo elemento
        Arrays.sort(t);
        
        t = insertarOrdenado(t, nuevo); // Insertar elemento

        System.out.println(Arrays.toString(t)); // Mostrar array resultante
    }
}