package tema3.ejemplos;

import java.util.Scanner;

public class B14_Triangulos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba n: ");
		int n = sc.nextInt();
		//Triangulo 1
		for (int fila = 1; fila <= n; fila++) {
			for (int col = fila; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		//Triangulo 2
		for (int fila = n; fila >=1; fila--) {
			for (int col = n; col >= fila; col--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		//Triangulo 3
		for (int fila = n; fila >=1; fila--) {
			for (int col = n; col >= fila; col--) {
				System.out.print("* ");
			}
			for (int col = n; col >= fila; col--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		//Triangulo 4
		sc.close();
	}
}
