
package tema6.ejemplos;

import java.util.Scanner;

/**
 * Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales
 * La idea es recorrer el nombre, carácter a carácter, comprobando si es una vocal.
 * En el caso de que no sea una vocal concatenaremos el carácter al final de una segunda cadena, que llamaremos sinVocales.
 * Para comprobar si un carácter es una vocal crearemos la función: esVocal().
 *
 * @author Ruper
 */
public class C06_CadenaSinVocales {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String nombre, sinVocales = "";
	char c;
	System.out.println("Escriba su nombre completo: ");
	nombre = sc.nextLine();
	
	for (int i = 0; i < nombre.length(); i++) {
            c = nombre.charAt(i);
            if (!esVocal(c)) {
		sinVocales = sinVocales + c;
            }
	}
	System.out.println(sinVocales);
    }
	
    static boolean esVocal (char c) {
	boolean resultado;
	String vocales = "a,e,i,o,u,á,é,í,ó,ú";	//cadena con todas las vocales posibles.
	c = Character.toLowerCase(c); //convertimos (c) en minúsculas
	if (vocales.indexOf(c)== -1) { //buscamos (c) en la cadena de vocales
            resultado = false;
	}else {
            resultado = true;
	}
	return resultado;
    }
}
