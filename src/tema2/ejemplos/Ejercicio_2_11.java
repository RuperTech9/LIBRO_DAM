package tema2.ejemplos;

import java.util.Scanner;

public class Ejercicio_2_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir un número del 1 al 7: ");
		int num = sc.nextInt();
		switch (num) {
		case 1 -> System.out.println("Lunes");
		
		case 2 -> System.out.println("Martes");
		
		case 3 -> System.out.println("Miércoles");
		
		case 4 -> System.out.println("Jueves");
		
		case 5 -> System.out.println("Viernes");
		
		case 6 -> System.out.println("Sábado");
		
		case 7 -> System.out.println("Domingo");
		}
		sc.close();

	}

}
