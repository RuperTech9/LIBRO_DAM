
package tema6.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Implementa un programa que lea una frase y muestre todas sus palabras ordenadas de forma
 * alfabética. Supondremos que cada palabra de la frase se separa de otra por un único espacio.
 * 
 * @author Ruper
 */
public class C25_OrdenarFraseAlfabeticamente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();

        String[] palabras = frase.split(" "); // Dividir la frase en palabras

        Arrays.sort(palabras); // Ordenar las palabras alfabéticamente

        System.out.println("Palabras ordenadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
