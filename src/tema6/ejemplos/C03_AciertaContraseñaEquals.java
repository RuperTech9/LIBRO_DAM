
package tema6.ejemplos;

import java.util.Scanner;

/**
 * Diseñar el juego «Acierta la contraseña»:
 * El primer jugador introduce la contraseña; a continuación, el segundo jugador debe teclear palabras hasta que la acierte.
 * b) Hacer otra versión en la que el programa mostrará la longitud de la contraseña y una cadena con los
 * caracteres acertados en sus lugares respectivos y asteriscos en los no acertados.
 * 
 * @author Ruper
 */
public class C03_AciertaContraseñaEquals {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String passwd, palabra;
	System.out.println("Jugador 1. Introduzca la contraseña: ");
	passwd = sc.nextLine();
	System.out.println("La contraseña tiene "+ passwd.length() + " caracteres");
	System.out.println("Jugador 2. Palabra: ");
	palabra = sc.nextLine();

        while (!palabra.equals(passwd)) {
            String pista = "";
			
            for (int i=0; i<passwd.length();i++) {
		if (passwd.charAt(i)== palabra.charAt(i)) {
                    pista += passwd.charAt(i);
		}else {
                    pista += '*';
		}
            }
            System.out.println(pista);
            System.out.println("Jugador 2. Introduzca la palabra de nuevo: ");
            palabra = sc.next();	
	}
	System.out.println("!Acertaste¡");
    }
}
