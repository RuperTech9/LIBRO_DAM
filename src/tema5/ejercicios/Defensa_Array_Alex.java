package Defensa;
import java.util.Arrays;

// 7- Crear un programa en java que divida un array de 10 elementos en dos arrays de 5 elementos.

public class Defensa_Array_Alex {

	public static void main(String[] args) {
		int[] tabla = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    int[] array1 = new int[5];
	    int[] array2 = new int[5];
	    for (int i = 0; i < 5; i++) {
	    	array1[i] = tabla[i];
	    }
	    for (int i = 0; i < 5; i++) {
	    	array2[i] = tabla[i + 5];
	    }
	    System.out.println("Array1: " + Arrays.toString(array1));  
	    System.out.println("Array2: " + Arrays.toString(array2));
	}
}


/* El programa declara un array de enteros arr y dos arrays de enteros arr1 y arr2 con cinco elementos cada uno. 
 * Luego, usa dos bucles for para copiar los primeros y los últimos cinco elementos de tabla a array1 y array2, respectivamente. 
 * Finalmente, se imprimen ambos arrays.*/
