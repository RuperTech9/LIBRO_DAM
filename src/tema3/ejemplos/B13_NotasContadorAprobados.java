package tema3.ejemplos;

import java.util.Scanner;

public class B13_NotasContadorAprobados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aprobados = 0;
		int suspensos = 0;
		int condicionados = 0;
		
		for (int i = 1; i < 6; i++) {
			System.out.println("Nota del alumno número " + i);
			int nota = sc.nextInt();
			if (nota == 4) {
				condicionados++;
			} else if (nota >= 5) {
				aprobados++;
			} else if (nota < 4) {
				suspensos++;
			}
		}
		System.out.println("Aprobados: " + aprobados);
		System.out.println("Condicionados: " + condicionados);
		System.out.println("Suspensos: " + suspensos);
		sc.close();

	}

}
