
package tema6.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class C07_BuscarPalabraNumVeces {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String frase, palabra;
	int veces = 0, pos;					//variables contador y posicion
	System.out.println("Introduzca una frase: ");
	frase = sc.nextLine();
	System.out.println("Introduzca una palabra: ");
	palabra = sc.nextLine();
	pos = frase.indexOf(palabra);		//buscamos la primera ocurrencia
	
	while (pos != -1) {					//mientras pos no sea -1, no hemos encontrado la palabra
            veces++;						//si hemos encontrado una ocurrencia, incrementamos veces
            pos = frase.toLowerCase().indexOf(palabra, pos + 1); //volvemos a buscar a partir de la posición siguiente por si encontramos otra ocurrencia de palabra	
	}
	//cuando salimos del bucle es que ya no existen más ocurrencias
		
	if (veces == 0) {		//no hemos encontrado la palabra en la frase
            System.out.println("\"" +palabra+ "\" no se encuentra en la frase.");
	}else {
            System.out.println("\"" +palabra+ "\" esta " +veces+ " veces.");
	}
    }
}
