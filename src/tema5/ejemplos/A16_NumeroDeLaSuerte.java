
package tema5.ejemplos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A16_NumeroDeLaSuerte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Solicitar al usuario la cantidad de números favoritos
        System.out.println("¿Cuántos números favoritos vas a introducir?");
        int cantidad = scanner.nextInt();

        // Crear array para almacenar los números favoritos
        int[] numerosFavoritos = new int[cantidad];

        // Solicitar al usuario sus números favoritos
        System.out.println("Introduce tus números favoritos:");
        for (int i = 0; i < cantidad; i++) {
            numerosFavoritos[i] = scanner.nextInt();
        }

        // Ordenar el array de números favoritos
        Arrays.sort(numerosFavoritos);

        // Proceso de cálculo del número de la suerte
        while (cantidad > 1) {
            int index1 = random.nextInt(cantidad);
            int index2;
            do {
                index2 = random.nextInt(cantidad);
            } while (index1 == index2); // Asegurarse de que index2 es diferente a index1

            // Calcular la media de los dos números seleccionados
            int media = (numerosFavoritos[index1] + numerosFavoritos[index2]) / 2;

            // Eliminar los dos números seleccionados y reducir el tamaño del array
            if (index1 > index2) {
                int temp = index1;
                index1 = index2;
                index2 = temp;
            }
            for (int i = index2; i < cantidad - 1; i++) {
                numerosFavoritos[i] = numerosFavoritos[i + 1];
            }
            for (int i = index1; i < cantidad - 2; i++) {
                numerosFavoritos[i] = numerosFavoritos[i + 1];
            }
            cantidad -= 2;

            // Insertar la media en la posición adecuada
            int[] nuevoArray = new int[cantidad + 1];
            int indiceInsercion = Arrays.binarySearch(numerosFavoritos, 0, cantidad, media);
            if (indiceInsercion < 0) {
                indiceInsercion = -indiceInsercion - 1; // Calcular la posición de inserción para la media
            }
            System.arraycopy(numerosFavoritos, 0, nuevoArray, 0, indiceInsercion);
            nuevoArray[indiceInsercion] = media;
            System.arraycopy(numerosFavoritos, indiceInsercion, nuevoArray, indiceInsercion + 1, cantidad - indiceInsercion);
            numerosFavoritos = nuevoArray;
            cantidad++;
        }

        // Mostrar el número de la suerte
        if (cantidad == 1) {
            System.out.println("Tu número de la suerte es: " + numerosFavoritos[0]);
        } else {
            System.out.println("No se pudo calcular el número de la suerte.");
        }
    }
}
