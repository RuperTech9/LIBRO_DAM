
package tema5.ejemplos;

import java.util.Arrays;

/**
 *
 * @author Ruper
 */
public class A08_BusquedaTablaOrdenada {
    public static void main(String[] args) {
        // Array de precios ordenados para el ejemplo
        double[] precios = {9.99, 12.99, 14.99, 19.95, 24.99, 29.99, 34.99, 39.99};

        // Valor a buscar
        double valorBusqueda = 19.95;

        // Realizar la búsqueda binaria
        int pos = Arrays.binarySearch(precios, valorBusqueda);

        // Verificar el resultado de la búsqueda y mostrar un mensaje apropiado
        if (pos >= 0) {
            System.out.println("Encontrado en el índice: " + pos);
        } else {
            System.out.println("Lo sentimos, no se ha encontrado.");
        }
    }
}