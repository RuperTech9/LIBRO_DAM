package tema2.ejemplos;

import java.util.Scanner;

public class Ejercicio_2_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia, mes, año;
		System.out.println("Introduzca el día: ");
		dia = sc.nextInt();
		System.out.println("Introduzca el mes: ");
		mes = sc.nextInt();
		System.out.println("Introduzca el año: ");
		año = sc.nextInt();
		
		if (año == 0) {
			System.out.println("Año no existe");
		} else {
			if (mes == 2 && (dia >= 1 && dia <= 28)) {
				System.out.println("Fecha correcta");
			} else {
				if ((mes == 4 | mes == 6 | mes == 9 | mes == 11) && (dia >= 1 && dia <= 30)){
					System.out.println("Fecha correcta");
				} else {
					if ((mes == 1 | mes == 3 | mes == 5 | mes == 7 | mes == 8 | mes == 10 | mes == 12) && (dia >= 1 && dia <= 31)){
						System.out.println("Fecha correcta");
					} else {
						System.out.println("Fecha incorrecta");
					}			
				}	
			}
		}
		sc.close();
	}
}
