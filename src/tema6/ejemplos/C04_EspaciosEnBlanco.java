
package tema6.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class C04_EspaciosEnBlanco {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String frase;
	int numEspaciosBlanco = 0;
	char c;
	System.out.println("Escriba una frase: ");
	frase = sc.nextLine();
		
	for (int i = 0; i<frase.length(); i++) {
            c = frase.charAt(i);
            if (Character.isSpaceChar(c)) { // equivale a (c == '')
                numEspaciosBlanco++;
            }
	}
	System.out.println("Tiene: " + numEspaciosBlanco + " espacios en blanco");
    }
}
