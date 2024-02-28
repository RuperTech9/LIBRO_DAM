package tema2.ejemplos;

import java.util.Scanner;

public class Ejercicio_2_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		int num = sc.nextInt();
		if (num%2==0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
		sc.close();

	}

}
