
package tema5.ejercicios;

import java.util.Random;

/**
 *
 * @author Ruper
 */
public class A24_DesordenarArray {
    public static void desordenar(int[] t) {
        Random rand = new Random();

        for (int i = t.length - 1; i > 0; i--) {
            // Generar un índice aleatorio entre 0 e i (inclusive)
            int j = rand.nextInt(i + 1);

            // Intercambiar t[i] y t[j]
            int temp = t[i];
            t[i] = t[j];
            t[j] = temp;
        }
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
        desordenar(array);
        
        // Imprimir array desordenado
        System.out.println("\nArray desordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
