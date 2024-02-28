
package tema6.ejemplos;

import java.util.Scanner;

/**
 * Diseñar el juego «Acierta la contraseña»:
 * El primer jugador introduce la contraseña; a continuación, el segundo jugador debe teclear palabras hasta que la acierte.
 * a) Hacer una versión en la que se indica al jugador si la palabra es mayor o menor alfabéticamente que la contraseña.
 * 
 * @author Ruper
 */
public class C03_AciertaContraseñaCompareTo {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String passwd, palabra;
	System.out.println("Jugador 1. Introduzca la contraseña: ");
        passwd = sc.nextLine();
		
        do {
            System.out.println("Jugador 2. Palabra: ");
            palabra = sc.nextLine();
            int comparacion = passwd.compareTo(palabra);
            if (comparacion == 0) {
		System.out.println("!Acertaste¡");
            }else if (comparacion < 0){
		System.out.println("La contraseña es menor que: " + palabra);
            } else {
		System.out.println("La contraseña es mayor que: " + palabra);
            }
	}while (!passwd.equals(palabra));
    }
}
