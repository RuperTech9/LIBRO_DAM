package Defensa;
import java.util.Arrays;

//Crear un programa que asigna a los elementos pares el valor de su índice, y a los elementos impares el valor 1.

public class Defensa_Array_Fer {

	public static void main(String[] args) {
		int tabla[] = {0,1,2,3,4,5,6,7,8,9};
		
		for (int i=0; i<tabla.length;i++) {
			if (i%2==0) {
				tabla[i] = i;
			}else {
				tabla[i] = 1;
			}			
		}
		System.out.println("Array2: " + Arrays.toString(tabla));		
	}	
}

//El programa declara un arreglo de enteros arrcon cinco elementos, todos con el valor 0. 
//Luego, use un bucle forpara recorrer el arreglo y cambiar cada elemento de 0 a 1 usando un operador ternario.
//Finalmente, se imprime el array modificado.