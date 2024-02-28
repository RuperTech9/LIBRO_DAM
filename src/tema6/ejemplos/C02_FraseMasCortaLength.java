
package tema6.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class C02_FraseMasCortaLength {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Primera frase: ");
	String frase1 = sc.nextLine();
	System.out.println("Segunda frase: ");
	String frase2 = sc.nextLine();
		
	int longFrase1 = frase1.length();
	int longFrase2 = frase2.length();
		
	if (longFrase1 == longFrase2) {
            System.out.println("Son de la misma lomgitud");	
	}else if (longFrase1<longFrase2) {
            System.out.println(frase1 + " es más corta que: " + frase2);
	}else {
            System.out.println(frase2 + " es más corta que: " + frase1);
        }
    }
}

