
package tema6.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Para que dos palabras sean anagramas tienen que tener la misma longitud y las mismas letras el mismo número de veces.
 * Lo que haremos es ordenar las letras de cada palabra y comprobar si son iguales.
 * 
 * @author Ruper
 */
public class C12_Anagramas {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String palabra1, palabra2;
	System.out.println("Escribe una palabra: ");
	palabra1 = sc.next(); //solo lee una palabra
	palabra1 = palabra1.toLowerCase(); //convertimos a minúsculas
	System.out.println("Escribe otra: ");
	palabra2 = sc.next();
	palabra2 = palabra2.toLowerCase(); //convertimos a minúsculas
	
        if (palabra1.length() != palabra2.length()) { //Comprobamos si son de distinto tamaño
            System.out.println("No son anagramas");
	}else {
            char p1[] = palabra1.toCharArray();	//es más facil ordenar una tabla
            char p2[] = palabra2.toCharArray();	//convertimos las palabras a tablas
            Arrays.sort(p1); //ordenamos ambas tablas
            Arrays.sort(p2);
            
            if (Arrays.equals(p1, p2)) { //si las tablas son iguales tienen las mismas letras
                System.out.println("Son anagramas");
            }else {
                System.out.println("No son anagramas");
            }
        }

    }
}
