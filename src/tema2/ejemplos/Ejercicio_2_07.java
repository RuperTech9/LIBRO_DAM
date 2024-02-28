package tema2.ejemplos;

import java.util.Scanner;

public class Ejercicio_2_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		System.out.println("Introduzca el primer número");
		n1 = sc.nextInt();
		System.out.println("Introduzca el segundo número");
		n2 = sc.nextInt();
		System.out.println("Introduzca el tercer número");
		n3 = sc.nextInt();
		
		if (n1 > n2 && n2 > n3) {
			System.out.println(n1 + ", " + n2 + ", " + n3);
		}else if (n1 > n3 && n3 > n2) {
			System.out.println(n1 + ", " + n3 + ", " + n2);
		}else if (n2 > n1 && n1 > n3) {
			System.out.println(n2 + ", " + n1 + ", " + n3);
		}else if (n2 > n3 && n3 > n1) {
			System.out.println(n2 + ", " + n1 + ", " + n3);
		}else if (n3 > n1 && n1 > n2) {
			System.out.println(n3 + ", " + n2 + ", " + n1);
		}else if (n3 > n2 && n2 > n1) {
			System.out.println(n3 + ", " + n2 + ", " + n1);
		}
		sc.close();

	}

}
