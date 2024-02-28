package tema2.ejemplos;

import java.util.*;


public class Ejercicio_2_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		double a, b, c;		//coeficientes ax2 + bx + c = 0
		double x1, x2, d; 	//soluciones y discriminante
		
		System.out.println("Introduzca el primer coeficiente");
		a = sc.nextDouble();
		System.out.println("Introduzca el segundo coeficiente");
		b = sc.nextDouble();
		System.out.println("Introduzca el tercer coeficiente");
		c = sc.nextDouble();
		
		d = (b * b - 4 * a * c);	//calculamos el discriminante
		if (d < 0) {				//raiz cuadrada de 'd' no puede ser negativo
			System.out.println("No existen soluciones reales");
		} else {
			if (a == 0) {			//se produce una división por '0' no sería ni ecuación de 2º grado
				System.out.println("No es una ecuación de segundo grado");
			} else {
				x1 = (-b + Math.sqrt(d))/(2 * a);
				x2 = (-b - Math.sqrt(d))/(2 * a);
				System.out.println("Solución 1: " + x1);
				System.out.println("Solución 2: " + x2);
			}
		}
		sc.close();
	}

}
