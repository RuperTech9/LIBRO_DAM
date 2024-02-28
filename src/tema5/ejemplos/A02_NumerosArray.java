
package tema5.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A02_NumerosArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Pedir al usuario el número de elementos
        System.out.print("Introduce la cantidad de números a ingresar: ");
        n = sc.nextInt();

        // Crear un array para almacenar los números
        int[] numeros = new int[n];
        int sumaPositivos = 0, sumaNegativos = 0, contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;

        // Pedir al usuario que ingrese los números
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            // Contar positivos, negativos y ceros
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        // Calcular y mostrar la media de positivos y negativos
        if (contadorPositivos > 0) {
            System.out.println("Media de positivos: " + (double) sumaPositivos / contadorPositivos);
        } else {
            System.out.println("No hay números positivos.");
        }

        if (contadorNegativos > 0) {
            System.out.println("Media de negativos: " + (double) sumaNegativos / contadorNegativos);
        } else {
            System.out.println("No hay números negativos.");
        }

        // Mostrar la cantidad de ceros
        System.out.println("Cantidad de ceros: " + contadorCeros);
    }
}