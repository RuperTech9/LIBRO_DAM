package tema5.ejercicios;
/* La fusión de dos tablas ordenadas consiste en copiar todos sus elementos (de ambas tablas) en una tercera que deberá seguir ordenada. 
 * Podemos realizar una fusión «ineficiente» copiando los elementos de ambas tablas (sin tener en cuenta el orden) en la tabla final y ordenar esta.
 * Existe una manera óptima de realizar la fusión en la que se elige en cada momento el primer elemento no copiado de alguna de las tablas y se añade a la tabla final,
 * que seguirá ordenada sin necesidad de ordenación alguna.
 * Busca información sobre el algoritmo de fusión e impleméntalo en Java.*/


import java.util.Arrays;

public class A32_FusionarArrays {
	
	public static void main (String[] args)
    {
        int[] X = { 1, 4, 7, 8, 18, 25, 89 };
        int[] Y = { 2, 3, 9, 19, 89, 100 };
 
        int[] aux = fusionar(X, Y);
 
        System.out.println("Primer Array : " + Arrays.toString(X));
        System.out.println("Segundo Array: " + Arrays.toString(Y));
        System.out.println("Después de fusionar : " + Arrays.toString(aux));
    }
    
 // Función para fusionar dos arrays ordenadas X[] e Y[] desde su extremo
    static int[] fusionar(int[] X, int[] Y){
        int i = X.length - 1, j = Y.length - 1;
        int[] aux = new int[X.length + Y.length];
        int k = 0;
        // mientras haya elementos en la primera y segunda arrays
        while (i >= 0 && j >= 0){
            if (X[i] >= Y[j]) {
                aux[k++] = X[i--];
            }
            else {
                aux[k++] = Y[j--];
            }
        }
        // copia los elementos restantes
        while (i >= 0){
            aux[k++] = X[i--];
        }
        while (j >= 0){
            aux[k++] = Y[j--];
        }
        return aux;
    }
}