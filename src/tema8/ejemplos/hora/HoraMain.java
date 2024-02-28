
package tema8.ejemplos.hora;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class HoraMain {
    public static void main(String[] args) {
	Hora hora_actual = new Hora(11, 30);
	System.out.println(hora_actual);
	for (int i= 0; i <=61; i++) { // Incrementamos 61 segundos
            hora_actual.inc();
	}
	System.out.println(hora_actual);
	Scanner sc = new Scanner(System.in);
	System.out.println("Escriba una hora: ");
	int hora = sc.nextInt();
	boolean cambio = hora_actual.setHora(hora);
	if (cambio) {
            System.out.println(hora_actual);
	} else {
            System.out.println("La hora no se puede cambiar");
	}
    }
}
