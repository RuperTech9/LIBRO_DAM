package tema2.ejemplos;

import java.util.Scanner;

public class Ejercicio_2_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir una nota: ");
		int nota = sc.nextInt();
		switch (nota) {
		case 0, 1, 2, 3, 4 -> {
			System.out.println("Insuficiente");
		}
		case 5 -> {
			System.out.println("Suficiente");
		}
		case 6 -> {
			System.out.println("Bién");
		}
		case 7, 8 -> {
			System.out.println("Notable");
		}
		case 9, 10 -> {
			System.out.println("Sobresaliente");
		}
		
		}
		sc.close();

	}

}
