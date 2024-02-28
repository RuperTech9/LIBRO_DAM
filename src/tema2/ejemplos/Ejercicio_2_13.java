package tema2.ejemplos;

import java.util.Scanner;

public class Ejercicio_2_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora, minutos, segundos;
		
		System.out.println("Introduzca la hora");
		hora = sc.nextInt();
		System.out.println("Introduzca los minutos");
		minutos = sc.nextInt();
		System.out.println("Introduzca los segundos");
		segundos = sc.nextInt();
		
		segundos++;
		
		if (segundos > 59) {
			segundos = 0;
			minutos++;
			if (minutos > 59) {
				minutos = 0;
				hora++;
				if (hora > 23) {
					hora = 0;
				}
			}
		}
		System.out.println(hora + ":" + minutos + ":" + segundos);
		sc.close();

	}

}
