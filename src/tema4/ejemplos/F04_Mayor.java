package tema4.ejemplos;

import java.util.Scanner;

public class F04_Mayor {
	static int maximo (int a, int b) {
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int num1 = sc.nextInt();
		System.out.println("Introduzca otro número: ");
		int num2 = sc.nextInt();
		System.out.println("El mayor es: " + maximo (num1, num2));
		
		sc.close();
	}

}
