package tema4.ejemplos;

import java.util.Scanner;

public class F05_EsVocal {
	static boolean esVocal (char c) {
		boolean resultado;
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
			c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("La i es una vocal " + esVocal('i'));
		System.out.println("La E es una vocal " + esVocal('E'));
		System.out.println("La F es una vocal " + esVocal('F'));
		sc.close();
	}
}
