package tema2.ejemplos;

import java.util.Scanner;

public class Ejercicio_2_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		System.out.println("Introduzca un numero");
		num=sc.nextDouble();
		
		if (num < 1 && num > -1 && num != 0) {
			System.out.println("El número SI es casi-0");
		} else {
			System.out.println("El número NO es casi-0");
		}
		sc.close();
	}

}
