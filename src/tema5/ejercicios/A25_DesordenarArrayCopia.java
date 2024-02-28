
package tema5.ejercicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Ruper
 */
public class A25_DesordenarArrayCopia {
    public static int[] desordenar(int[] t) {
        // Copiar la tabla original
        int[] copia = Arrays.copyOf(t, t.length);
        Random rand = new Random();

        for (int i = copia.length - 1; i > 0; i--) {
            // Generar un índice aleatorio entre 0 e i (inclusive)
            int j = rand.nextInt(i + 1);

            // Intercambiar copia[i] y copia[j]
            int temp = copia[i];
            copia[i] = copia[j];
            copia[j] = temp;
        }

        return copia;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Imprimir array original
        System.out.println("Array original:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Desordenar array
        int[] arrayDesordenado = desordenar(array);
        
        // Imprimir array desordenado
        System.out.println("\nArray desordenado:");
        for (int num : arrayDesordenado) {
            System.out.print(num + " ");
        }
    }
}
