package tema3.ejemplos;

import java.util.Scanner;

public class B06_ForAscendente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		sc.close();

	}

}
