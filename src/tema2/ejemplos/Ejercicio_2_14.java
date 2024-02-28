package tema2.ejemplos;

import java.util.Scanner;

public class Ejercicio_2_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diaDelMes = 0;
		System.out.println("Introduzca el día: ");
		int dia = sc.nextInt();
		System.out.println("Introduzca el mes: ");
		int mes = sc.nextInt();
		System.out.println("Introduzca el año: ");
		int año = sc.nextInt();
		
		diaDelMes = switch(mes) {
		case 2 -> 28;
		case 4, 6, 9, 11 -> 30;
		default -> 31;
		};
		
		dia++;
		if (dia > diaDelMes) {
			dia = 1;
			mes++;
			if (mes > 12) {
				mes = 1;
				año++;
			}
		}
		if (año == 0) {
			año = 1;
		}
		System.out.println(dia + "/" + mes + "/" +año);
		sc.close();
	}

}
