
package tema6.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class C22_DividirPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la palabra
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        // Pedir al usuario que ingrese la longitud de las secuencias
        System.out.print("Ingresa la longitud de las secuencias: ");
        int longitudSecuencia = scanner.nextInt();

        // Llamar al método para dividir la palabra en secuencias
        dividirPalabra(palabra, longitudSecuencia);
    }

    // Método para dividir la palabra en secuencias de n letras
    public static void dividirPalabra(String palabra, int longitudSecuencia) {
        int longitudPalabra = palabra.length();

        // Imprimir las secuencias de la palabra
        for (int i = 0; i < longitudPalabra; i += longitudSecuencia) {
            int finSecuencia = Math.min(i + longitudSecuencia, longitudPalabra);
            System.out.println(palabra.substring(i, finSecuencia));
        }
    }
}
