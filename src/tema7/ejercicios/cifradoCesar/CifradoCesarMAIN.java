
package tema7.ejercicios.cifradoCesar;

/**
 *
 * @author Ruper
 */
public class CifradoCesarMAIN {
    public static void main(String[] args) {
        String mensajeOriginal = "Cifrado Cesar";
        String mensajeCifrado = CifradoCesar.cifrar(mensajeOriginal, 3);
        System.out.println("Mensaje original: " + mensajeOriginal);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);
    }
}
