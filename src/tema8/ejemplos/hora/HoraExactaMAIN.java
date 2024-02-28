
package tema8.ejemplos.hora;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class HoraExactaMAIN {
    static public void main(String[] args) {
	HoraExacta reloj = new HoraExacta (11, 15, 23);
	System.out.println(reloj);
	for (int i = 1; i <= 61; i++) {
            reloj.inc(); // Incrementamos 1 hora y 1 segundo
	}
	System.out.println(reloj);
	System.out.println("Escriba los segundos: ");
	Scanner teclado = new Scanner(System.in);
	int segundos = teclado.nextInt();
	if (reloj.setSegundos(segundos)) {
            System.out.println(reloj);
	} else {
            System.out.println("No es posible cambiar los segundos");
	}
        
        // Comparara si son iguales
        HoraExacta a = new HoraExacta (1, 2, 3);
        HoraExacta b = new HoraExacta (1, 2, 3);
        HoraExacta c = new HoraExacta (10, 20, 30);
        System.out.println("Son iguales las horas: "+ a + " y "+ b);
        System.out.println(a.equals(b));
        System.out.println("Son iguales las horas: "+ a + " y "+ c);
	System.out.println(a.equals(c));
    }
}
