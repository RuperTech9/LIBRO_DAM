
package tema6.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class C16_DescodificarTexto {
    public static void main(String[] args) {
        //----------------------------------------------------------------------------------------------------------------------------------------
        // VARIABLES
        final char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        final char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        char copia[];   // tabla que contendrá la codificación del texto introducido
        String texto;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un texto a codificar: ");
        texto = sc.nextLine();
        texto = texto.toLowerCase();    // convertimos el texto a minúscula, para poder codificar las mayúsculas y minúsculas con el mismo conjunto.
        copia = new char[texto.length()];    // creamos una tabla de igual tamaño que texto

        //----------------------------------------------------------------------------------------------------------------------------------------
        // CODIFICAR
        for (int i = 0; i < texto.length(); i++) {
            // codificamos el i-ésimo carácter del texto
            copia[i] = codifica(conjunto1, conjunto2, texto.charAt(i));
        }
        texto = String.valueOf(copia);    // convertimos la tabla con la codificación en una cadena
        System.out.println("\nTexto codificado");
        System.out.println(texto);

        //----------------------------------------------------------------------------------------------------------------------------------------
        // DESCODIFICAR
        for (int i = 0; i < texto.length(); i++) {
            copia[i] = descodifica(conjunto2, conjunto1, texto.charAt(i));
        }
        texto = String.valueOf(copia);
        System.out.println("\nTexto descodificado otra vez");
        System.out.println(texto);

        sc.close();
    }

    //----------------------------------------------------------------------------------------------------------------------------------------
    // FUNCION CODIFICAR
    // Esta función codifica el carácter c según los alfabetos conjunto 1 y 2. Buscamos el carácter c en conjunto1.
    // Si se encuentra en la posición pos, se devuelve el carácter equivalente en el segundo conjunto: conjunto2 [pos]
    // En caso de no encontrar c en conjunto 1 se devuelve c sin codificar.
    static char codifica(char conjunto1[], char conjunto2[], char c) {
        final String conj1 = String.valueOf(conjunto1);    // conj1 es un String con los elementos de la tabla conjunto1
        char codificado;    // carácter codificado correspondiente a c
        int pos = conj1.indexOf(c);    // buscamos c en el conjunto1. Al ser conj1 una cadena, indexOf() busca por nosotros.
        // En otro caso tendríamos que buscar mediante un bucle un elemento en una tabla
        if (pos == -1) {    // si no hemos encontrado c en conj1
            codificado = c;    // no podemos codificar, devolvemos c
        } else {
            codificado = conjunto2[pos];    // pos marca la posición de c en conjunto1, entonces elegimos el correspondiente en conjunto2
        }
        return codificado;
    }

    //----------------------------------------------------------------------------------------------------------------------------------------
    // FUNCION DESCODIFICAR
    static char descodifica(char conjunto2[], char conjunto1[], char c) {
        final String conj2 = String.valueOf(conjunto2);    // conj2 es un String con los elementos de la tabla conjunto2
        char descodificado;    // carácter codificado correspondiente a c
        int pos = conj2.indexOf(c);    // buscamos c en el conjunto2. Al ser conj2 una cadena, indexOf() busca por nosotros.
        // En otro caso tendríamos que buscar mediante un bucle un elemento en una tabla
        if (pos == -1) {    // si no hemos encontrado c en conj2
            descodificado = c;    // no podemos codificar, devolvemos c
        } else {
            descodificado = conjunto1[pos];    // pos marca la posición de c en conjunto2, entonces elegimos el correspondiente en conjunto1
        }
        return descodificado;
    }
}
