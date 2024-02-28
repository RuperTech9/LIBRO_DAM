package tema3.ejemplos;

import java.util.Scanner;

public class B09_TablaMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("Introduzca un número del 1 al 10: ");
			num = sc.nextInt();
		} while (!(num >= 1 && num <=10));
		System.out.println("\nTabla del " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
		sc.close();
	}

}
