
package tema5.ejemplos;

/**
 *
 * @author Ruper
 */
public class A07_BusquedaTablaDesordenada { // Busqueda secuencial
    // Método para buscar un elemento en el array
    public static int buscar(int[] t, int claveBusqueda) {
        int indiceBusqueda = 0; // Inicio del índice de búsqueda

        // Bucle para recorrer la tabla y buscar la clave
        while (indiceBusqueda < t.length && t[indiceBusqueda] != claveBusqueda) {
            indiceBusqueda++; // Incrementa el índice de búsqueda
        }

        // Comprobar si se ha encontrado la clave
        if (indiceBusqueda < t.length) {
            return indiceBusqueda; // Devuelve la posición del elemento encontrado
        } else {
            return -1; // Devuelve -1 si no se encuentra el elemento
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 1, 2, 9}; // Ejemplo de array
        int claveABuscar = 2;

        // Llamada al método buscar
        int posicion = buscar(array, claveABuscar);

        if (posicion != -1) {
            System.out.println("Elemento encontrado en la posición: " + posicion);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }
}
