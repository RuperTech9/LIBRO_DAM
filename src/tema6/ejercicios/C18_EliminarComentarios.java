
package tema6.ejercicios;

//El preprocesador del lenguaje C elimina los comentarios (/* …*/) 

import java.util.Scanner;

//del código fuente antes de compilar.
//Diseña un programa que lea por teclado una sentencia en C y elimine los comentarios.
//Sentencia: if(a==3) /* igual a 3 */ a++; /* incrementamos a */ 
//Salida: if(a==3) a++;
/**
 * 
 * @author Ruper
 */
public class C18_EliminarComentarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una sentencia en C:");
        String sentencia = scanner.nextLine();
        String sentenciaSinComentarios = eliminarComentarios(sentencia);
        System.out.println("Sentencia sin comentarios:");
        System.out.println(sentenciaSinComentarios);
    }

    public static String eliminarComentarios(String sentencia) {
        StringBuilder resultado = new StringBuilder();
        boolean dentroComentario = false;
        for (int i = 0; i < sentencia.length(); i++) {
            char caracter = sentencia.charAt(i);
            if (!dentroComentario) {
                if (caracter == '/' && i < sentencia.length() - 1 && sentencia.charAt(i + 1) == '*') {
                    dentroComentario = true;
                    i++; // Saltamos el siguiente caracter '*'
                } else {
                    resultado.append(caracter);
                }
            } else {
                if (caracter == '*' && i < sentencia.length() - 1 && sentencia.charAt(i + 1) == '/') {
                    dentroComentario = false;
                    i++; // Saltamos el siguiente caracter '/'
                }
            }
        }
        return resultado.toString();
    }
}
