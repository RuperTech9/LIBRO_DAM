
package tema5.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A30_MatrizMagica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los elementos de la matriz
        int[][] matriz = new int[4][4];
        System.out.println("Introduce los elementos de la matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcular la suma de la primera fila para usarla como referencia
        int sumaReferencia = sumarFila(matriz, 0);

        // Verificar si todas las filas tienen la misma suma
        boolean esMagica = true;
        for (int i = 1; i < 4; i++) {
            if (sumarFila(matriz, i) != sumaReferencia) {
                esMagica = false;
                break;
            }
        }

        // Verificar si todas las columnas tienen la misma suma
        if (esMagica) {
            for (int j = 0; j < 4; j++) {
                if (sumarColumna(matriz, j) != sumaReferencia) {
                    esMagica = false;
                    break;
                }
            }
        }

        // Mostrar el resultado
        if (esMagica) {
            System.out.println("La matriz introducida es una matriz mágica.");
        } else {
            System.out.println("La matriz introducida no es una matriz mágica.");
        }
    }

    // Método para calcular la suma de los elementos de una fila
    public static int sumarFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < 4; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    // Método para calcular la suma de los elementos de una columna
    public static int sumarColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }
}
