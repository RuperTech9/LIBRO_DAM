package tema3.ejemplos;

import java.util.Scanner;

public class B08_ForMediaSuma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int suma = 0;
		double media;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Escriba un número: ");
			num = sc.nextInt();
			suma += num;
		}
		media = suma / 10.0;
		System.out.println("Media: " + media);
		sc.close();

	}

}
