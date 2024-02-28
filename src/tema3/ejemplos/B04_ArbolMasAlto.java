package tema3.ejemplos;

import java.util.Scanner;

public class B04_ArbolMasAlto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int etiquetaArbolMasAlto;
		int alturaArbolMasAlto;
		int etiqueta = 0;
		int altura;
		System.out.println("Altura del arbol " + etiqueta + " : ");
		altura = sc.nextInt();
		alturaArbolMasAlto = altura;
		etiquetaArbolMasAlto = 0;
		
		while (altura != -1) {
			if (altura > alturaArbolMasAlto) {
				alturaArbolMasAlto = altura;
				etiquetaArbolMasAlto = etiqueta;
			}
			etiqueta++;
			System.out.println("Altura del arbol " + etiqueta + " : ");
			altura = sc.nextInt();
			
		}
		if (alturaArbolMasAlto == -1) {
			System.out.println("No hay ningún arbol");
		} else {
			System.out.println("El arbol más alto mide: " + alturaArbolMasAlto);
			System.out.println("Etiqueta del arbol: " + etiquetaArbolMasAlto);
		}
		sc.close();
	}

}
