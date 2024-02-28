package tema2.ejemplos;

import java.util.Scanner;

public class Ejercicio_2_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1;
		int num2;
		int mayor;
		int menor;
		System.out.println("Introduzca un número: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca otro número: ");
		num2 = sc.nextInt();
		
		mayor = num1>num2 ? num1 : num2;
		menor = num1<num2 ? num1 : num2;
		
		System.out.println(mayor + " - " + menor);
		sc.close();

	}

}
