package tema5.ejemplos;


import java.util.Arrays;

public class A09_NumeroAciertosApuesta {
	
	public static void main(String[] args) {
		int sorteo122[]= {11, 20, 25, 31, 38, 41};
		int miApuesta[]= {41, 12, 49, 25, 8, 38};
		System.out.println(primitiva(miApuesta, sorteo122));
	}
	
	static int primitiva(int apuesta[], int sorteo[]) {
		int aciertos=0;
		for (int i = 0; i<apuesta.length; i++) {
			int misNumeros = apuesta[i];
			if(Arrays.binarySearch(sorteo, misNumeros)>0) {
				aciertos++;
				System.out.println("Encontrado el "+misNumeros);
			}
		}
		System.out.print("Número de aciertos: ");
		return aciertos;
	}
}


