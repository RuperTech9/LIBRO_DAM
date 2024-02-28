package tema3.ejemplos;

import java.util.Scanner;

public class B03_JuegoNumSecreto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroSecreto = (int) (Math.random()* 100 + 1);
		System.out.println("Introduzca un número entre 1 y 100: ");
		int num = sc.nextInt();
		
		while (numeroSecreto != num && num != -1) {
			if (numeroSecreto > num) {
				System.out.println("El número secreto es mayor");
			} else {
				System.out.println("El numero secreto es menor");
			}
			System.out.println("Introduzca otro número");
			num = sc.nextInt();
		}
		if (numeroSecreto == num) {
			System.out.println("El número secreto es correcto");
		} else {
			System.out.println("Otra vez será...");
		}
		sc.close();

	}

}
