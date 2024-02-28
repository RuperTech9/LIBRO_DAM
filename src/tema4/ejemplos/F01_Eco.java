package tema4.ejemplos;

import java.util.Scanner;

public class F01_Eco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int n = sc.nextInt();
		System.out.println("--- Antes de llamar a la función ---");
		eco(n);
		sc.close();
	}
	
	static void eco (int a) {
		for (int i = 0; i < a; i++) {
			System.out.println("Eco...");
		}
	}
}
