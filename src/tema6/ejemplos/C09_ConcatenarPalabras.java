
package tema6.ejemplos;

import java.util.Scanner;

/**
 * Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las
 * palabras introducidas con espacios en blanco. Terminar de leer la frase cuando alguna de las
 * palabras introducidas sea la cadena «fin» escrita con cualquier combinación de mayúsculas
 * y/o minúsculas. La cadena «fin» no aparecerá en la frase final.
 * 
 * @author Ruper
 */
public class C09_ConcatenarPalabras {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String frase = "", palabra;//frase debe inicializarse con la cadena vacía ya que vamos a concatenarle otra cadena.
	//leemos la primera palabra fuera del bucle por si es "fin".
	System.out.println("Escribe una palabra: ");
	palabra = sc.next();	//solo leemos una palabra
		
	while (!palabra.toLowerCase().equals("fin")) {
            frase = frase + "" + palabra;	//concatenamos la palabra al final de la frase, con un espacio en blanco.
            //La primera vez, frase está inicializada con la cadena vacía. Si no, produciría un error.
            System.out.println("Escribe una palabra: ");
            palabra = sc. next();
	}
	//Sea cual sea la combinación de mayúsculas/minúsculas de palabra, la convertimos a minúscula para compararla con "fin".
	//Se podría convertir a mayúsculas y comparar con "FIN"
	System.out.println(frase);	//mostramos el resultado
    }
}
