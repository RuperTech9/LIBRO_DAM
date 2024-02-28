
package tema5.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A20_ArrayBidimensional3x3 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Declarar las variables de índice para los bucles
        int i, j;

        // Crear una matriz bidimensional de enteros con tamaño 3x3
        int[][] matriz = new int[3][3];

        // Bucle anidado para recorrer la matriz y llenarla con números introducidos por el usuario
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                // Pedir al usuario que ingrese un número y almacenarlo en la matriz
                System.out.println("Ingresa un numero:");
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Bucle anidado para recorrer la matriz y mostrar los números almacenados
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                // Imprimir cada elemento de la matriz
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
