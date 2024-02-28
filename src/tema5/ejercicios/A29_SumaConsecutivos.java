
package tema5.ejercicios;

/**
 *
 * @author Ruper
 */
public class A29_SumaConsecutivos {
    public static int[] suma(int[] t, int numElementos) {
        // Verificar si el número de elementos a sumar es válido
        if (numElementos <= 0 || numElementos > t.length) {
            throw new IllegalArgumentException("El número de elementos a sumar es inválido.");
        }

        // Calcular el número de sumas que se pueden realizar
        int numSumas = t.length - numElementos + 1;

        // Crear un array para almacenar las sumas
        int[] resultado = new int[numSumas];

        // Calcular las sumas de los elementos consecutivos
        for (int i = 0; i < numSumas; i++) {
            int suma = 0;
            for (int j = i; j < i + numElementos; j++) {
                suma += t[j];
            }
            resultado[i] = suma;
        }

        return resultado;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] t = {10, 1, 5, 8, 9, 2};
        int numElementos = 3;

        int[] resultado = suma(t, numElementos);

        // Imprimir el resultado
        System.out.print("[");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
