package tema4.ejemplos;

import java.util.Scanner;

public class F03_AreaVolumenCilindro {
	static void areaVolumenCilindro (double radio, double altura, int opcion) {
		double volumen, area;
		switch (opcion) {
		case 1 -> {
			volumen = Math.PI * Math.pow(radio, 2) * altura;
			System.out.println("El volumen es de : " + volumen);
		}
		case 2 -> {
			area = 2 * Math.PI * radio * (altura + radio);
			System.out.println("El área es de: " + area);
		}
		default -> System.out.println("Indicador del cálculo erroneo");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca radio: ");
		double radio = sc.nextDouble();
		System.out.println("Introduzca altura: ");
		double altura = sc.nextDouble();
		System.out.println("Qué desea calcular 1 (área)/ 2 (volumen): ");
		int tipoCalculo = sc.nextInt();
		areaVolumenCilindro (radio, altura, tipoCalculo);
		sc.close();
	}

}
