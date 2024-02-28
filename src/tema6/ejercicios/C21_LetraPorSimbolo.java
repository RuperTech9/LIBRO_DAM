
package tema6.ejercicios;

import java.util.Scanner;

/**
 * Escribe un programa que lee una palabra o frase y la devuelve modificada. Cada letra se sustituye por otro símbolo no alfabético. 
 * Por ejemplo la ‘a’ se sustituye por el carácter ‘@’, la ‘e’ por ‘€’, la ‘i’ por ‘1’, etc.
 * 
 * @author Ruper
 */
public class C21_LetraPorSimbolo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;

        System.out.println("Escriba una palabra o frase: ");
        texto = sc.nextLine();
        System.out.println("\nTexto modificado = " + reemplazarCaracteresEspeciales(texto));
    }

    private static String reemplazarCaracteresEspeciales(String palabra) {
        String[] abecedario =           {" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] caracteresEspeciales = {"_", "@", "!", "Ç", "%", "€", "/", "?", "#", "1", "7", "3", "L", "5", "4", "+", "0", "9", "Q", "2", "$", "6", "8", "¿", "^", ":", "=", "*"};

        for (int i = 0; i < abecedario.length; i++) {
            String letraABC = abecedario[i];
            if (palabra.contains(letraABC)) {
                palabra = palabra.replace(letraABC, caracteresEspeciales[i]);
            }
        }
        return palabra;
    }
}
