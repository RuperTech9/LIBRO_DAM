
package tema5.ejemplos;

import java.util.Arrays;

/**
 *
 * @author Ruper
 */
public class A15_EliminacionEnArrayOrdenado {
    
    // Método para eliminar un elemento de un array ordenado
    public static int[] eliminarElemento(int[] array, int elementoABorrar) {
        // Encontrar el índice del elemento a borrar usando búsqueda binaria
        int indiceBorrado = Arrays.binarySearch(array, elementoABorrar);
        
        // Si el elemento se encuentra en el array, realizar la eliminación
        if (indiceBorrado >= 0) {
            // Crear una copia del array sin el elemento a borrar
            int[] copia = new int[array.length - 1];
            System.arraycopy(array, 0, copia, 0, indiceBorrado);
            System.arraycopy(array, indiceBorrado + 1, copia, indiceBorrado, array.length - indiceBorrado - 1);
            return copia;
        } else {
            // Si el elemento no se encuentra, devolver el array original
            return array;
        }
    }

    // Método principal para probar la función de eliminación
    public static void main(String[] args) {
        int[] t = {12, 27, 33, 38, 72, 92}; // Array ordenado original
        System.out.println(Arrays.toString(t)); 
        int elementoABorrar = 33; // Elemento a eliminar
        System.out.println("Número a borrar: "+elementoABorrar);
        // Llamar al método para eliminar el elemento del array
        t = eliminarElemento(t, elementoABorrar);
        
        // Mostrar el array resultante
        System.out.println(Arrays.toString(t));
    }
}