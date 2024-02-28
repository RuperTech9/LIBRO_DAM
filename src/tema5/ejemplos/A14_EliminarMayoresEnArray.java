package tema5.ejemplos;

import java.util.Arrays;

/**
 *
 * @author Ruper
 */
public class A14_EliminarMayoresEnArray {  
    public static void main(String[] args) {
        int r[] = {33, 20, 25, 12, 38, 4}; // Array original con valores
        int s[] = eliminarMayores(r, 25); // Llamada al método para eliminar los valores mayores a 25
        System.out.println(Arrays.toString(s)); // Imprimir el array resultante
    }
    
    static int[] eliminarMayores(int t[], int valor) {
        int sinMayores[] = Arrays.copyOf(t, t.length); // Crear una copia del array original
        
        for (int i = 0; i < sinMayores.length; i++) { // Recorrer el array
            if (sinMayores[i] > valor) { // Si el elemento actual es mayor que el valor límite
                sinMayores[i] = sinMayores[sinMayores.length - 1]; // Reemplazar el elemento mayor por el último elemento del array
                sinMayores = Arrays.copyOf(sinMayores, sinMayores.length - 1); // Reducir el tamaño del array, eliminando el último elemento
                i--; // Decrementar el índice para revisar el nuevo valor que ocupa la posición actual
            }
        }
        return sinMayores; // Devolver el nuevo array sin los valores mayores al valor límite
    }
}