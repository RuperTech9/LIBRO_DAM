
package tema6.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class C05_CadenaInvertida {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String antes, despues;
	System.out.println("Escriba una cadena: ");
	antes = sc.nextLine();
	despues = alReves(antes);
	System.out.println(despues);

    }
	
    static String alReves (String original) {
	String nueva = "";
	for (int i = 0; i<original.length(); i++) {
            nueva = original.charAt(i) + nueva;
	}
	return nueva;
    }
}
