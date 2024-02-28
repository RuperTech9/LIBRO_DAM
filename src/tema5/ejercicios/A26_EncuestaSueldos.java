
package tema5.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A26_EncuestaSueldos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sueldos = new int[1000]; // Se asume que no habrá más de 1000 encuestados

        System.out.println("Bienvenido a la encuesta de sueldos. Introduce los sueldos de los encuestados (-1 para finalizar):");

        // Entrada de datos
        int sueldo;
        int cantidadSueldos = 0;
        do {
            System.out.print("Sueldo del encuestado (-1 para finalizar): ");
            sueldo = scanner.nextInt();
            if (sueldo != -1) {
                sueldos[cantidadSueldos] = sueldo;
                cantidadSueldos++;
            }
        } while (sueldo != -1);

        // Ordenar los sueldos de forma decreciente
        ordenarSueldos(sueldos, cantidadSueldos);

        // Imprimir sueldos ordenados
        System.out.println("Sueldos ordenados de forma decreciente:");
        for (int i = 0; i < cantidadSueldos; i++) {
            System.out.println(sueldos[i]);
        }

        // Calcular sueldo máximo y mínimo
        int sueldoMaximo = encontrarSueldoMaximo(sueldos, cantidadSueldos);
        int sueldoMinimo = encontrarSueldoMinimo(sueldos, cantidadSueldos);

        // Calcular media de los sueldos
        double mediaSueldos = calcularMediaSueldos(sueldos, cantidadSueldos);

        // Imprimir información
        System.out.println("Sueldo máximo: " + sueldoMaximo);
        System.out.println("Sueldo mínimo: " + sueldoMinimo);
        System.out.println("Media de sueldos: " + mediaSueldos);
    }

    // Método para ordenar los sueldos manualmente de forma decreciente
    public static void ordenarSueldos(int[] sueldos, int cantidadSueldos) {
        for (int i = 0; i < cantidadSueldos - 1; i++) {
            for (int j = 0; j < cantidadSueldos - i - 1; j++) {
                if (sueldos[j] < sueldos[j + 1]) {
                    // Swap
                    int temp = sueldos[j];
                    sueldos[j] = sueldos[j + 1];
                    sueldos[j + 1] = temp;
                }
            }
        }
    }

    // Método para encontrar el sueldo máximo
    public static int encontrarSueldoMaximo(int[] sueldos, int cantidadSueldos) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < cantidadSueldos; i++) {
            if (sueldos[i] > max) {
                max = sueldos[i];
            }
        }
        return max;
    }

    // Método para encontrar el sueldo mínimo
    public static int encontrarSueldoMinimo(int[] sueldos, int cantidadSueldos) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < cantidadSueldos; i++) {
            if (sueldos[i] < min) {
                min = sueldos[i];
            }
        }
        return min;
    }

    // Método para calcular la media de los sueldos
    public static double calcularMediaSueldos(int[] sueldos, int cantidadSueldos) {
        int sumaSueldos = 0;
        for (int i = 0; i < cantidadSueldos; i++) {
            sumaSueldos += sueldos[i];
        }
        return (double) sumaSueldos / cantidadSueldos;
    }
}
