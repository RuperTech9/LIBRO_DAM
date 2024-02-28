
package tema5.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A13_CampeonatoProgramacionMasInvitado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int puntuacionProgramador = 0;
        int puntuaciones[] = new int[0]; // Inicializar array de puntuaciones vacío
        int puntuacionInvitado = 0;

        // Bucle para insertar 5 puntuaciones del programador
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la puntuación del programador "+(i+1)+": ");
            puntuacionProgramador = teclado.nextInt();
            
            // Buscar el índice donde debería ir la nueva puntuación
            int indiceInsercion = Arrays.binarySearch(puntuaciones, puntuacionProgramador);
            // Si no se encuentra, calcular el índice de inserción
            if (indiceInsercion < 0) {
                indiceInsercion = -indiceInsercion - 1;
            }
            
            // Crear una copia del array con un espacio adicional
            int copia[] = new int[puntuaciones.length + 1];
            // Copiar elementos hasta el índice de inserción
            System.arraycopy(puntuaciones, 0, copia, 0, indiceInsercion);
            // Copiar el resto de elementos dejando un hueco para el nuevo
            System.arraycopy(puntuaciones, indiceInsercion, copia, indiceInsercion + 1, puntuaciones.length - indiceInsercion);
            // Insertar la nueva puntuación
            copia[indiceInsercion] = puntuacionProgramador;
            // Referenciar la nueva tabla de puntuaciones
            puntuaciones = copia;
        }
        
        // Mostrar las puntuaciones del programador
        System.out.println(Arrays.toString(puntuaciones));

        // Bucle para insertar puntuaciones del invitado
        do {
            System.out.println("Introduce la puntuación del invitado: ");
            puntuacionInvitado = teclado.nextInt();
            
            // Salir del bucle si se introduce un número negativo
            if (puntuacionInvitado < 0) 
                break;
            
            // Repetir proceso de inserción para la puntuación del invitado
            int indiceInsercion = Arrays.binarySearch(puntuaciones, puntuacionInvitado);
            if (indiceInsercion < 0) {
                indiceInsercion = -indiceInsercion - 1;
            }
            int copia2[] = new int[puntuaciones.length + 1];
            System.arraycopy(puntuaciones, 0, copia2, 0, indiceInsercion);
            System.arraycopy(puntuaciones, indiceInsercion, copia2, indiceInsercion + 1, puntuaciones.length - indiceInsercion);
            copia2[indiceInsercion] = puntuacionInvitado;
            puntuaciones = copia2;
        } while (puntuacionInvitado >= 0);
        
        // Mostrar las puntuaciones finales, incluyendo las del invitado
        System.out.println(Arrays.toString(puntuaciones));
    }
}
