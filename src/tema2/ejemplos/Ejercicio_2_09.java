package tema2.ejemplos;

import java.util.Scanner;

public class Ejercicio_2_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entre 0 y 99.999");
		int num = sc.nextInt();
		
		if (num < 10) {
			System.out.println("El número tiene 1 cifra");
		} else {
			if (num < 100) {
				System.out.println("El número tiene 2 cifras");
			} else {
				if (num < 1000) {
					System.out.println("El número tiene 3 cifras");
				} else {
					if (num < 10000) {
						System.out.println("El número tiene 4 cifras");
					} else {
						if (num < 100000) {
							System.out.println("El número tiene 5 cifras");
						}
					}
				}
			}
		}
		sc.close();
	}

}
