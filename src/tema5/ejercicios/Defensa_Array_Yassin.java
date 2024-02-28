package Defensa;

//Crear un programa en java que elimine el primer resultado de un número que encuentre en un array de enteros.

public class Defensa_Array_Yassin {

	public static void main(String[] args) {
		int[] tabla = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	    int numeroBorrar = 3;
	    int indiceEliminar = -1;
	    
	    //bucle for para encontrar el primer número en el array que coincide con numeroBorrar y almacenar su índice en indiceEliminar.
	    for (int i = 0; i < tabla.length; i++) {
	      if (tabla[i] == numeroBorrar) {
	    	  indiceEliminar = i;
	        break;
	      }
	    }
	    //Si se encuentra un número coincidente, se usa otro bucle for para desplazar todos los elementos después del índice hacia la izquierda, 
	    //sobrescribiendo el elemento que se desea eliminar.
	    if (indiceEliminar != -1) {
	      for (int i = indiceEliminar; i < tabla.length - 1; i++) {
	    	  tabla[i] = tabla[i + 1];
	      }
	    }
	    System.out.println("Array después de eliminar el primer número " + numeroBorrar + ": ");
	    for (int i = 0; i < tabla.length -1; i++) {
	      System.out.print(tabla[i] + " ");
	    }
	 }
}

/* El programa declara un array de enteros tabla, un número numeroBorrar que se desea eliminar y una variable indiceEliminar inicializada en -1. 
 * Luego, usa un bucle for para encontrar el primer número en el array que coincide con numeroBorrar y almacenar su índice en indiceEliminar. 
 * Si se encuentra un número coincidente, se usa otro bucle for para desplazar todos los elementos después del índice hacia la izquierda, 
 * sobrescribiendo el elemento que se desea eliminar. Finalmente, se imprime el array modificado.*/