
package tema6.ejercicios;

import java.util.Scanner;

/**
 * Escribe una aplicación que convierte una frase (que puede estar escrita con cualquier combinación 
 * de mayúsculas y minúsculas) en el nombre de una variable que utilice la nomenclatura Camel.
 * 
 * @author Ruper
 */
public class C23_NotacionCamel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la frase
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        // Llamar al método para convertir la frase en CamelCase
        String variableCamelCase = convertirCamelCase(frase);
        
        // Imprimir la variable CamelCase
        System.out.println("Variable CamelCase: " + variableCamelCase);
    }

    // Método para convertir la frase en CamelCase
    public static String convertirCamelCase(String frase) {
        String[] palabras = frase.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            if (i == 0) {
                palabra = palabra.isEmpty() ? palabra : palabra.toLowerCase();
            } else {
                palabra = palabra.isEmpty() ? palabra : Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1).toLowerCase();
            }
            resultado.append(palabra);
        }

        return resultado.toString();
    }
}
