package Defensa;

// 5- Crear un programa que cuente los números pares que hay en un array de enteros.

public class Defensa_Array_5 {

	public static void main(String[] args) {
		int tabla[] = {12, 2, 3, 4, 8, 6, 7, 8, 9};
		int contador = 0;
		for (int i=0; i<tabla.length;i++) {
			if (tabla[i] % 2 == 0) {
				contador++;
			}	
		}	
		System.out.println("Pares en el array: " + contador);		
	}	
}
 
