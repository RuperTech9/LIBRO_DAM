
package tema6.ejemplos;

import java.util.Scanner;

/**
 * Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es decir,
 * que la frase sea igual leyendo de izquierda a derecha o de derecha a izquierda, sin tener en
 * cuenta los espacios. Un ejemplo de frase palíndroma es: «Dabale arroz a la zorra el abad».
 * Las vocales con tilde hacen que los algoritmos consideren una frase palíndroma como si no
 * lo fuese. Por esto, supondremos que el usuario introduce la frase sin tildes.
 * 
 * La frase "Dabale arroz a la zorra el abad" es palíndroma si no tenemos en cuenta los espacios en blanco.
 * Por lo tanto, lo primero que tenemos que hacer, es eliminarlos. A continuación, vamos a construir la frase invertida. 
 * Si ambas, original e invertida, coinciden es porque la frase original es palíndroma.
 * Nota: escribiremos las frases sin vocales acentuadas.
 * 
 * @author Ruper
 */
public class C10_Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, sinEspacios, invertida;
        System.out.println("Introduzca una frase: ");
        frase = sc.nextLine();
        frase = frase.toLowerCase(); // trabajaremos con las letras en minúsculas
        sinEspacios = eliminaEspacios(frase); // Llamada a la función sinEspacios devuelve "una cadena sin espacios"
        invertida = alReves(sinEspacios); // Llamada a la función alReves
        if (sinEspacios.equals(invertida)) {
            System.out.println("La frase es palíndroma");
        } else {
            System.out.println("La frase no es palíndroma");
        }
    }

    static String eliminaEspacios(String cadena) {
        String sin = "";
        for (int i = 0; i < cadena.length(); i++) { // recorremos la cadena
            char c = cadena.charAt(i); // miramos el carácter en la i-ésima posición
            if (!Character.isWhitespace(c)) { // si no es un carácter blanco
                sin = sin + c; // construimos la cadena sin con c (que no es un blanco)
            }
        }
        return sin;
    }

    static String alReves(String original) {
        String nueva = "";
        for (int i = 0; i < original.length(); i++) {
            nueva = original.charAt(i) + nueva;
        }
        return nueva;
    }
}
