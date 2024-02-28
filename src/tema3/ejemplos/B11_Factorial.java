package tema3.ejemplos;

import java.util.Scanner;

public class B11_Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double factorial;
		int num;
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		factorial = 1;
		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println("El factorial de " + num + " es: " + factorial);
		sc.close();
	}

}
