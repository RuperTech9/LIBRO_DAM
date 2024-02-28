package tema2.ejemplos;

import java.util.Scanner;

public class Ejercicio_2_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1;
		int num2;
		System.out.println("Introduzca un número: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca otro número: ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("El número " + num1 + " es el mayor");
		} else {
			System.out.println("El número " + num2 + " es el mayor");
			
		}
		sc.close();
	}

}
