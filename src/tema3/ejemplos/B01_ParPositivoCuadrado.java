package tema3.ejemplos;

import java.util.Scanner;

public class B01_ParPositivoCuadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean esPar, esPositivo;
		System.out.println("Introduzca un número: ");
		int num = sc.nextInt();
		while (num != 0) {
			esPar = num % 2 == 0 ? true : false;
			esPositivo = num >= 0 ? true : false;
			System.out.println("Es par? " + esPar + ". Es Positivo? " + esPositivo);
			System.out.println("Cuadrado: " + num * num);
			System.out.println("Introduzca otro número: ");
			num = sc.nextInt();
		}
		sc.close();

	}

}
