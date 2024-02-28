
package tema6.ejemplos;

/**
 *
 * @author Ruper
 */
public class C01_SimbolosUnicode {
    public static void main(String[] args) {
        // for (int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
	for (int codePoint = 0; codePoint <= 256; codePoint++) {
            String xxxx= Integer.toHexString(codePoint); // convierte un número en su representación hexadecimal
            System.out.println(xxxx + ": " + (char)codePoint);
	}
    }
}
