
package tema7.ejercicios.cifradoCesar;

/**
 *
 * @author Ruper
 */
public class CifradoCesar {
    public static String cifrar(String texto, int paso) {
    	char[] charArray = texto.toCharArray(); //CONVIERTO LA CADENA DE TEXTO EN UN ARREGLO DE CARACTERES LLAMADO CHARARRAY.
        int longitud = charArray.length; //LA LONGITUD DE ESTE ARRAY SE ALMACENA EN LA VARIABLE LONGITUD.
        
        char[] cifrado = new char[longitud]; //CREO UN NUEVO ARRAY DE CARACTERES LLAMADO CIFRADO CON LA MISMA LONGITUD QUE CHARARRAY

        for (int i = 0; i < longitud; i++) { //EL MÉTODO ITERA SOBRE CADA CARÁCTER EN CHARARRAY UTILIZANDO UN CICLO FOR.
            char c = (char) (charArray[i] + paso); //PARA CADA CARÁCTER, SE LE SUMA EL PASO Y SE ALMACENA EL RESULTADO EN LA VARIABLE C.
            if (c > 'z') {
                cifrado[i] = (char) (charArray[i] - (26 - paso)); // SE CALCULA EL CARÁCTER CIFRADO RESTANDO (26 - PASO) DEL CARÁCTER ORIGINAL EN CHARARRAY.
            } else {
                cifrado[i] = c; //DE LO CONTRARIO, SE ALMACENA EL CARÁCTER C EN EL ARREGLO CIFRADO.
            }
        }
        return new String(cifrado);//SE RETORNA UNA NUEVA CADENA DE TEXTO CONSTRUIDA A PARTIR DEL ARRAY CIFRADO.
    }
    
    public static String cifrar2(String texto, int n) {
        StringBuilder textoCifrado = new StringBuilder(); // StringBuilder para construir el texto cifrado de manera eficiente
        char c;
        for (int i = 0; i < texto.length(); i++) { // Recorremos cada caracter del texto original
            c = texto.charAt(i);
            
            if (Character.isLetter(c)) { // Comprobamos si el caracter actual es una letra
                char base = (Character.isLowerCase(c)) ? 'a' : 'A'; // Determinamos la base del alfabeto según si el caracter es mayúscula o minúscula
                int desplazamiento = (c - base + n) % 26; // Calculamos el desplazamiento dentro del alfabeto con el valor de n
                c = (char) (base + desplazamiento); // Aplicamos el desplazamiento para obtener el nuevo caracter cifrado
            }
            textoCifrado.append(c); // Agregamos el caracter cifrado (o el original si no es una letra) al texto cifrado
        }
        return textoCifrado.toString(); // Convertimos el StringBuilder a String y devuelve el texto cifrado
    }
}
