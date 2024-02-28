package tema5.ejercicios;
/*
 * Escribe la función	int[] buscarTodos(int t[], int clave)
 * que crea y devuelve una tabla con todos los índices de los elementos donde se encuentra la clave de búsqueda. 
 * En el caso de que la clave no se encuentre en la tabla t, la función devolverá una tabla vacía.
 */


public class A23_BuscarTodosArray {
    public static int[] buscarTodos(int[] t, int clave) {
        // Contar cuántas veces aparece la clave en el array t
        int contador = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                contador++;
            }
        }

        // Crear un nuevo array para almacenar los índices
        int[] indices = new int[contador];
        int index = 0;

        // Recorrer el array t y almacenar los índices donde se encuentra la clave
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                indices[index] = i;
                index++;
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] array = {1, 2, 3, 4, 2, 6, 2, 8};
        int clave = 2;
        int[] indices = buscarTodos(array, clave);

        if (indices.length == 0) {
            System.out.println("La clave no se encuentra en el array.");
        } else {
            System.out.println("La clave se encuentra en los índices: ");
            for (int i : indices) {
                System.out.print(i + " ");
            }
        }
    }
}