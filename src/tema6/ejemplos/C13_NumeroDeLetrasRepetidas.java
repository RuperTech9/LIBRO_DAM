
package tema6.ejemplos;

import java.util.Scanner;

/**
 * Diseñar un algoritmo que lea del teclado una frase e indique, para cada letra que aparece en
 * la frase, cuantas veces se repite. Se consideran iguales las letras mayúsculas y las minúsculas
 * para realizar la cuenta.
 * 
 * Vamos a utilizar una tabla de contadores (numVeces) donde cada elemento de la tabla corresponde a una letra
 * y donde se almacena el número de veces que aparece en la frase dicha letra. numVeces tendrá tantos elementos
 * como letras tiene el alfabeto, es decir, 'z'-'a'+1 elementos. Las letras del abecedario tienen valores Unicode correlativos.
 * A un carácter cualquiera c, le corresponde el elemento de la tabla con posición c-'a' : numVeces[c-'a'], se incrementa
 * cada vez que haya una ocurrencia de c en la frase
 * 
 * @author Ruper
 */
public class C13_NumeroDeLetrasRepetidas {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String frase;
	int [] numVeces;		//contador de las ocurrencias de cada letra
	System.out.print("Frase: ");
	frase = sc.nextLine();
	//para contabilizar también las mayúsculas pasamos todo a minúsculas.
	frase = frase.toLowerCase();	
	//Cada posición de numVeces guardará el número de ocurrencias de una letra.
	//numVeces[0] para la 'a', numVeces[1] para la 'b', numVeces[2] para la 'c'...
	numVeces = new int['z' - 'a' + 1];	//tantas componentes como letras.
	//La tablas se crea con todos los elementos inicializados a 0
	for (int i = 0; i < frase.length(); i++) {	//recorre la frase carácter a carácter
            if (Character.isLetter(frase.charAt(i))) {	//si el i-ésimo carácter es una letra
		numVeces[frase.charAt(i) - 'a']++;		//incrementamos el contador de esa letra
            }
	}
	for (int i = 0; i < 'z' - 'a' +1; i++) {	//mostramos numVeces
            if (numVeces[i] != 0) {					//solo las letras que aparecen en la frase
		System.out.println("La letras " + (char) (i+'a') + " se repite " + numVeces[i] + " veces");
            }
	}
    }
}
