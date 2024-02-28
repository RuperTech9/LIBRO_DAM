
package tema6.ejercicios;

import java.util.Scanner;

/**
 * Implementa un editor de texto que, una vez que se ha introducido el texto, 
 * permita reemplazar todas las ocurrencias de una palabra por otra.
 * 
 * @author Ruper
 */
public class C24_ReemplazarPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el texto:");
        String texto = scanner.nextLine();

        System.out.println("Palabra a reemplazar:");
        String palabraAntigua = scanner.nextLine();

        System.out.println("Nueva palabra:");
        String palabraNueva = scanner.nextLine();

        String textoModificado = reemplazarPalabra(texto, palabraAntigua, palabraNueva);
        System.out.println("Texto modificado:");
        System.out.println(textoModificado);
    }

    public static String reemplazarPalabra(String texto, String palabraAntigua, String palabraNueva) {
        return texto.replaceAll(palabraAntigua, palabraNueva);
    }
}
/*
            String texto = "Ha estado en un estadio";
	    System.out.println("Frase = " + texto);

	    CharSequence s1 = "a";
	    CharSequence s2 = "o";
	    String remTexto = texto.replace(s1, s2);

	    System.out.println("Nueva Frase = " + remTexto);
*/