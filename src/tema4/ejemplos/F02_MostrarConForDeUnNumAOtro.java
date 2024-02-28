package tema4.ejemplos;

import java.util.Scanner;

public class F02_MostrarConForDeUnNumAOtro {
	static void mostrar (int a, int b) {
		int mayor = a > b ? a : b;
		int menor = a < b ? a : b;
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca primer número");
		int a = sc.nextInt();
		System.out.println("Introduzca segundo número");
		int b = sc.nextInt();
		mostrar(a, b);
		sc.close();
	}

}
