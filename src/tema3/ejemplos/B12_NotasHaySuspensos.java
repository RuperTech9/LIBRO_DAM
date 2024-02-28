package tema3.ejemplos;

import java.util.Scanner;

public class B12_NotasHaySuspensos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean suspenso = false;
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca una nota del 0 al 10: ");
			int nota = sc.nextInt();
			if (nota < 5) {
				suspenso = true;
			}
		}
		if (suspenso) {
			System.out.println("\nHay alumnos suspensos");
		} else {
			System.out.println("\nNo hay suspensos");
		}
		sc.close();
	}
}
