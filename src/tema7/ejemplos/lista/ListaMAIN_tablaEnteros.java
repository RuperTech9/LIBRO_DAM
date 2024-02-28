
package tema7.ejemplos.lista;

import java.util.Arrays;

/**
 *
 * @author Ruper
 */
public class ListaMAIN_tablaEnteros {
    int[] tablaEnteros; // Atributo no estático de Main

    public ListaMAIN_tablaEnteros() {
        tablaEnteros = new int[0]; // Inicialización del array
    }

    public static void main(String[] args) {
        ListaMAIN_tablaEnteros m = new ListaMAIN_tablaEnteros(); // Creación de un objeto de la clase Main
        for (int i = 0; i < 10; i++) {
            m.insertarFinal(i + 1); // Invocación del método insertarFinal
        }
        System.out.println("tabla: " + Arrays.toString(m.tablaEnteros));
    }

    public void insertarFinal(int nuevo) {
        tablaEnteros = Arrays.copyOf(tablaEnteros, tablaEnteros.length + 1);
        tablaEnteros[tablaEnteros.length - 1] = nuevo;
    }
}
